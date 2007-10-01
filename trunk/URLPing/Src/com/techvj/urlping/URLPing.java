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
 * Pings a URL to query its status. 
 * 
 * @author Vijay N Albuquerque
 *
 */
public class URLPing {
    /**
     * Pings a URL to query its status. The method defaults to a 30 second timeout.
     * 
     * @param url The URL <code>String</code> to ping. 
     * @return <code>PingResponse</code> representing either <code>OKAY</code>, <code>ERROR</code> or <code>TIMEOUT</code>. 
     * @throws IOException
     */
    public PingResponse ping(String url)
    throws IOException {
        return ping(url, 3000);
    }
    
    /**
     * Pings a URL to query its status. The method accepts a timeout interval specified in seconds.
     * 
     * @param url The URL <code>String</code> to ping.
     * @param timeout The timeout interval specified in seconds.
     * @return <code>PingResponse</code> representing either <code>OKAY</code>, <code>ERROR</code> or <code>TIMEOUT</code>.
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
