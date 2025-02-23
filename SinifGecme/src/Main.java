import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1, s2, s3, s4, s5;
        double toplam;

        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sınavı Girin: ");
        s1 = scan.nextInt();
        System.out.print("2. Sınavı Girin: ");
        s2 = scan.nextInt();
        System.out.print("3. Sınavı Girin: ");
        s3 = scan.nextInt();
        System.out.print("4. Sınavı Girin: ");
        s4 = scan.nextInt();
        System.out.print("5. Sınavı Girin: ");
        s5 = scan.nextInt();

        toplam = (s1 + s2 + s3 + s4 + s5) / 5;

        System.out.println("Ortalama: " + toplam);
        if (toplam >= 50) {
            System.out.println("Geçtiniz! ");
        } else {
            System.out.println("Kaldınız! ");
        }
    }
}