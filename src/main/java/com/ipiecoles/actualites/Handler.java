package com.ipiecoles.actualites;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.owlike.genson.Genson;

import java.util.HashMap;
import java.util.Map;


public class Handler implements RequestHandler<Object, GatewayResponse>{
    @Override
    public GatewayResponse handleRequest(Object input, Context context){

        Actualites actualites = new Actualites();
        //Gère les headers
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Access-Control-Allow-Origin", "https://pjvilloud.github.io");
        try {
            //Serialize en JSON l'objet de retour
            String body = actualites.getJson();
            int statusCode = 200;
            return new GatewayResponse(body, headers, statusCode);
        } catch (Exception e){
            //Gère correctement l'exception
            e.printStackTrace();
        }

        Map<String, Object> error = new HashMap<String, Object>() {{
            put("Error", "An error has occurred");
        }};
        Genson genson = new Genson();
        String body = genson.serialize(error);
        return new GatewayResponse(body, headers, 500);
    }
}

