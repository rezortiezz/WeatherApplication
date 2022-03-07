package query;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;


public class Query {

    public static String makeQuery(String city)
    {
        String getter = "https://community-open-weather-map.p.rapidapi.com/weather?q=" + city + "&lat=0&lon=0&id=2172797&lang=null&units=imperial";

        HttpResponse<String> response = Unirest.get(getter)
                .header("x-rapidapi-host", "community-open-weather-map.p.rapidapi.com")
                .header("x-rapidapi-key", "e919279608msh8046e0f30d18ecfp1d5a9ajsna3c6137fd224")
                .asString();

        //making response look pretty good
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);

        return prettyJsonString;
    }

}
