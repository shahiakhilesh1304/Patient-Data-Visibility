package com.mphrx.api.services;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.mphrx.api.DTO.Address;
import com.mphrx.api.DTO.Entry;
import com.mphrx.api.DTO.Link;
import com.mphrx.api.DTO.MaritalStatus;
import com.mphrx.api.DTO.Name;
import com.mphrx.api.DTO.Resource;
import com.mphrx.api.DTO.Telecom;
import com.mphrx.api.DTO.Text;
import com.mphrx.api._780.Addr;
import com.mphrx.api._780.Demographic;
import com.mphrx.api._780.DemographyRequest;
import com.mphrx.api._780.DemographyResponse;
import com.mphrx.api._780.Fault;
import com.mphrx.api._780.PatientLoc;
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
//    public DemographyResponse getPatientDemoGraphic(DemographyRequest request)
//    {
//        DemographyResponse response = new DemographyResponse();
//        try{
//            String cardNumber = request.getCardNumber();
//            //log.info("The request has been formed {}",mapper.writeValueAsString(request));
//            log.info("Goingg to call an API");
//            FhirRespnse responseF = this.apiCall.patient_Demographic_Fetch(cardNumber);
//            if(responseF != null)
//            {
//                Demographic demographic = new Demographic();
//                //log.info("\n\nThe response from an api has been receieved {}",mapper.writeValueAsString(responseF));
//                log.info("Parsing the json to soap api response...0");
//                List<Entry> entry = responseF.getEntry();
//                List<Link> link = responseF.getLink();
//                demographic.setUnidentifiablepatientReason(" ");
//                demographic.setSchooling(" ");
//                demographic.setProfession(" ");
//                demographic.setBreed(" ");
//                response.setPatientDemographic(demographic);
//                if(entry != null)
//                {
//	                for(Entry e:entry)
//	                {
//	                	
//	                	Resource resource = e.getResource();
//	                	if(resource != null)
//	                	{
//	                		List<Name> name = resource.getName();
//	                		if(name.size() > 0) {
//	                			for(Name n : name) {
//	                			response.setPatientName(n.getText());
//	 
//	                			}
//	                		}
//	                		MaritalStatus mStatus = resource.getMaritalStatus();
//		                	if(mStatus != null)
//		                	{
//		                		response.setMaritalStatus(mStatus.getText());
//		                	}else
//	                		{
//	                			response.setMaritalStatus(" ");
//	                		}
//	                		response.setDob(resource.getBirthDate());
//	                		response.setNameOfMother(" ");
//	                		response.setGender(resource.getGender());
//	                		List<Addr> responseAddress = new ArrayList<>();
//	                		PatientLoc location = new PatientLoc();
//	                		List<Address> address = resource.getAddress();
//	                		if(address.size()>0) {
//	                			Addr resAddress;
//	                			for(Address a:address) {
//	                				resAddress = new Addr();
//	                				resAddress.setCountry(a.getCountry());
//	                				resAddress.setAddressType(a.getUse());
//	                				resAddress.setAddressCountry(a.getCountry());
//	                				resAddress.setStreetAddress(a.getText());
//	                				resAddress.setMunicipleCode(a.getState());
//	                				resAddress.setFedralUnit(a.getCity());
//	                				resAddress.setDescription(a.getText());
//	                				resAddress.setNeighbourHoodDescription(a.getCity()+" "+a.getState()+" "+a.getCountry());
//	                				responseAddress.add(resAddress);
//	                			}
//	                			location.setAddress(responseAddress);
//	                		}
//	                		response.setLocation(location);
//	                		response.setCardNumber(cardNumber);
//	                		List<Telecom> telecom = resource.getTelecom();
//	                		if(telecom.size()>0)
//	                		{
//	                			for(Telecom t:telecom) {
//	                				if(t.getExtension() == null)
//	                				{
//	                					response.setEmail(t.getValue());
//	                				}
//	                			}
//	                		}
//	                	}
//	                	
//	                }
//	                return response;
//                }
//		       
//            }
//        }catch(Exception e)
//        {
//            log.info("Exception occured at PatientDemographic Service {}",e);
//        }
//        return response;
//    }
//    
    
    
//    Searching patient demography with identifier
    public DemographyResponse getPatientDemoGraphic_With_Identifier(DemographyRequest request)
    {
        DemographyResponse response = new DemographyResponse();
        try{
            String cardNumber = request.getCardNumber();
            //log.info("The request has been formed {}",mapper.writeValueAsString(request));
            log.info("Goingg to call an API");
            FhirRespnse responseF = this.apiCall.patient_Demographic_Fetch_With_Identifier(cardNumber);
            if(responseF != null)
            {
                Demographic demographic = new Demographic();
//                log.info("\n\nThe response from an api has been receieved {}",mapper.writeValueAsString(responseF));
                log.info("Parsing the json to soap api response...0");
                List<Entry> entry = responseF.getEntry();
                List<Link> link = responseF.getLink();
                demographic.setUnidentifiablepatientReason(" ");
                demographic.setSchooling(" ");
                demographic.setProfession(" ");
                demographic.setBreed(" ");
                response.setPatientDemographic(demographic);
                if(entry != null)
                {
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
	                		MaritalStatus mStatus = resource.getMaritalStatus();
		                	if(mStatus != null)
		                	{
		                		response.setMaritalStatus(mStatus.getText());
		                	}else
	                		{
	                			response.setMaritalStatus(" ");
	                		}
		                	response.setRegistrationPhysicalPerson(resource.getId());
	                		response.setDob(resource.getBirthDate());
	                		response.setNameOfMother(" ");
	                		response.setGender(resource.getGender());
	                		List<Addr> responseAddress = new ArrayList<>();
	                		PatientLoc location = new PatientLoc();
	                		List<Address> address = resource.getAddress();
	                		if(address.size()>0) {
	                			Addr resAddress;
	                			for(Address a:address) {
	                				resAddress = new Addr();
	                				resAddress.setCountry(a.getCountry());
	                				resAddress.setAddressType(a.getUse());
	                				resAddress.setAddressCountry(a.getCountry());
	                				resAddress.setStreetAddress(a.getText());
	                				resAddress.setMunicipleCode(a.getState());
	                				resAddress.setFedralUnit(a.getCity());
	                				resAddress.setDescription(a.getText());
	                				resAddress.setNeighbourHoodDescription(a.getCity()+" "+a.getState()+" "+a.getCountry());
	                				responseAddress.add(resAddress);
	                			}
	                			location.setAddress(responseAddress);
	                		}
	                		response.setLocation(location);
	                		response.setCardNumber(cardNumber);
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
	                
                }
            }
            return response;
        }catch(Exception e)
        {
            log.info("Exception occured at PatientDemographic Service {}",e);
        }
        return response;
    }
}
