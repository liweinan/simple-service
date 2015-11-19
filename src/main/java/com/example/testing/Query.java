package com.example.testing;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * @author <a href="mailto:l.weinan@gmail.com">Weinan Li</a>
 */
@Path("q")
public class Query {

    @GET
    public String get() {
        return "Hello, Martian!";
    }

    @GET
    @Path("echo")
    public String echo(@QueryParam("str") String str) {
        return str;
    }

    @GET
    @Path("{id}")
    public String id(@PathParam("id") String id) {
        return id;
    }
}
