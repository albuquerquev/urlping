/*
 * Created on 16 Apr 2007
 */
package com.techvj.urlping;

/**
 * Enum of status values returned from pinging a URL.
 * <p>
 * OKAY - The URL is reachable (HTTP Status Code 200).<br/>
 * ERROR - The URL cannot be accessed (Anything other than HTTP Status Code 200).<br/>
 * TIMEOUT - The request has timed out.
 * 
 * @author Vijay N Albuquerque
 *
 */
public enum ResponseStatus {
    /**
     * The URL is reachable (HTTP Status Code 200).
     */
    OKAY,
    /**
     * The URL cannot be accessed (Anything other than HTTP Status Code 200).
     */
    ERROR,
    /**
     * The request has timed out.
     */
    TIMEOUT;
}