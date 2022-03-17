public class BookApp {
    public static void main(String[] args) {
        Book book = Book.of("Isaac Asimov", "The Galaxy");

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
    }
}
