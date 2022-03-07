package calculations;

public class WindCalc {

    public static String windDirection(double wind_deg)
    {
        if (wind_deg <= 11.35 || wind_deg >= 348.75)
        {
            return "N";
        }

        if (wind_deg > 11.35 && wind_deg <= 33.75)
        {
            return "NNE";
        }
        if (wind_deg > 33.75 && wind_deg <= 56.25)
        {
            return "NNNE";
        }
        if (wind_deg > 56.25 && wind_deg <= 78.75)
        {
            return "ENE";
        }
        if (wind_deg > 78.75 && wind_deg <= 101.25)
        {
            return "E";
        }
        if (wind_deg > 101.25 && wind_deg <= 123.75)
        {
            return "ESE";
        }
        if (wind_deg > 123.75 && wind_deg <= 146.25)
        {
            return "SE";
        }
        if (wind_deg > 146.25 && wind_deg <= 168.75)
        {
            return "SSE";
        }
        if (wind_deg > 146.25 && wind_deg <= 146.25)
        {
            return "SE";
        }
        if (wind_deg > 168.75 && wind_deg <= 191.25)
        {
            return "S";
        }
        if (wind_deg > 191.25 && wind_deg <= 213.75)
        {
            return "SSW";
        }
        if (wind_deg > 213.75 && wind_deg <= 236.25)
        {
            return "SW";
        }
        if (wind_deg > 236.25 && wind_deg <= 258.75)
        {
            return "WSW";
        }
        if (wind_deg > 258.75 && wind_deg <= 281.25)
        {

        }

        return null;
    }
}
