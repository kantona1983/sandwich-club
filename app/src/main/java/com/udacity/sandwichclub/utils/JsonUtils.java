package com.udacity.sandwichclub.utils;

import com.udacity.sandwichclub.model.Sandwich;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;


public class JsonUtils {

    public JsonUtils() throws JSONException {


    }

    public static Sandwich parseSandwichJson(String json) throws JSONException {


        String mainName;
        String placeOfOrigin;
        String description;
        String image;
        String alsoKnownAs;
        String ingredients;


        JSONObject jsonObject = new JSONObject(json);
        JSONObject name = jsonObject.getJSONObject("name");
        mainName = name.getString("mainName");
        placeOfOrigin = name.getString("placeOfOrigin");
        description = name.getString("description");
        image = name.getString("image");

        JSONArray jsonArray = jsonObject.getJSONArray(json);
        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject jsonObject1 = jsonArray.getJSONObject(i);

            alsoKnownAs = jsonObject1.getString("alsoKnownAs");
            ingredients = jsonObject1.getString("ingredients");


        }

        return parseSandwichJson(json);

    }


}
