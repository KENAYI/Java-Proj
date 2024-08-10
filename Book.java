public class Book {
    //public String title;
    //public String author;

    private String title;
    private String author;
    private int pageCount;

    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    // Implement toString method to avoid error in console
    @Override
    public String toString() {
        return String.format("%s by %s", this.title, this.author);
    }
}
