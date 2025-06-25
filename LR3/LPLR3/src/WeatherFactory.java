import java.util.HashMap;
import java.util.Map;

public class WeatherFactory {
    private static final Map<String, WeatherState> states = new HashMap<>();

    public static WeatherState getState(String type) {
        WeatherState state = states.get(type);
        if (state == null) {
            switch (type) {
                case "Sunny":
                    state = new SunnyState();
                    break;
                case "Rainy":
                    state = new RainyState();
                    break;
                default:
                    throw new IllegalArgumentException("Unknown weather type: " + type);
            }
            states.put(type, state);
        }
        return state;
    }
}
