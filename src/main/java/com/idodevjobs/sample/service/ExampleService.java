package com.idodevjobs.sample.service;

import com.idodevjobs.sample.model.BeanParamModel;
import com.idodevjobs.sample.model.ExampleModel;

import javax.ws.rs.*;

@Path("/example")
@Produces("application/json")
public interface ExampleService {

    @GET
    @Path("/{id}")
    public ExampleModel get(@PathParam("id") String id);

    @GET
    @Path("/servererror")
    public ExampleModel getServerError(@QueryParam("id") Integer id);

    @GET
    @Path("/throwable")
    public ExampleModel getThrowable(@QueryParam("id") Integer id);

    @POST
    @Path("/beanparam/{id}")
    public ExampleModel postBeanParam(@BeanParam BeanParamModel beanParamModel);

}
