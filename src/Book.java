public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishingYear;

    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = new Author(authorName.firstName, authorName.secondName);
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String toString() {
        return bookName + authorName + publishingYear;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass())
            return false;
        Book book = (Book) obj;
        return bookName + publishingYear + authorName == book.bookName + book.publishingYear + book.authorName;
    }
    public int hashCode () {
        return java.util.Objects.hash(bookName, publishingYear, authorName);
    }
}





