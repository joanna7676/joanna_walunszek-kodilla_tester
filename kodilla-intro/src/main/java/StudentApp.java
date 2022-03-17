public class StudentApp {
    public static void main(String[] args) {
        Student student = Student.of("Kowalski", 1980);

        System.out.println("Name: " + student.getName());
        System.out.println("Yeat: " + student.getYear());
    }
}
