public class Student {
    public static String name;
    public static int grade;

    public Student(String student){
        this.name = student;
        this.grade = 0;
        System.out.println("New date!");
        System.out.println("student " + student);

    }
    public static String getStudentDetails(){
        return name + " " + grade;
    }

}
