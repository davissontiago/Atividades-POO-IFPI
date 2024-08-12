package Atividade10CampMetEstaticos;

public class Conversor {
    public static double celsiusFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }
    public static double fahrenheitCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
    public static double celsiusKelvin(double celsius){
        return celsius+273.15;
    }
    public static double kelvinCelsius(double kelvin){
        return kelvin-273.15;
    }
    public static double fahrenheitKelvin(double fahrenheit){
        return (fahrenheit-32)*5/9+273.15;
    }
    public static double kelvinFahrenheit(double kelvin){
        return (kelvin-273.15)*9/5+32;
    }
}
