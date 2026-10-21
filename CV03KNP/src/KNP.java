import java.util.Random;
import java.util.Scanner;

public class KNP {
    static void main(){
        final int KAMEN = 1;
        final int NUZKY = 2;
        final int PAPIR = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("KAMEN = 1;");
        System.out.println("NUZKY = 2;");
        System.out.println("PAPIR = 3;");
        int uzivatelskaVolba = scanner.nextInt();

        Random random = new Random();
        int aiVolba = random.nextInt(1,4);
        System.out.println("volba pocitace " + aiVolba);

        if (uzivatelskaVolba == NUZKY && aiVolba == PAPIR || uzivatelskaVolba == KAMEN && aiVolba == NUZKY || uzivatelskaVolba == PAPIR && aiVolba == KAMEN){
            System.out.println("vyhrava uzivatel");
        }
        else if(uzivatelskaVolba == PAPIR && aiVolba == NUZKY || uzivatelskaVolba == NUZKY && aiVolba == KAMEN || uzivatelskaVolba == KAMEN && aiVolba == PAPIR){
            System.out.println("vyhrava pocitac");
        }
        else{
            System.out.println("remiza");
        }

    }
}
