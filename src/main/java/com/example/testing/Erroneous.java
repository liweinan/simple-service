package com.example.testing;

import javax.ws.rs.*;

/**
 * @author <a href="mailto:l.weinan@gmail.com">Weinan Li</a>
 */
@Path("erroneous")
public class Erroneous {

    // [[HINT] A HTTP GET method, public void com.example.testing.Erroneous.secondGet(java.lang.String), returns a void type. It can be intentional and perfectly fine, but it is a little uncommon that GET method returns always "204 No Content".;
    // ERROR: no @Path annotation with id placeholder: @Path("/{id}")
    @GET
    public void getWithoutReturn(@PathParam("id") String id) {

    }

//    [FATAL] A resource model has ambiguous (sub-)resource method for HTTP method GET and input mime-types as defined by"@Consumes" and "@Produces" annotations at Java methods public void com.example.testing.Erroneous.secondGet(java.lang.String) and public void com.example.testing.Erroneous.getWithoutReturn(java.lang.String) at matching regular expression /erroneous. These two methods produces and consumes exactly the same mime-types and therefore their invocation as a resource methods will always fail.; source='org.glassfish.jersey.server.model.RuntimeResource@55536d9e']
//    @GET
//    public void secondGet(@PathParam("id") String id) {
//
//    }

//    [FATAL] A resource model has ambiguous (sub-)resource method for HTTP method GET and input mime-types as defined by"@Consumes" and "@Produces" annotations at Java methods public void com.example.testing.Erroneous.getWithNoParam() and public void com.example.testing.Erroneous.getWithoutReturn(java.lang.String) at matching regular expression /erroneous. These two methods produces and consumes exactly the same mime-types and therefore their invocation as a resource methods will always fail.;
//    @GET
//    public void getWithNoParam() {
//
//    }

//    [FATAL] A resource model has ambiguous (sub-)resource method for HTTP method GET and input mime-types as defined by"@Consumes" and "@Produces" annotations at Java methods public java.lang.String com.example.testing.Erroneous.getWithReturn(java.lang.String) and public java.lang.String com.example.testing.Erroneous.pureReturn() at matching regular expression /erroneous. These two methods produces and consumes exactly the same mime-types and therefore their invocation as a resource methods will always fail.; source='org.glassfish.jersey.server.model.RuntimeResource@55536d9e']
//    @GET
//    public String pureReturn() {
//        return "foo";
//    }

//    [[FATAL] A HTTP GET method, public java.lang.String com.example.testing.Erroneous.getWithFormParam(java.lang.String), should not consume any form parameter.;
//    @GET
//    @Path("one")
//    public String getWithFormParam(@FormParam("id2") String id2) {
//        return id2;
//    }
}
