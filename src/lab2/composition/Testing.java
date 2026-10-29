package lab2.composition;

public final class Testing {

    private Testing() { }

    public static void main(final String[] args) {
        /*
         * 1) Creare 3 studenti a piacere 2) Creare 2 docenti a piacere 3)
         * Creare due aulee di esame, una con 100 posti una con 80 posti 4)
         * Creare due esami, uno con nMaxStudents=10, l'altro con nMaxStudents=2
         * 5) Iscrivere tutti e 3 gli studenti agli esami 6) Stampare in stdout
         * la rapresentazione in stringa dei due esami
         */
    	Student s1 = new Student(122, "Steve", "Wozniak", "rottenapples2399!", 2019);
    	Student s2 = new Student(89, "Charles", "Babbage", "120jdsa2nse!", 2024);
    	Student s3 = new Student(89, "Gordon", "Ramsey", "underc00k3dsqu1d£", 2021);
    	
    	Professor p1 = new Professor(213, "Edmondo", "De Amicis", "custoza1866%", new String[]{"Letteratura Italiana", "Pedagogia", "Sociologia e Scienze Politiche"});
    	Professor p2 = new Professor(213, "Hakeem", "Olajuwon", "9495dreamchamp2!", new String[]{"Fisica dei Sistemi Rotatori", "Scienze Motorie", "Filosofia della Resilienza Civile"});
    	
    	Exam e1 = new Exam(64228, 10, "Fisica dei Sistemi Rotatori", p2, new ExamRoom(15, "Aula A", false, false));
    	Exam e2 = new Exam(64229, 2, "Sociologia e Scienze Politiche", p1, new ExamRoom(20, "Aula C1", false, false));
    	
    	e1.registerStudent(s1);
    	e1.registerStudent(s2);
    	e1.registerStudent(s3);
    	
    	
    	e2.registerStudent(s1);
    	e2.registerStudent(s2);
    	e2.registerStudent(s3);
    	
    	System.out.println(e1.toString());
    	System.out.println(e2.toString());
    }
}
