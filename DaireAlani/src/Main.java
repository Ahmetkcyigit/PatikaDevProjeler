import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int r;
//        double pi = 3.14;
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Dairenin yarıçapını giriniz: ");
//        r = scan.nextInt();
//        double alan = pi * r * r;
//        double cevre = 2 * pi * r;
//
//        System.out.println("Dairenin alanı: " + alan);
//        System.out.println("Dairenin çevresi: " + cevre);

        float r, pi=3.14f, a, daireDilimininAlani;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yarıçapı giriniz: ");
        r = scanner.nextFloat();

        System.out.print("Merkez açıyı giriniz: ");
        a = scanner.nextFloat();

        daireDilimininAlani = (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı: "+ daireDilimininAlani);
    }
}