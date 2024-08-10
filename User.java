import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    //public String name;
    //public LocalDate birthDay;
    //public ArrayList<Book> books = new ArrayList<>();

    private String name;
    private LocalDate birthDay;
    private ArrayList<Book> books = new ArrayList<>();

    // Create constructor method

    User(String name, String birthDay) {
        this.name = name;
        this.birthDay = LocalDate.parse(birthDay);
    }

    // Create method to get name

    public String getName() {
        return this.name;
    }

    // Create method to get birthday

    public String getBirthDay() {
        return this.birthDay.toString();
    }

    public String borrowedBooks() {
        return this.books.toString();
    }

    // Create a method to log borrowed books, returns nothing thus 'void'

    public void borrow(Book book) {
        this.books.add(book);
    }

    // Create a method to calculate user's age, returns integer

    public int age() {
        Period age = Period.between(this.birthDay, LocalDate.now());

        return age.getYears();
    }
}
