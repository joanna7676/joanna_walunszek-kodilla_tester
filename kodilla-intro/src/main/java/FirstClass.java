public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Weight Price Year");

        Notebook notebook = new Notebook( 600, 900, 2000);
        System.out.println(notebook.weight + " " + notebook.price + "  " + notebook.year);
        notebook.checkWeight();
        notebook.checkPrice();
        notebook.checkYear();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2015);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price + "  " + heavyNotebook.year);
        heavyNotebook.checkWeight();
        heavyNotebook.checkPrice();
        heavyNotebook.checkYear();

        Notebook oldNotebook = new Notebook(1600, 500, 2013);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price + "  " + oldNotebook.year);
        oldNotebook.checkWeight();
        oldNotebook.checkPrice();
        oldNotebook.checkYear();

    }
    }
