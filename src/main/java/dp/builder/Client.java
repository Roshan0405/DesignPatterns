package dp.builder;

public class Client {
    public static void main(String[] args) {
        Builder b = new Builder();
        b.setName("Roshan");
        b.setAge(23);
        b.setGradYear(2020);
        b.setPhoneNumber("+911234567");

        Student s = new Student(b);
    }
}
