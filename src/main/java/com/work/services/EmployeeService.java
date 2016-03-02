package com.work.services;

import com.work.dao.EmployeeDAO;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * <p/>
 * Copyright (C) 2014 copyright.com
 * <p/>
 * Date: 3/1/2016
 *
 * @author Stanislau Kavalski
 */
public class EmployeeService implements IEmployeeService{
    private EmployeeDAO employeeDAO;


    @Override
    public void addEmployee(String name, String position, Integer salary) {

    }

    @GET
    @Path("/{id}")
    public Response getEmployee() {
        return successResponse("Everything ok!");
    }


    public Response successResponse(Object object) {
        Response.ResponseBuilder response = Response.ok();
        response.header("version", 1);
        if (null != object) {
            response.entity(object);
        } else {
            response.entity("none");
        }
        return response.build();
    }
}
