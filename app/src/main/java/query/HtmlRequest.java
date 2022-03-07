package query;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HtmlRequest {

    protected static String api_key = "f17837c8ae2696503bf22529545034ca";
    //protected static StringBuilder response;

    protected static String makeRequest(String url) throws Exception
    {
        URL website = new URL(url);
        URLConnection connection = website.openConnection();
        BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = input.readLine()) != null)
        {
            response.append(inputLine);
        }

        input.close();

        return response.toString();
    }

}
