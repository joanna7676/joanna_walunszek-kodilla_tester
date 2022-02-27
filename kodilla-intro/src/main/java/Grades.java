 public class Grades {
    private int[] list = new int[10];
    private int size = 0;

    public void addGrades(int grades) {
        list[size] = grades;
        size++;
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(list[i] + " ");
        }
    }
    public int findLast() {
        int ostatnia = list[0];
        for (int i = 0; i < size; i++) {
            int ocena = list[i];
            ostatnia = ocena;
        }
        return ostatnia;
    }
    public int sumaOcen() {
        int suma = 0;
        for (int i = 0; i < size; i++) {
            suma += list[i];
         }
        return suma;
             }

    public double Average() {
         double suma = 0;
         int size = list.length;
        for (int i = 0; i < size; i++) {
            suma += list[i];
        }
        double sredniaOcen = suma / size;
         return sredniaOcen;
     }
 }
