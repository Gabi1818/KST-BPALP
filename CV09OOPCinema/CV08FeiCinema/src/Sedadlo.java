public class Sedadlo {
    private boolean jeObsazene;

    public Sedadlo(boolean jeObsazene) {
        this.jeObsazene = jeObsazene;
    }


    public boolean isJeObsazene() {
        return jeObsazene;
    }

    public void setJeObsazene(boolean jeObsazene) {
        this.jeObsazene = jeObsazene;
    }

    @Override
    public String toString() {
        return "Sedadlo{" +
                "jeObsazene=" + jeObsazene +
                '}';
    }
}
