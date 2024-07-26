public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.read();
        System.out.println("******************** Displaying Student Information ********************");
        student.show();

        Teacher teacher = new Teacher();
        teacher.read();
        System.out.println("******************** Displaying Teacher Information ********************");
        teacher.show();
    }
}
