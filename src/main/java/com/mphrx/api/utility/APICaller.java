package com.mphrx.api.utility;

import com.mphrx.api.config.ApiPropertiesConfig;
import com.mphrx.api.reqres.FhirRespnse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.MessageFormat;

@Service
public class APICaller {
    public static final Logger log = LoggerFactory.getLogger(APICaller.class);
    ObjectMapper mapper = new ObjectMapper();
    FhirRespnse result = null;
    public FhirRespnse patient_Demographic_Fetch(String id)
    {
        result = new FhirRespnse();
        try{
        	String apiUrl= ApiPropertiesConfig.env.getProperty("API_URL")+id;
            String authToken = ConstantVariables.API_AUTH_TOKEN;
            String apiInfo = ConstantVariables.API_INFO;
            String apiType = ConstantVariables.API_TYPE;
            String apiContent = ConstantVariables.API_CONTENT_TYPE;
            URL url = new URL(apiUrl);
            log.info("The url is {}->{}",apiUrl,url.getHost());
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod(apiType);
            con.setRequestProperty("x-auth-token",authToken);
            con.setRequestProperty("api-info",apiInfo);
            con.setRequestProperty("Content-Type", apiContent);
            con.setRequestProperty("Cookie","x-auth-token=");
            con.setDoOutput(true);
            int responseCode = con.getResponseCode();
            log.info("Response Code for API calling is -> {}",responseCode);
            log.info("Sending 'POST' Request to URL :: " + url.getQuery()+" :: Response Code :: "+responseCode);
            log.info("Sending 'POST' Request to URL {}");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String output="";
            StringBuffer response = new StringBuffer();
            while ((output = in.readLine()) != null)
                response.append(output);
            in.close();
            log.info("Sent data to Response={}", response);
            String data = response.toString();
            log.info("Sent data to data={}", data);
            result = new Gson().fromJson(data, FhirRespnse.class);
            return result;
        }catch(Exception ex)
        {
            log.warn("Exception Occured while calling an Minerva API at patient_Demographic_Fetch in APICaller service {}",ex);
        }
        return result;
    }
}
