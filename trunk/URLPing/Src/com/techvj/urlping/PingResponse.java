/*
 * Created on 16 Apr 2007
 */
package com.techvj.urlping;

/**
 * The response received from pinging a URL.
 * 
 * @author Vijay N Albuquerque
 *
 */
public class PingResponse {
    private ResponseStatus responseStatus;
    private int responseCode;

    public int getResponseCode() {
        return responseCode;
    }

    void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
