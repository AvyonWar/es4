public class Student {
    public  String name;
    public  int grade;

    public Student(String student){
        this.name = student;
        this.grade = 0;
        System.out.println("New date!");
        System.out.println("student " + student);

    }
    public  String getStudentDetails(){
        return name + " " + grade;
    }

}
