package com.work.core;

import org.apache.cxf.helpers.CastUtils;
import org.apache.cxf.jaxrs.ext.RequestHandler;
import org.apache.cxf.jaxrs.model.ClassResourceInfo;
import org.apache.cxf.message.Message;

import javax.ws.rs.core.Response;
import java.util.List;
import java.util.Map;

/**
 * <p/>
 * Copyright (C) 2014 copyright.com
 * <p/>
 * Date: 3/2/2016
 *
 * @author Stanislau Kavalski
 */
public class InvokeHandler implements RequestHandler {

    @Override
    public Response handleRequest(Message message, ClassResourceInfo classResourceInfo) {
        Map<String, List<String>> headers = CastUtils.cast((Map<?, ?>) message
                .get(Message.PROTOCOL_HEADERS));

        if (headers.get("ss_id") != null ) {
            // let request to continue
            return null;
        } else {
            // authentication failed, request the authentication, add the realm
            return Response.serverError().build();
        }
    }
}
