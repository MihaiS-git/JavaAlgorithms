public class Main {
    public static void main(String[] args) {
        Person student = new Person();
        student.setFirstName("Jhon");
        student.setLastName("Doe");
        student.setAge(19);

        System.out.println(student.isTeen());
        System.out.println(student.getFullName());
    }
}
