/*
 * Created on 16 Apr 2007
 */
package com.techvj.urlping;

/**
 * Enum of status values returned from pinging a URL.
 * 
 * OKAY - the URL is reachable (HTTP Status Code 200).
 * ERROR - the URL cannot be accessed (Anything other than HTTP Status Code 200).
 * TIMEOUT - the request has timed out.    
 * 
 * @author Vijay N Albuquerque
 *
 */
public enum ResponseStatus {
    OKAY, 
    ERROR, 
    TIMEOUT;
}