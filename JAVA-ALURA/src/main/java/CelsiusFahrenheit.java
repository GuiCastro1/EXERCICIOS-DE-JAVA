public class CelsiusFahrenheit {

    public static void main(String[] args) {
        double tempCelsius = 35.2;
        double tempFah = (tempCelsius * 1.8) + 32;

        String m = String.format("A temperatura %f em Celsius é igual a %f em Fahrenheit", tempCelsius, tempFah);

        System.out.println(m);

        int temFahInt = (int) tempFah;
        String mm = String.format("A temperatura formatada é %d", temFahInt);
        System.out.println(mm);
    }
}
