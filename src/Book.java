import java.util.Objects;

public class Book {

    // Tworzenie pol potrzebnych do utworzenia ksiazki
    private String title;
    private String author;
    private String ISBN;

    // Konstruktor dla ksiazki
    public Book(String title, String author, String ISBN)
    {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    // metoda equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return Objects.equals(getISBN(), book.getISBN());
    }

    // metoda hashCode
    @Override
    public int hashCode() {
        return Objects.hash(getISBN());
    }

    // Gettery dla poszcegolnych pol
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }
}
