public class Test {
    public  static void  main(String[]args){
        Student stud1 = new Student("Giorgia");  /**non prende il nome*/
        Student stud2 = new Student( "Franco");

        Teacher teacher1 = new Teacher("Maura");
        teacher1.assignGrade(stud1,60);
        teacher1.assignGrade(stud2, 80);

        stud1.getStudentDetails();
        stud2.getStudentDetails();
        System.out.println("Student " + stud1.name + " , vota " + stud1.grade + "/100");
        System.out.println("Student " + stud2.name + " , vota " + stud2.grade + "/100");
    }
}

/**
 * così non mi stampa il voto assegnato dal professore,
 * vorrei che venisse stampato così
 *
 * "Student Giorgia, vote 60/100";
 * "Student Franco, vote 80/100";
 *
 * come posso fare?
 */