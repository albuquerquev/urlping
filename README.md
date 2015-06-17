URLPing 

URLPing is a simple Java utility to ping a URL. The ping returns back the status as either OKAY, ERROR or TIMEOUT. 
The utility uses the Apache Jakarta Commons HttpClient component.

The following describes the requirements and usage of URLPing.

Requirements
------------
* Java SE - URLPing is designed to run on Java SE 5.0 and later. 


Library Dependencies
--------------------
* Commons HttpClient (http://jakarta.apache.org/commons/httpclient)
* Commons Logging (http://jakarta.apache.org/commons/logging)
* Commons Codec (http://jakarta.apache.org/commons/codec)


Usage
-----
URLPing is the main class. This class provides two methods ping(String url) and ping(String url, int timeout). The first method accepts a URL to ping and defaults to a timeout of 30 seconds. The second method accepts a timeout interval in seconds in addition to the URL to ping.

    URLPing urlPing = new URLPing();
    PingResponse pingResponse = urlPing.ping("http://www.google.com");
            
    assertEquals(pingResponse.getResponseStatus(), ResponseStatus.OKAY);

The response to the ping method is a PingReponse object. This contains a ResponseStatus enum with values of either OKAY, ERROR or TIMEOUT depending on the outcome of the ping. It also contains a responseCode property which contains the response code of the HTTP request.
