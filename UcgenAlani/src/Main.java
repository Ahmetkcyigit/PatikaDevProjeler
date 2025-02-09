import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int a, b;
//        double c;
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("1. Kenarı giriniz: ");
//        a = scan.nextInt();
//        System.out.print("2. Kenarı giriniz: ");
//        b = scan.nextInt();
//
//        c = Math.sqrt((a * a) + (b * b));
//        System.out.println("Hipotenüs: " + c);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci kenarı girin: ");
        double a = scanner.nextDouble();

        System.out.print("İkinci kenarı girin: ");
        double b = scanner.nextDouble();

        System.out.print("Üçüncü kenarı girin: ");
        double c = scanner.nextDouble();

        // Üçgenin çevresi için u hesaplanıyor
        double u = (a + b + c) / 2;

        // Alan hesaplanıyor (Heron formülü)
        double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        // Sonucu ekrana yazdır
        System.out.println("Üçgenin Alanı: " + alan);

    }
}