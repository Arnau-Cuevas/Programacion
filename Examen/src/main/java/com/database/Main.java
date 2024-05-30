package JavaDatabaseExample.src.main.java.com.database;

public class Main {
    public static void main(String[] args) {
        DatabaseManager dbManager = new DatabaseManager();
        dbManager.connect();

        // Crear un nou llibre
        Student book = new Book(1, "Programació", 2023);
        dbManager.addBook(book);

        // Recuperar un llibre
        Student retrievedBook = dbManager.getBook(1);
        System.out.println(retrievedStudent);

        // Actualitzar un llibre
        book.setYear(2021);
        dbManager.updateBook(book);

        // Eliminar un llibre
        dbManager.deleteBook(1);

        dbManager.disconnect();
    }
}
