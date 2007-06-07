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
    public void testDesigningShakespeare()
    throws IOException {
        URLPing urlPing = new URLPing();
        PingResponse pingResponse = urlPing.ping("http://ahds.ac.uk/ahdscollections/docroot/shakespeare/playslist.do");
        
        assertEquals(pingResponse.getResponseStatus(), ResponseStatus.OKAY);
    }
    
    @Test
    public void testICTGuides()
    throws IOException {
        URLPing urlPing = new URLPing();
        PingResponse pingResponse = urlPing.ping("http://www.ahds.ac.uk/ictguides");
        
        assertEquals(pingResponse.getResponseStatus(), ResponseStatus.OKAY);
    }
    
    @Test
    public void testStormontPapers()
    throws IOException {
        URLPing urlPing = new URLPing();
        PingResponse pingResponse = urlPing.ping("http://stormontpapers.ahds.ac.uk");
        
        assertEquals(pingResponse.getResponseStatus(), ResponseStatus.OKAY);
    }
}
