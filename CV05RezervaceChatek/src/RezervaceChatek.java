import java.util.Scanner;

public class RezervaceChatek {
    static void main(){
        final int UKONCIT_PROGRAM = 0;
        final int ZOBRAZIT_OBSAZENOST = 1;
        final int PRIDANI_LIDI = 2;
        final int ODEBRAT_LIDI = 3;

        Scanner scanner = new Scanner(System.in);

        int[] chatky = new int[5];
        int volbaUzivatele = -1;

        while (volbaUzivatele != 0){
            System.out.println("chatka rezervator 3000 pro max");
            System.out.println();
            System.out.println("ukoncit program = 0");
            System.out.println("zobrazit obsazenost = 1");
            System.out.println("pridat lidi = 2");
            System.out.println("odebrat lidi = 3");
            System.out.println();
            System.out.println("zadej volbu: ");

            volbaUzivatele = scanner.nextInt();
            int cisloChatky;

            switch (volbaUzivatele){
                case ZOBRAZIT_OBSAZENOST:
                    for(int i = 0; i < chatky.length; i++){
                        int obsazenost = chatky[i];
                        System.out.println("chatka cislo " + i + " => " + obsazenost);
                    }
                    break;
                case PRIDANI_LIDI:
                    System.out.println("pridani obyvatel do chatky: ");
                    System.out.println("zadej chatku: ");
                    cisloChatky = scanner.nextInt();

                    System.out.println("zadej pocet lidi: ");
                    int pocetLidi = scanner.nextInt();

                    chatky[cisloChatky] = pocetLidi;
                    break;
                case ODEBRAT_LIDI:
                    System.out.println("odebrani obyvatel chatky: ");
                    System.out.println("zadej chatku: ");
                    cisloChatky = scanner.nextInt();

                    chatky[cisloChatky] = 0;
                    break;

            }
        }
    }
}
