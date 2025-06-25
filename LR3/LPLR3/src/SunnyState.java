public class SunnyState implements WeatherState {
    public void display(CityWeather context) {
        System.out.println(context.getCityName() + ": ☀ Сонячно, " + context.getTemperature() + "°C");
    }
}
