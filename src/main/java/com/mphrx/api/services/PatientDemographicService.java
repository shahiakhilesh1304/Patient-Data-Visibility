package com.mphrx.api.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mphrx.api.DTO.Address;
import com.mphrx.api.DTO.Entry;
import com.mphrx.api.DTO.Link;
import com.mphrx.api.DTO.Name;
import com.mphrx.api.DTO.Resource;
import com.mphrx.api.DTO.Telecom;
import com.mphrx.api.patientxsdpojo.Demographic;
import com.mphrx.api.patientxsdpojo.DemographyRequest;
import com.mphrx.api.patientxsdpojo.DemographyResponse;
import com.mphrx.api.reqres.FhirRespnse;
import com.mphrx.api.utility.APICaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PatientDemographicService
{

    public static final Logger log = LoggerFactory.getLogger(PatientDemographicService.class);
    @Autowired
    APICaller apiCall;


    ObjectMapper mapper = new ObjectMapper();
    public DemographyResponse getPatientDemoGraphic(DemographyRequest request)
    {
        DemographyResponse response = new DemographyResponse();
        try{
            String patientId = request.getPatientId();
            log.info("The request has been formed {}",mapper.writeValueAsString(request));
            log.info("Goingg to call an API");
            FhirRespnse responseF = this.apiCall.patient_Demographic_Fetch(patientId);
            if(responseF != null)
            {
                Demographic demographic = new Demographic();
                log.info("The response from an api has been receieved {}",mapper.writeValueAsString(responseF));
                log.info("Parsing the json to soap api response...0");
                List<Entry> entry = responseF.getEntry();
                List<Link> link = responseF.getLink();
                response.setRegistrationPhysicalPerson(patientId);
                demographic.setUnidentifiablepatientReason(" ");
                demographic.setSchooling(" ");
                demographic.setProfession(" ");
                demographic.setBreed(" ");
                response.setPatientDemographic(demographic);
                for(Entry e:entry)
                {
                	Resource resource = e.getResource();
                	if(resource != null)
                	{
                		List<Name> name = resource.getName();
                		if(name.size() > 0) {
                			for(Name n : name) {
                			response.setPatientName(n.getText());
 
                			}
                		}
                		response.setDob(resource.getBirthDate());
                		response.setNameOfMother(" ");
                		response.setGender(resource.getGender());
                		response.setMaritalStatus("");
                		List<Address> address = resource.getAddress();
                		if(address.size()>0) {
                			for(Address a:address) {
                				response.setCountry(a.getCountry());
                				response.setAddressType("HOME");
                				response.setAddressCountry(a.getCountry());
                				response.setStreetAddress(a.getText());
                				response.setMunicipleCode(a.getState());
                				response.setFedralUnit(a.getCity());
                				response.setDescription(a.getText());
                				response.setNeighbourHoodDescription(a.getCity()+" "+a.getState()+" "+a.getCountry());
                			}
                		}
                		response.setCardNumber(patientId);
                		List<Telecom> telecom = resource.getTelecom();
                		if(telecom.size()>0)
                		{
                			for(Telecom t:telecom) {
                				if(t.getExtension() == null)
                				{
                					response.setEmail(t.getValue());
                				}
                			}
                		}
                	}
                	
                }
	           return response;
            }
        }catch(Exception e)
        {
            log.info("Exception occured at PatientDemographic Service {}",e);
        }
        return response;
    }
}
