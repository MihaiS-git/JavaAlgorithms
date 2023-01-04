public class Main {
    public static void main(String[] args) {

        for(int i=1; i<= 5; i++){
            LPAStudent s = new LPAStudent("S95465"+i,
                    switch (i){
                case 1 -> "Marry";
                case 2 -> "Carol";
                case 3 -> "Tim";
                case 4 -> "Harry";
                case 5 -> "Lisa";
                default -> "Anonymous";
                    },
                    switch (i){
                case 1 -> "18/05/1988";
                case 2 -> "24/12/2000";
                case 3 -> "04/03/1990";
                case 4 -> "13/05/1991";
                case 5 -> "09/07/1987";
                default -> "xx/xx/xxxx";
                    },
                    "Java Masterclass");
            System.out.println(s);
        }
        Student pojoStudent = new Student("S95480","Ann",
                "05/11/1986","Java MAsterclass");
        LPAStudent recordStudent = new LPAStudent("S95490", "Bill",
                "12/06/1989", "Java Masterclass");
        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
       // recordStudent.setClassList(recordStudent.classList() + ", Java OCP Exam 829");
        System.out.println(pojoStudent.getName()+" is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name()+" is taking " + recordStudent.classList());

    }
}
