public class Main {
    static void main(){
        Automobil automobil1 = new Automobil("Audi", "A8", 7.9);
        Automobil automobil2 = new Automobil("Mazda", "6", 5.2);

//        Automobil automobil1 = new Automobil();
//        automobil1.vyrobce = "Audi";
//        automobil1.modelVozu = "A8";
//        automobil1.prumernaSpotreba = 7.9;

//        System.out.println(automobil1.getVyrobce());
//        System.out.println(automobil1.getModelVozu());
//        System.out.println(automobil1.getPrumernaSpotreba());
//        System.out.println(automobil1.toString());

        Autobazar autobazar = new Autobazar("FEI Autobazar");

        autobazar.pridejAutomobil(automobil1);
        autobazar.pridejAutomobil(automobil2);
        autobazar.vypisAutobazar();

        System.out.println(autobazar.prumernaSpotreba());
        System.out.println(autobazar.nejmensiSpotreba());
        System.out.println(autobazar.obsahujeVyrobce(null));
        System.out.println(autobazar.obsahujeVyrobce("abc"));



    }
}
