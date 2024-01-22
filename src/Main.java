public class Main {
    public static void main(String[] args) {
        MobileContext mobileContext = new MobileContext();
        mobileContext.alert();

        mobileContext.setState(new Silent());
        mobileContext.alert();

        System.out.println("Reset to ringing");

        mobileContext.setState(new Ringing());
        mobileContext.alert();
    }
}