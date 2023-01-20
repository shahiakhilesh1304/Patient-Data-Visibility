package com.mphrx.api.utility;

import com.mphrx.api.config.ApiPropertiesConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConstantVariables {

    public static final Logger log = LoggerFactory.getLogger(ConstantVariables.class);
    //public static final String API_URL;
    public static final String API_TYPE;
    public static final String API_AUTH_TOKEN;
    public static final String API_INFO;
    public static final String API_CONTENT_TYPE;


    static
    {
        log.info("Intilizing contant variables");
        //API_URL = ApiPropertiesConfig.env.getProperty("API_URL");
        API_TYPE = ApiPropertiesConfig.env.getProperty("API_TYPE");
        API_AUTH_TOKEN = ApiPropertiesConfig.env.getProperty("API_AUTH_TOKEN");
        API_INFO = ApiPropertiesConfig.env.getProperty("API_INFO");
        API_CONTENT_TYPE = ApiPropertiesConfig.env.getProperty("API_CONTENT_TYPE");
    }

}
