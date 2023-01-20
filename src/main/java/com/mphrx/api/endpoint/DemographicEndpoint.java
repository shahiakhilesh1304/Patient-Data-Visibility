package com.mphrx.api.EndPoint;


import com.mphrx.api.patientxsdpojo.DemographyRequest;
import com.mphrx.api.patientxsdpojo.DemographyResponse;
import com.mphrx.api.services.PatientDemographicService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class DemographicEndpoint
{
    public static final Logger log = LoggerFactory.getLogger(DemographicEndpoint.class);
    private static final String NAMESPACE_URL = "http://www.mphrx.com/api/PatientXSDPojo";
    @Autowired
    private PatientDemographicService service;

    @PayloadRoot(namespace = NAMESPACE_URL, localPart = "DemographyRequest")
    @ResponsePayload
    public DemographyResponse demographicInfo(@RequestPayload DemographyRequest request)
    {
        DemographyResponse response = new DemographyResponse();
        try{
        	log.info("Namespace Uri is -> {}",NAMESPACE_URL);
        	log.info("request received is {}",request.getPatientId());
            return this.service.getPatientDemoGraphic(request);
        }catch (Exception e)
        {
            log.info("Exception Occured at Endpoint {}",e);
        }
        return response;
    }
}
