package dp.prototype;

public class Client {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setBatch("April 2025 Batch");
        stu.setAvgPsp(50.0);
        stu.setInstructorName("Janardhan");

        IntelligentStudent intStu = new IntelligentStudent();
        intStu.setIq(180);
        intStu.setBatch("March 2025 Batch");
        intStu.setAvgPsp(80.0);
        intStu.setInstructorName("Roshan");

        Student roshan = intStu.clone();

        System.out.println("Debug Here");

    }

}
