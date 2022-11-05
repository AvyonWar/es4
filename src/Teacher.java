public class Teacher {
    public  String teacherName;

    public Teacher(String teacherName){
        System.out.println("There is a new teacher!" + " " + teacherName);
    }

   public void assignGrade(Student alum, int finalGrade){
        Student.grade = finalGrade;
   }
}
