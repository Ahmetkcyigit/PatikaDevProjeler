import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        double ortalama = 0;
        Scanner scan = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = scan.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = scan.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = scan.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = scan.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = scan.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = scan.nextInt();

        ortalama = (mat + fizik + kimya + tarih + turkce + muzik) / 6;

        System.out.println("Ortalama: " + ortalama + " " + (ortalama > 60 ? "Geçtiniz" : "Kaldınız"));
    }
}