package parse;

import calculations.WindCalc;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Locale;

public class Parse {

    public static double temp;
    public static double feels_like;
    public static int pressure;
    public static int humidity;
    public static double wind_speed;
    public static double wind_deg;
    public static String main;
    public static String description;


    public static void parse(String ResponseBody) throws JSONException {
        JSONObject weather = new JSONObject(ResponseBody); //MAIN OBJECT


        Double lon = weather.getJSONObject("coord").getDouble("lon");
        Double lat = weather.getJSONObject("coord").getDouble("lat");

        //main info

        JSONArray maininf = weather.getJSONArray("weather");
        for (int i = 0; i < maininf.length(); i++)
        {
            main = maininf.getJSONObject(i).getString("main");
            description = maininf.getJSONObject(i).getString("description");
        }

        //temp&pressure&humidity

        temp = weather.getJSONObject("main").getInt("temp");
        feels_like = weather.getJSONObject("main").getInt("feels_like");
        pressure = weather.getJSONObject("main").getInt("pressure");
        humidity = weather.getJSONObject("main").getInt("humidity");

        // wind info

        wind_speed = weather.getJSONObject("wind").getDouble("speed");
        wind_deg = weather.getJSONObject("wind").getDouble("speed");

    }

    // console output DONT USE FOR APP, JUST FOR TEST
    public static void printInfo(String city)
    {
        System.out.printf("%s\n", city.toUpperCase(Locale.ROOT)); //city
        System.out.printf("Overall status: %s\nAdditional info: %s\n", main, description);
        System.out.printf("Temp.: %d\nFeels Like: %d\n", (int)temp, (int)feels_like);
        System.out.printf("Wind %d m/s, Wind Direction: %s", wind_speed, WindCalc.windDirection(wind_deg));
        System.out.printf("Pressure: %s  Humidity: %s", pressure, humidity);
    }
}
