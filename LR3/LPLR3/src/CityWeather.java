public class CityWeather {
    private String cityName;
    private double temperature;
    private int humidity;
    private int windSpeed;
    private WeatherState state;

    private CityWeather(Builder builder) {
        this.cityName = builder.cityName;
        this.temperature = builder.temperature;
        this.humidity = builder.humidity;
        this.windSpeed = builder.windSpeed;
        this.state = builder.state;
    }

    public void displayWeather() {
        state.display(this);
    }

    public String getCityName() {
        return cityName;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public static class Builder {
        private String cityName;
        private double temperature;
        private int humidity;
        private int windSpeed;
        private WeatherState state;

        public Builder setCityName(String name) {
            this.cityName = name;
            return this;
        }

        public Builder setTemperature(double temp) {
            this.temperature = temp;
            return this;
        }

        public Builder setHumidity(int humidity) {
            this.humidity = humidity;
            return this;
        }

        public Builder setWindSpeed(int speed) {
            this.windSpeed = speed;
            return this;
        }

        public Builder setState(WeatherState state) {
            this.state = state;
            return this;
        }

        public CityWeather build() {
            return new CityWeather(this);
        }
    }
}
