package query;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;


public class Query extends HtmlRequest{

    private static int lat;
    private static int lon;
    private static String url;

    public static String getData() throws Exception
    {
        url = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+api_key;
        return makeRequest(url);
    }




    /*public static String makeQuery() throws Exception
    {
        String url = "https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&appid="+api_key;
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader inp = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputline;

        while((inputline = inp.readLine()) != null)
        {
            response.append(inputline);
        }

        inp.close();

        return response.toString();


        /*making response look pretty good
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);

        return prettyJsonString;*/


}
