package com.idodevjobs.sample.exception.mapper;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ThrowableMapper implements ExceptionMapper<Throwable> {
    @Override
    public Response toResponse(Throwable e) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).header("Content-Type", "application/json").entity(new String("DATA ERROR")).build();
    }
}
