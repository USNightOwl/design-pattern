public class BuilderPatternDemo {
    public static void main(String[] args) {
        Student newStudent = new StudentConcreteBuilder()
                .setId("123456")
                .setFirstName("Tran")
                .setLastName("Quang Huy")
                .setPhone("0123456789")
                .build();

        System.out.println(newStudent);
    }
}
