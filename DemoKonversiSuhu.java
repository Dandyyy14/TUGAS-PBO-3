public class DemoKonversiSuhu {
    public static void main(String[] args){
        KonversiSuhu2 suhu = new KonversiSuhu2();

        System.out.println("Konversi Suhu Celcius to Fahrenheit : " + suhu.celciusToFahrenheit(25));
        System.out.println("Konversi Suhu Celcius to Reamur     : " + suhu.celciusToReamur(25));
        System.out.println("Konversi Suhu Fahrenheit to Reamur  : " + suhu.fahrenheitToReamur(77));
    }
}
