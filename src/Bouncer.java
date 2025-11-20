import java.util.Scanner;

public class Bouncer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Dobrodošli u Club Java. ");
        System.out.println("Unesite svoje godine: ");
        int dob = scanner.nextInt();

        try {
            provjeriDob(dob);

        } catch (IllegalArgumentException e) {
            System.err.println("Ulaz zabranjen: " + e.getMessage());


        }

    }

    public static void provjeriDob(int dob) {
        if (dob < 18) {
            throw new IllegalArgumentException("Premlad za ulazak.");
        }
        else if(dob > 100) {
            throw new IllegalArgumentException("Osobna iskaznica izgleda lažno.");
        } else{
            System.out.println("Dobrodošli u klub!");
        }


    }
}
