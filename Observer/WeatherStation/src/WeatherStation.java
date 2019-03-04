import observers.CurrentConditionDisplay;
import subject.WeatherData;

public class WeatherStation
{
    public static void main(String[] args)
    {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(80F, 65F, 30.4F);
        weatherData.setMeasurements(82F, 70F, 29.2F);
        weatherData.setMeasurements(78F, 90F, 29.2F);
    }
}
