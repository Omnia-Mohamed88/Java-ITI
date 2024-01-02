import java.util.function.Function;

public class temp {
    public static void main(String[] args) {
        Double c = 25.0 ;

        Function<Double, Double> celsiusToFahrenheit = (Double celsius) -> (celsius * 9 / 5) + 32;
        
        double fahrenheitTemperature = celsiusToFahrenheit.apply(c);

        System.out.println( " Celsius is equal to " + fahrenheitTemperature + " Fahrenheit.");
    }
}

