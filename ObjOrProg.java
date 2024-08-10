
class ObjOrProg {
    public static void main(String[] args) {
        // Create younger user, for this example

        //User yngrUser = new User();

        //yngrUser.name = "Chikenayi Weli jr";
        //yngrUser.birthDay = LocalDate.parse("2003-08-03");

        //System.out.printf("%s was born back in %s and is now %d years old. \n", yngrUser.name, yngrUser.birthDay.toString(), yngrUser.age());


        // Create older user, for this example

        //User olderUser = new User();

        //olderUser.name = "Chikenayi Weli sr";
        //olderUser.birthDay = LocalDate.parse("1983-08-03");

        //System.out.printf("%s was born back in %s and is now %d years old. \n", olderUser.name, olderUser.birthDay.toString(), olderUser.age());


        // Create general user object and separate public class for user

        //User user = new User();
        //user.name = "Chikenayi Weli jr";
        //user.birthDay = LocalDate.parse("2003-08-03");

        //User user = new User("Chikenayi Weli jr", "2003-08-03");

        // Create a book object and separate public class for book 

        Book book = new Book("The Old man and the sea", "Ernest Hemingway", 270);
        AudioBook Dracula = new AudioBook("Dracula", "Bram Stoker", 30000);
        Ebook Jeeves = new Ebook("Carry On Jeeves", "P.G. Wodehouse", 280, "PDF");

        //book.title = "The Old man and the sea";
        //book.author = "Ernest Hemingway";

        //user.borrow(book);

        //System.out.printf("%s was born back in %s and is now %d years old. \n", user.name, user.birthDay.toString(), user.age());
        //System.out.printf("%s was born back in %s and is now %d years old. \n", user.getName(), user.getBirthDay(), user.age());


        //System.out.printf("%s has borrowed this book: %s \n", user.getName(), user.borrowedBooks());

        System.out.println(Dracula.toString());
        System.out.println(Jeeves.toString());
    }    
}
