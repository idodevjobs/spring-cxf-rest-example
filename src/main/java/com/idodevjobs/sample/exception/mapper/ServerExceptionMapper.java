package com.idodevjobs.sample.exception.mapper;

import javax.ws.rs.ServerErrorException;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ServerExceptionMapper implements ExceptionMapper<ServerErrorException> {
    @Override
    public Response toResponse(ServerErrorException e) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).header("Content-Type", "application/json").entity(new String("INTERNAL SERVER ERROR")).build();
    }
}
