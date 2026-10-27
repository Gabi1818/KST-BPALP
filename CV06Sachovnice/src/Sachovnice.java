import java.util.Random;
import java.util.Scanner;

public class Sachovnice {
    static void main(){
        System.out.println(" ___   ___   ______    ________       ______       __   __   ______     ______  ______");
        System.out.println("/__/\\ /__/\\ /_____/\\  /_______/\\     /_____/\\     /_/\\ /_/\\ /_____/\\   /_____/\\/_____/\\ ");
        System.out.println("\\::\\ \\\\  \\ \\\\:::_ \\ \\ \\::: _  \\ \\    \\:::_ \\ \\    \\:\\ \\\\ \\ \\\\::::_\\/_  \\:::__\\/\\::::_\\/_");
        System.out.println(" \\::\\/_\\ .\\ \\\\:(_) ) )_\\::(_)  \\ \\    \\:\\ \\ \\ \\    \\:\\ \\\\ \\ \\\\:\\/___/\\    /: /  \\:\\/___/\\ ");
        System.out.println("  \\:: ___::\\ \\\\: __ `\\ \\\\:: __  \\ \\    \\:\\ \\ \\ \\    \\:\\_/.:\\ \\\\::___\\/_  /::/___ \\::___\\/_  ");
        System.out.println("   \\: \\ \\\\::\\ \\\\ \\ `\\ \\ \\\\:.\\ \\  \\ \\    \\:\\_\\ \\ \\    \\ ..::/ / \\:\\____/\\/_:/____/\\\\:\\____/\\ ");
        System.out.println("    \\__\\/ \\::\\/ \\_\\/ \\_\\/ \\__\\/\\__\\/     \\_____\\/     \\___/_(   \\_____\\/\\_______\\/ \\_____\\/");

        final int UKONCIT_PROGRAM = 0;
        final int VYGENEROVAT_NOVE = 1;
        final int PREDGENEROVANE = 2;

        Scanner scanner = new Scanner(System.in);

        int volbaUzivatele = -1;

        while (volbaUzivatele != 0) {
            System.out.println("ukoncit program = 0");
            System.out.println("vygenerovat nove = 1");
            System.out.println("zobrazit predgenerovane = 2");

            System.out.print("zadej volbu: ");

            volbaUzivatele = scanner.nextInt();

            switch (volbaUzivatele) {
                case VYGENEROVAT_NOVE:
                    VygenerovatNove();
                    break;
                case PREDGENEROVANE:
                    Predgenerovane();
                    break;
                case UKONCIT_PROGRAM:

                    break;

            }


        }
}

public static void VygenerovatNove(){
    int[][] sachovnice = {
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0}
    };

    Random random = new Random();

    int[] radky = new int[8];
    int[] sloupky = new int[8];

    String radkyString = "Veze se ohruzuji na radkach: ";
    String sloupceString = "Veze se ohruzuji ve sloupcich: ";


    for (int i = 0; i < sachovnice.length; i++) {
        for (int j = 0; j < sachovnice[i].length; j++) {
            int cislo = random.nextInt(0, 2);
            if (cislo == 1){
                radky[i]++;
                sloupky[j]++;
                sachovnice[i][j] = 1;
            }

        }
        System.out.println();
    }

    for (int i = 0; i < radky.length; i++){
        //System.out.print(radky[i] + " ");
        if (radky[i] >= 2){
            radkyString += String.valueOf(+i) + " ";
        }
    }

    for (int i = 0; i < sloupky.length; i++){
        //System.out.print(sloupky[i] + " ");
        if (sloupky[i] >= 2){
            sloupceString += String.valueOf(+i) + " ";
        }
    }

    for (int i = 0; i < sachovnice.length; i++) {
        for (int j = 0; j < sachovnice[i].length; j++) {
            System.out.print(sachovnice[i][j] + " ");
        }
        System.out.println();
    }

    System.out.println();
    System.out.println(radkyString);
    System.out.println(sloupceString);
}

public static void Predgenerovane(){
            int[][] sachovnice = {
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0, 1, 0},
                    {0, 0, 0, 0, 1, 0, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 0, 1, 0, 0, 1, 0, 0},
                    {0, 0, 0, 0, 0, 0, 0, 1},
                    {0, 0, 0, 0, 0, 0, 0, 0},
                    {0, 1, 0, 0, 0, 0, 0, 0}
            };

            int[] radky = new int[8];
            int[] sloupky = new int[8];

            String radkyString = "Veze se ohruzuji na radkach: ";
            String sloupceString = "Veze se ohruzuji ve sloupcich: ";


            for (int i = 0; i < sachovnice.length; i++) {
                for (int j = 0; j < sachovnice[i].length; j++) {
                    if (sachovnice[i][j] == 1){
                        radky[i]++;
                        sloupky[j]++;
                    }
                }
                System.out.println();
            }

            for (int i = 0; i < radky.length; i++){
                //System.out.print(radky[i] + " ");
                if (radky[i] >= 2){
                    radkyString += String.valueOf(+i) + " ";
                }
            }

            //System.out.println();
            //System.out.println("-------------------");

            for (int i = 0; i < sloupky.length; i++){
                //System.out.print(sloupky[i] + " ");
                if (sloupky[i] >= 2){
                    sloupceString += String.valueOf(+i) + " ";
                }
            }

            //System.out.println();
            //System.out.println("-------------------");

            for (int i = 0; i < sachovnice.length; i++) {
                for (int j = 0; j < sachovnice[i].length; j++) {
                    System.out.print(sachovnice[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println(radkyString);
            System.out.println(sloupceString);
        }
}

