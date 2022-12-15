public class Runner {
    public static void main(String[] args) {
        Reader[] people = new Reader[3];
        people[0] = new Reader("Sokol O.O", 5, "Computer Science", "01.01.1999", 677777777);
        people[1] = new Reader("Petrov A.K", 10, "Economic", "10.10.2000", 688888888);
        people[2] = new Reader("Boyko S.T", 7, "Math", "20.12.2001", 655555555);
        Book[] books = new Book[3];
        books[0] = new Book("Snow White", "Grimm brothers");
        books[1] = new Book("Red Riding hood", "Charles Perrault");
        books[2] = new Book("Bun", "People");

        people[0].takeBook(books[0], books[1], books[2]);
        people[0].returnBook(books[0], books[1], books[2]);
    }
}