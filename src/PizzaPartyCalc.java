import java.util.InputMismatchException;
import java.util.Scanner;


public class PizzaPartyCalc {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Koliko pizza je naručeno? ");
            int brojPizza = scanner.nextInt();
            brojPizza = scanner.nextInt();

            System.out.println("Koliko je ljudi na zabavi? ");
            int brojLjudi = scanner.nextInt();
            int komada = izracunajsnite(brojPizza, brojLjudi);

            System.out.println("Svaka osoba dobiva " + komada + "šnite. ");

        } catch (ArithmeticException e) {
            System.err.println("Greška: Ne možemo podijeliti pizzu na 0 ljudi.");
        } catch (InputMismatchException e) {
            System.err.println("Greška: Molimo unesite samo cijele brojeve.");
        }
    }

    public static int izracunajSnite(int brojPizza, int brojLjudi);

    {
        int brojsnita = brojPizza * 8;
        return brojsnita / brojLjudi;

    }
}
