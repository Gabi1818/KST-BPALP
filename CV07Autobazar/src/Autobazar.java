public class Autobazar {
    private String nazev;
    private Automobil[] automobily;
    private int pocetAut;

    public Autobazar(String nazev) {
        this.nazev = nazev;
        this.automobily = new Automobil[10];
        pocetAut = 0;
    }

    public void vypisAutobazar(){
        for (int i = 0; i < automobily.length; i++){
            Automobil automobil = automobily[i];
            System.out.println("[" + i + "] => " + automobil);
        }
    }

    public void pridejAutomobil(Automobil automobil){
        this.automobily[this.pocetAut] = automobil;
        this.pocetAut++;
    }

    public double prumernaSpotreba(){
        double celkovaSpotreba = 0.0;
        for (int i = 0; i < automobily.length; i++){
            if (automobily[i] != null){
                celkovaSpotreba += automobily[i].getPrumernaSpotreba();
            }
        }

        return celkovaSpotreba / pocetAut;
    }

    public double nejmensiSpotreba(){
        double nejmensiSpotreba = automobily[0].getPrumernaSpotreba();

        for(int i = 1; i < automobily.length; i++){
            if (automobily[i] != null && nejmensiSpotreba > automobily[i].getPrumernaSpotreba()){
                nejmensiSpotreba = automobily[i].getPrumernaSpotreba();
            }
        }

        return nejmensiSpotreba;
    }

    public boolean obsahujeVyrobce(String vyrobce){
        for(int i = 1; i < automobily.length; i++){
            if (automobily[i] != null && (automobily[i].getVyrobce()).equals(vyrobce)){
                return true;
            }
        }
        return false;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    @Override
    public String toString() {
        return "Autobazar{" +
                "nazev='" + nazev + '\'' +
                '}';
    }
}
