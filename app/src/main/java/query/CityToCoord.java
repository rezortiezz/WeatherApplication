package query;

public class CityToCoord extends HtmlRequest{

    private static String url;
    public static String getData(String cityName) throws Exception
    {
        url ="http://api.openweathermap.org/geo/1.0/direct?q="+cityName+"&limit=5&appid=" + api_key;
        return makeRequest(url);
    }


}
