package com.example.ejerciciosinfotec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.util.StreamUtils;

import java.io.IOException;
import java.nio.charset.Charset;


public class RestTemplateHeaderModifierInterceptor implements ClientHttpRequestInterceptor {
    private final Logger log = LoggerFactory.getLogger(this.getClass());


    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException{
        logRequest(request,body);
        ClientHttpResponse response = execution.execute(request, body);
        response.getHeaders().add("Foo","bar");
        logResponse(response);
        return response;
    }


    private void logRequest(HttpRequest request, byte[] body) throws IOException{
        log.info("====================== Inicia la peticion ====================");
        log.info("URL             : {}",request.getURI());
        log.info("Metodo          : {}",request.getMethod());
        log.info("Headers         : {}",request.getHeaders());
        log.info("Request body    : {}",new String(body, "UTF-8"));
        log.info("========================== Termina la peticion ===============");
    }

    private void logResponse(ClientHttpResponse response) throws IOException{
        log.info("====================== Inicia respuesta ====================");
        log.info("Status code     : {}",response.getStatusCode());
        log.info("Status text     : {}",response.getStatusText());
        log.info("Headers         : {}",response.getHeaders());
        log.info("Response body   : {}", StreamUtils.copyToString(response.getBody(), Charset.defaultCharset()));
        log.info("========================== Termina la respuesta ===============");


    }

}
