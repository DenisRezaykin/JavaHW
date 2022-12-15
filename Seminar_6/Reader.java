import java.util.Arrays;

public class Reader {
    private String fullName;
    private int number;
    private String faculty;
    private String dateOfBirthday;
    private int phoneNumber;

    public Reader(String fullName, int number, String faculty, String dateOfBirthday, int phoneNumber){
        this.fullName = fullName;
        this.number = number;
        this.faculty = faculty;
        this.dateOfBirthday = dateOfBirthday;
        this.phoneNumber = phoneNumber;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count){
        System.out.println(getFullName() + " took " + count + " book(s)");
    }
    public void takeBook(String... nameOfTheBook){
        System.out.println(getFullName() + " took the book: ");
        for (String s : nameOfTheBook) {
            System.out.print(s + " ");
        }
    }
    public void takeBook(Book... obj){
        System.out.println(getFullName() + " took ");
        for (Book book : obj) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }
    public void returnBook(int count){
        System.out.println(getFullName() + "  returned  " + count + " book(s)");
    }
    public void returnBook(String... nameOfTheBook){
        System.out.println(getFullName() + " returned the book: ");
        for (String s : nameOfTheBook) {
            System.out.print(s + " ");
        }
    }
    public void returnBook(Book... obj){
        System.out.println(getFullName() + " returned ");
        for (Book book : obj) {
            System.out.print(book + ", ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fullName='" + fullName + '\'' +
                ", number=" + number +
                ", faculty='" + faculty + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}