package com.idodevjobs.sample.model;

import javax.ws.rs.FormParam;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.PathParam;

public class BeanParamModel {
    @FormParam("myData")
    private String data;

    @HeaderParam("myHeader")
    private String header;

    @PathParam("id")
    private String id;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BeanParamModel{" +
                "data='" + data + '\'' +
                ", header='" + header + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
