import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar,dusukkdvTutar,dusukkdvliTutar;
        double dusukKdv = 0.08;
        Scanner scan = new Scanner(System.in);
        System.out.print("Ücret tutarını giriniz: ");
        tutar = scan.nextDouble();
        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        dusukkdvTutar = tutar * dusukKdv;
        dusukkdvliTutar = tutar + dusukkdvTutar;
//        System.out.println("Kdvsiz Tutar: " + tutar);
//        System.out.println("Kdv Oranı: " + kdvOran);
//        System.out.println("Kdv Tutarı: " + kdvTutar);
//        System.out.println("Kdvli Tutar: " + kdvliTutar);

        if (tutar > 0 && tutar < 1001) {
            System.out.println("Kdvsiz Tutar: " + tutar);
            System.out.println("Kdv Oranı: " + kdvOran);
            System.out.println("Kdv Tutarı: " + kdvTutar);
            System.out.println("Kdvli Tutar: " + kdvliTutar);
        } else {
            System.out.println("Kdvsiz Tutar: " + tutar);
            System.out.println("Kdv Oranı: " + dusukKdv);
            System.out.println("düşük Kdv Tutarı: " + dusukkdvTutar);
            System.out.println("düşük Kdvli Tutar: " + dusukkdvliTutar);
        }
    }
}