import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mesafe,yas;
        double toplam;
        System.out.print("Mesafeyi km olarak giriniz: ");
        mesafe = scan.nextInt();
        System.out.print("Yaşınızı Giriniz: ");
        yas = scan.nextInt();
        toplam = mesafe * 0.10;
        System.out.println("Toplam: " + toplam);

        if (yas < 12){
            System.out.println("Toplam Fiyat : " + toplam * 0.50);
        }
        else if (yas > 12 && yas < 24 ){
            System.out.println("Toplam Fiyat : " + toplam * 0.90);
        }
        else if(yas > 65){
            System.out.println("Toplam Fiyat : " + toplam * 0.70);
        }
    }
}