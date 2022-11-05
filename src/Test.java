public class Test {
    public  static void  main(String[]args){
        Student stud1 = new Student("Giorgia", 88);
        Student stud2 = new Student("Franco",66);

        Teacher teacher1 = new Teacher("Maura");

        String  studentDetailTot =  Student.getStudentDetails();
        System.out.println("student " + studentDetailTot + "/100");
    }
}

/**
 * Ho la sensazione che ci sia qualcosa che non va all'interno del codice.
 * anche se mi stampa sia tutti e due gli studenti che un solo studente con il metodo get__()...
 * forse dovrebbe stampare solo una volta?
 */