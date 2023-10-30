import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        //Tworzenie ksiazek o tych samych i roznych numerach ISBN
        Book book1 = new Book("Book_1", "Author_1", "1234567899876");
        Book book2 = new Book("Book_2", "Author_2", "1234567899876");
        Book book3 = new Book("Book_3", "Author_3", "1234567899876");
        Book book4 = new Book("Book_4", "Author_4", "9876543211234");
        Book book5 = new Book("Book_5", "Author_5", "9876543211234");
        Book book6 = new Book("Book_6", "Author_6", "5678998765432");
        Book book7 = new Book("Book_7", "Author_7", "3456789987654");

        //Tworzenie zbioru i dodawanie do niego ksiazek
        HashSet<Book> BookSet = new HashSet<>();
        BookSet.add(book1);
        BookSet.add(book2);
        BookSet.add(book3);
        BookSet.add(book4);
        BookSet.add(book5);
        BookSet.add(book6);
        BookSet.add(book7);

        //Petla wypisujaca poszczegolne ksiazki
        for(Book book : BookSet)
        {
            System.out.println("Tytul ksiazki: " + book.getTitle() + " , Autor ksiazki: " + book.getAuthor() + " ,a jej numer ISBN to: " + book.getISBN());
        }
        //Informacja o ilosci ksiazek w zbiorze
        System.out.println("W zbiorze znajduje sie " + BookSet.size() + " ksiazek");

    }
}