import java.util.Scanner;

public class Faktorial {
    static void main(){
        System.out.println("zadej cislo na faktorial: ");
        Scanner scanner = new Scanner(System.in);

        int cislo = scanner.nextInt();
        int vysledek = 1;

        if (cislo < 0){
            System.out.println("spatne cislo");
        }
        else {
            for(int i = 2; i <= cislo; i++){
                vysledek += i;
            }
            System.out.println("vysledek: " + vysledek);
        }
    }
}
