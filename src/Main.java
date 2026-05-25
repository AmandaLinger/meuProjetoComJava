public class Main {
    public static void main(String[] args) {
    double temperaturaCelsius = 36.5;
    double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.printf("a temteratura atual em graus celcius é " + temperaturaCelsius + ", convertendo para fahrenheit fica : " + temperaturaFahrenheit);

        int temperaturaEmFahrenheitInteira = (int) temperaturaFahrenheit;
        System.out.println("Arredondando a temperatura de Fahrenheit: " + temperaturaEmFahrenheitInteira);
    }
}