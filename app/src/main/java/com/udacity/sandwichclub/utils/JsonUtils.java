package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JsonUtils {

    public JsonUtils() throws JSONException {


    }

    public static Sandwich parseSandwichJson(String json) throws JSONException {


        JSONObject rootObject = new JSONObject(json);
        JSONObject subObj = rootObject.getJSONObject("name");
        String mainName = subObj.getString("mainName");
        String placeOfOrigin = subObj.getString("placeOfOrigin");
        int image = subObj.getInt("image");
        String description = subObj.getString("description");
        JSONArray jsonArray = new JSONArray(json);
        for (int i = 0; i < jsonArray.length(); i++) {
            subObj = jsonArray.getJSONObject(i);
            String alsoKnownAs = subObj.getString("alsoKnownAs");
            String ingredients = subObj.getString("alsoKnownAs");
        }


        return parseSandwichJson(json);
    }


}
