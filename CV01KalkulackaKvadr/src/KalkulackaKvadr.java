public class KalkulackaKvadr {
    static void main() {
        System.out.println("Hello World");

        int a = 2;
        int b = 5;
        int c = 10;

        int objem = a * b * c;
        int povrch = 2 * (a * b + b * c + a * c);

        System.out.println("strana a = " + a);
        System.out.println("strana b = " + b);
        System.out.println("strana c = " + c);


        System.out.println("objem = " + objem);
        System.out.println("povrch = " + povrch);


        //Úkol 01B: Kalkulačka

        int oprandA = 4;
        int oprandB = 3;

        int soucet = oprandA + oprandB;
        int soucin = oprandA * oprandB;
        int rozdil = oprandA - oprandB;
        double podil;

        if (b != 0){
             podil = (double) oprandA / oprandB;
        }
        else {
            podil = 0;
            System.out.println("nedel 0!");
        }


        System.out.println("soucet " + soucet);
        System.out.println("soucin " + soucin);
        System.out.println("rozdil " + rozdil);
        System.out.println("podil " + podil);


        //Úkol 01C: Paul McCartney

        int vek = 20;
        int vekDo64 = 64 - vek;
        int vekOd14 = vek - 14;

        System.out.println(vekDo64);
        System.out.println(vekOd14);

    }
}
