public class Student {
    public static String name;
    public static int grade;

    public Student(String student, int grade){
        this.name = student;
        this.grade = grade;
        System.out.println("New date!");
        System.out.println("student " + student + ", vote " + grade + "/100");

    }
    public static String getStudentDetails(){
        return Student.name + " " + Student.grade;
    }

}
