import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte gib deinen Betrag in EUR an.");
        Double money = scanner.nextDouble();
        convertToDollars(money);
        convertToLepa(money);


    }


    public static void convertToDollars(Double eur) {
        System.out.println("Der Betrag ist:  " + eur + 1.20 + "€");
    }

    public static void convertToLepa(Double eur) {
        System.out.println("Der Betrag ist:  " + eur + 0.003 + "Lep");
    }
}