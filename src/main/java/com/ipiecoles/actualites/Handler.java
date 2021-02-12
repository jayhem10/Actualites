package com.ipiecoles.actualites;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.owlike.genson.Genson;
import com.owlike.genson.GensonBuilder;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


//util:painsauchoc + mdp:ipi-mdd-324
public class Handler implements RequestHandler<Object, GatewayResponse>{
    @Override
    public GatewayResponse handleRequest(Object input, Context context){

        Actualites actualites = new Actualites();
        try {
            //Serialize en JSON l'objet de retour
            String body = actualites.getJson();

            //Gère les headers
            Map<String, String> headers = new HashMap<>();
            headers.put("Content-Type", "application/json");
            headers.put("Access-Control-Allow-Origin", "https://pjvilloud.github.io");
            int statusCode = 200;
            return new GatewayResponse(body, headers, statusCode);
        } catch (Exception e){
            //Gère correctement l'exception
            e.printStackTrace();
        }

        return null;
    }
}

