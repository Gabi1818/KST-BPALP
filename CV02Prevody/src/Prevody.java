import java.util.Scanner;

public class Prevody {
    static void main(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("zadej pocet vterin: ");
        int pocetVterin = Integer.parseInt(scanner.nextLine());

        //int pocetVterin = 82658;

        System.out.println("pocet vterin: " + pocetVterin);

        //---den---

        int denVteriny = 60 * 60 * 24; //1 den ve vterinach
        System.out.println("1 den = " + denVteriny + " vterin");

        int pocetDnu = pocetVterin / denVteriny;
        System.out.println("pocet dnu: " + pocetDnu);

        pocetVterin = pocetVterin % denVteriny;
        System.out.println("pocet vterin: " + pocetVterin);

        //---hodina---

        int hodinaVteriny = 60 * 60; //1 hodina ve vterinach
        System.out.println("1 hodina = " + hodinaVteriny + " vterin");

        int pocetHodin = pocetVterin / hodinaVteriny;
        System.out.println("pocet hodin: " + pocetHodin);

        pocetVterin = pocetVterin % hodinaVteriny;
        System.out.println("pocet vterin: " + pocetVterin);

        //---minuta---

        int minutaVteriny = 60;
        System.out.println("1 minuta = " + minutaVteriny + " vterin");

        int pocetMinut = pocetVterin / minutaVteriny;
        System.out.println("pocet minut: " + pocetMinut);

        pocetVterin = pocetVterin % minutaVteriny;
        System.out.println("pocet vterin: " + pocetVterin);




        //Převod GPS souřadnic
        System.out.println("-----Převod GPS souřadnic-----");

        System.out.println("zadej sirku - stupne: ");
        double sirkaStupne = Double.parseDouble(scanner.nextLine());

        System.out.println("zadej sirku - minuty: ");
        double sirkaMinuty = Double.parseDouble(scanner.nextLine());

        System.out.println("zadej sirku - vteriny: ");
        double sirkaVteriny = Double.parseDouble(scanner.nextLine());

//        int sirkaStupne = 0;
//        int sirkaMinuty = 0;
//        int sirkaVteriny = 0;

        System.out.println("zadej delku - stupne: ");
        double delkaStupne = Double.parseDouble(scanner.nextLine());

        System.out.println("zadej delku - minuty: ");
        double delkaMinuty = Double.parseDouble(scanner.nextLine());

        System.out.println("zadej delku - vteriny: ");
        double delkaVteriny = Double.parseDouble(scanner.nextLine());

//        int delkaStupne = 0;
//        int delkaMinuty = 0;
//        int delkaVteriny = 0;

        double ddSirka = sirkaStupne + sirkaMinuty / 60 + sirkaVteriny / 3600;
        double ddDelka = delkaStupne + delkaMinuty / 60 + delkaVteriny / 3600;

        System.out.println("sirka: " + ddSirka + "°N");
        System.out.println("delka: " + ddDelka + "°D");

    }
}
