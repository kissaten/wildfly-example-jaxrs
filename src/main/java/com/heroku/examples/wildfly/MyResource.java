package com.heroku.examples.wildfly;

import org.joda.time.DateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path( "/" )
public class MyResource {

    @GET
    @Produces( "text/plain" )
    public String get() {
        return "Howdy at " + new DateTime();
    }
}
