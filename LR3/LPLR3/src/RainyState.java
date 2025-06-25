public class RainyState implements WeatherState {
    public void display(CityWeather context) {
        System.out.println(context.getCityName() + ": 🌧 Дощ, " + context.getTemperature() + "°C");
    }
}
