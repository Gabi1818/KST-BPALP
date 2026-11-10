public class Main {
    static void main(){
        Kino feiCinema = new Kino("FeiCinema", 2, 6);
        System.out.println(feiCinema);

        feiCinema.vypisSedadla();

        System.out.println("(1, 2)Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, 2));
        System.out.println("(1, 2)Je sedadlo volne: " + feiCinema.jeSedadloVolne(1, 2));
        System.out.println("(2, 5)Je sedadlo volne: " + feiCinema.jeSedadloVolne(2, 5));

        System.out.println("(1, 2)Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, 2));
        System.out.println("(1, 5)Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(1, 5));
        System.out.println("(2, 3)Rezervace sedadla uspesna: " + feiCinema.rezervujSedadlo(2, 3));

        feiCinema.vypisSedadla();

    }
}
