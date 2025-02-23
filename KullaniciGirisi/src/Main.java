import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner scan = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = scan.nextLine();

        System.out.print("Şifreniz: ");
        password = scan.nextLine();

        if (userName.equals("Patika") && password.equals("Java123")) {
            System.out.println("Giriş Yaptınız.");
        } else {
            System.out.println("Bilgileriniz Yanlış!");
        }
    }
}