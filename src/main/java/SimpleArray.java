public class SimpleArray {
    public static void main(String[] args) {
        String[] books = new String[5];
        books[0] = "Harry Potter";
        books[1] = "Lord of the Rings";
        books[2] = "Forrest Gump";
        books[3] = "Grey";
        books[4] = "Sherlock Holmes";
        String book = books[2];
        System.out.println(book);
        int numberOfElements = books.length;
        System.out.println("Moja tablica ma");
        System.out.println(numberOfElements);
        System.out.println("elementów");
    }
    }