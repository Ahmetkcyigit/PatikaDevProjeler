import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float boy, kilo, indeks;

        Scanner scan = new Scanner(System.in);
        System.out.print("Boyunuzu m cinsinden giriniz: ");
        boy = scan.nextFloat();

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kilo = scan.nextFloat();

        indeks = kilo / (boy * boy);
        System.out.println("Kitle İndeksi : " + indeks);
    }
}