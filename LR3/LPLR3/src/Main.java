import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<CityWeather> cities = new ArrayList<>();

        cities.add(new CityWeather.Builder()
                .setCityName("Kyiv")
                .setTemperature(25)
                .setHumidity(40)
                .setWindSpeed(10)
                .setState(WeatherFactory.getState("Sunny"))
                .build());

        cities.add(new CityWeather.Builder()
                .setCityName("Lviv")
                .setTemperature(18)
                .setHumidity(70)
                .setWindSpeed(15)
                .setState(WeatherFactory.getState("Rainy"))
                .build());

        cities.add(new CityWeather.Builder()
                .setCityName("Odesa")
                .setTemperature(27)
                .setHumidity(60)
                .setWindSpeed(12)
                .setState(WeatherFactory.getState("Sunny"))
                .build());

        for (CityWeather city : cities) {
            city.displayWeather();
        }
    }
}
