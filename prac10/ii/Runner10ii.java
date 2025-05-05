public class Runner10ii {
    public static void main(String[] args) {
        Santro santro = new Santro();
        santro.start();
        santro.carryPassengers();
        santro.stop();

        System.out.println();

        Audi audi = new Audi();
        audi.start();
        audi.turboBoost();
        audi.stop();
    }
}