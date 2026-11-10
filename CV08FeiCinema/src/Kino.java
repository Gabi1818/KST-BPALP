public class Kino {
    private String nazev;
    private boolean[][] sedadla;

    public Kino(String nazev, int radky, int sloupce) {
        this.nazev = nazev;
        if(radky <= 0 || sloupce <= 0){
            throw new IndexOutOfBoundsException("neplatna hodnota: radky / sloupce pole sedadel");
        }
        this.sedadla = new boolean[radky][sloupce];
    }

    public void vypisSedadla(){
        System.out.print("  ");
        for(int i = 0; i < sedadla[0].length; i++){
            System.out.print((i+1) + " ");
        }
        System.out.println();


        for(int x = 0; x < sedadla.length; x++){
            System.out.print((x+1) + " ");
            for(int y = 0; y < sedadla[x].length; y++){
                boolean sedadlo = sedadla[x][y];
                if (sedadlo){
                    System.out.print("X ");
                }
                else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public boolean jeSedadloVolne(int index1, int index2){
        if (index1 < 0 || index1 >= sedadla.length ||
                index2 < 0 || index2 >= sedadla[index1].length) {
            System.out.println("Sedadlo " + index1 + " " + index2 + " neexistuje");
            return false;
        }

        return !sedadla[index1][index2];
    }

    public boolean rezervujSedadlo(int index1, int index2){
        if (index1 < 0 || index1 >= sedadla.length ||
                index2 < 0 || index2 >= sedadla[index1].length) {
            System.out.println("Sedadlo " + index1 + " " + index2 + " neexistuje");
            return false;
        }

        if (sedadla[index1][index2]){
            System.out.println("Sedadlo " + index1 + " " + index2 + " je obsazene");
            return false;
        }

        sedadla[index1][index2] = true;
        return true;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "nazev='" + nazev + '\'' +
                '}';
    }
}
