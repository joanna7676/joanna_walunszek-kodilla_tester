public class NewGrades {
    public static void main(String[] args) {
        Grades grades = new Grades();
        grades.addGrades(2);
        grades.addGrades(2);
        grades.addGrades(2);
        grades.addGrades(3);
        grades.addGrades(3);
        grades.addGrades(4);
        grades.addGrades(5);
        grades.addGrades(5);
        grades.addGrades(6);
        grades.addGrades(6);

        System.out.println("Lista ocen");
        grades.display();

        int ocena = grades.findLast();
        System.out.println(" ");
        System.out.println("Ostatnia ocena   " + ocena);

        int suma = grades.sumaOcen();
        System.out.println("Suma ocen   " + suma);

        double sredniaOcen = grades.Average();
        System.out.println("Srednia ocen   " + sredniaOcen);
    }
}