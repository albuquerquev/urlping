/*
 * Created on 16 Apr 2007
 */
package com.techvj.urlping.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import com.techvj.urlping.PingResponse;
import com.techvj.urlping.ResponseStatus;
import com.techvj.urlping.URLPing;

public class URLPingTest {
    @Test
    public void testValidGoogle()
    throws IOException {
        URLPing urlPing = new URLPing();
        PingResponse pingResponse = urlPing.ping("http://www.google.com");
        
        assertEquals(pingResponse.getResponseStatus(), ResponseStatus.OKAY);
    }
    
    @Test
    public void testInvalidGoogle()
    throws IOException {
        URLPing urlPing = new URLPing();
        PingResponse pingResponse = urlPing.ping("http://www.google.com/junk327217827187337882");
        
        assertEquals(pingResponse.getResponseStatus(), ResponseStatus.ERROR);
    }
}
