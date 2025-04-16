package dp.singleton;

public class Client {
    public static void main(String[] args) {
        Singleton S1 = Singleton.getInstance();
        Singleton S2 = Singleton.getInstance();
        System.out.println(S1 == S2);
    }
}
