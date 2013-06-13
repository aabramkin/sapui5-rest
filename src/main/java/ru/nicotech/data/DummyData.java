package ru.nicotech.data;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

/**
 * Created with IntelliJ IDEA.
 * User: aabramkin
 * Date: 13.06.13
 * Time: 11:17
 * To change this template use File | Settings | File Templates.
 */
public class DummyData {

    public static JSONObject retrieveData(){
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject();
            JSONArray list = new JSONArray();
            list.put(createItem("0001", "Joy Division"));
            list.put(createItem("0002", "New Order"));
            list.put(createItem("0003", "The Smiths"));
            list.put(createItem("0004", "The Stone Roses"));
            list.put(createItem("0005", "Inspiral Carpets"));
            list.put(createItem("0006", "Echo & The Bunnymen"));
            list.put(createItem("0007", "Happy Mondays"));
            list.put(createItem("0008", "The Fall"));
            list.put(createItem("0009", "The Durutti Column"));
            list.put(createItem("0010", "Buzzcocks"));
            list.put(createItem("0011", "Oasis"));
            list.put(createItem("0012", "The Verve"));
            list.put(createItem("0013", "Northside"));
            jsonObj.put("RESULTS", list);
        } catch (Exception ignored) {

        }
        return jsonObj;
    }

    protected static JSONObject createItem(String group, String name) {
        JSONObject jsonObject = new JSONObject();
        try {
            JSONObject subObject = new JSONObject();
            subObject.put("TGROUP", group);
            subObject.put("TGROUP_TXT", name);

            jsonObject.put("RESULT", subObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonObject;
    }
}
