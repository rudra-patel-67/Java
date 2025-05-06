class Audi implements SportCar {
    public void start() {
        System.out.println("Audi is starting with a keyless push-button system.");
    }

    public void stop() {
        System.out.println("Audi is stopping using advanced ABS system.");
    }

    @Override
    public void turboBoost() {
        System.out.println("Audi is activating turbo boost for sports mode.");
    }
}