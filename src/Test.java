public class Test {
    public  static void  main(String[]args){
        Student stud1 = new Student("Giorgia", 88);
        Student stud2 = new Student("Franco",66);

        Teacher teacher1 = new Teacher("Maura");

        String  studentDetailTot =  Student.getStudentDetails();
        System.out.println("student " + studentDetailTot + "/100");











    }
}
