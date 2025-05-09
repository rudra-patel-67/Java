public class Runner11i {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        Galaxy galaxy = new Galaxy();

        iphone.call();
        iphone.sms();
        iphone.radiation();
        iphone.sound();
        galaxy.call();
        galaxy.sms();
        galaxy.radiation();
        galaxy.sound();

    }
}
