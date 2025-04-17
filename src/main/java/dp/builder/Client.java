package dp.builder;

public class Client {
    public static void main(String[] args) {
//        Builder b = new Builder();
//        b.setName("Roshan");
//        b.setAge(23);
//        b.setGradYear(2020);
//        b.setPhoneNumber("+911234567");
//
//        //Student s = new Student(b);
//
//        Student s = b.build();

        Student s = Student.Builder.getBuilder()
                .setName("Roshan")
                .setAge(23)
                .build();
    }
}
