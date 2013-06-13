package ru.nicotech.rest;

import org.codehaus.jettison.json.JSONObject;
import ru.nicotech.data.DummyData;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

/**
 * Created with IntelliJ IDEA.
 * User: aabramkin
 * Date: 12.06.13
 * Time: 15:52
 * To change this template use File | Settings | File Templates.
 */
@Path("/dept")
public class TestRest {

    @GET
    @Produces("application/json")
    public JSONObject getClichedMessage(@Context HttpServletRequest req) {
        //Retrieve session data
        HttpSession session = req.getSession(true);
        System.out.println("Session ID: " + session.getId());

        //Put abstract data set in JSON format
        return DummyData.retrieveData();
    }

}