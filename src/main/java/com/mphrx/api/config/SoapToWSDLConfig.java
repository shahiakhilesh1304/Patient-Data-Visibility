package com.mphrx.api.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.transport.http.MessageDispatcherServlet;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;


@Configuration
@EnableWs
public class SoapToWSDLConfig extends WsConfigurerAdapter
{

    @Bean
    public ServletRegistrationBean<MessageDispatcherServlet> messageDispatcherServlet(ApplicationContext context)
    {
        MessageDispatcherServlet mds = new MessageDispatcherServlet();
        mds.setApplicationContext(context);
        mds.setTransformWsdlLocations(true);
        return new ServletRegistrationBean<MessageDispatcherServlet>(mds,"/ws/*");
    }

    @Bean("_780_wsdl")
    public DefaultWsdl11Definition defaultWSDL_2(XsdSchema scheme)
    {
        DefaultWsdl11Definition wsdl = new DefaultWsdl11Definition();
        wsdl.setPortTypeName("DemographicEndpoint");
        wsdl.setLocationUri("/ws/");
        wsdl.setTargetNamespace("http://www.mphrx.com/api/_780");
        wsdl.setSchema(scheme);
        return wsdl;
    }
    @Bean
    public XsdSchema schema1() {
        return new SimpleXsdSchema(new ClassPathResource("780.xsd"));
    }
 
}
