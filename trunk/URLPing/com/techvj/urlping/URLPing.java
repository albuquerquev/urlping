/*
 * Created on 16 Apr 2007
 */
package com.techvj.urlping;

import java.io.IOException;
import java.net.SocketTimeoutException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpMethod;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpClientParams;

/**
 * 
 * 
 * @author Vijay N Albuquerque
 *
 */
public class URLPing {
    /**
     * Defaults to a 30 second timeout.
     * 
     * @param url
     * @return
     * @throws IOException
     */
    public PingResponse ping(String url)
    throws IOException {
        return ping(url, 3000);
    }
    
    /**
     * 
     * @param url
     * @param timeout
     * @return
     * @throws IOException
     */
    public PingResponse ping(String url, int timeout)
    throws IOException {
        HttpClientParams httpClientParams = new HttpClientParams();
        httpClientParams.setSoTimeout(timeout);
        
        HttpClient httpClient = new HttpClient(httpClientParams);
        HttpMethod method = new GetMethod(url);

        PingResponse pingResponse = new PingResponse();

        try {
            int statusCode = httpClient.executeMethod(method);
            
            pingResponse.setResponseCode(statusCode);
            if(statusCode == 200) {
                pingResponse.setResponseStatus(ResponseStatus.OKAY);
            }
            else {
                pingResponse.setResponseStatus(ResponseStatus.ERROR);
            }
        }
        catch(SocketTimeoutException e) {
            pingResponse.setResponseStatus(ResponseStatus.TIMEOUT);
        }
        
        return pingResponse;
    }
}
