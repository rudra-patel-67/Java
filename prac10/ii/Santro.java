public class Santro implements CommercialCar {
    public void start() {
        System.out.println("Santro is starting with a basic ignition system.");
    }

    public void stop() {
        System.out.println("Santro is stopping using basic brakes.");
    }

    @Override
    public void carryPassengers() {
        System.out.println("Santro is carrying 4-5 passengers efficiently.");
    }
}