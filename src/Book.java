public class Book {
    String bookName;
    Author authorName;
    int publishingYear;
    public Book (String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = new Author (authorName.firstName, authorName.secondName);
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
}

