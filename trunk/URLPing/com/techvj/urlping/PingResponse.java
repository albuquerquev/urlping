/*
 * Created on 16 Apr 2007
 */
package com.techvj.urlping;

/**
 * 
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

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
