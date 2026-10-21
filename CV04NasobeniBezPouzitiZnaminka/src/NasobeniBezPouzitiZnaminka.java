import java.util.Scanner;

public class NasobeniBezPouzitiZnaminka {
    static void main(){
        System.out.println("zadej 2 cisla: ");
        Scanner scanner = new Scanner(System.in);
        int prvniCislo = scanner.nextInt();
        int druheCislo = scanner.nextInt();

        int vysledek = 0;

        for (int i = 0; i < druheCislo; i++){
            vysledek += prvniCislo;
        }

        System.out.println("vysledek: " + vysledek);
    }
}
