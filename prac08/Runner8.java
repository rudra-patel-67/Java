public class Runner8 {
    public static void main(String[] args) {
        GoldUser gdusr = new GoldUser();
        SilverUser slusr = new SilverUser();

        gdusr.pay();
        gdusr.receive();
        slusr.pay();
        slusr.receive();
    }    
}
