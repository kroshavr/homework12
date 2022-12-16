public class Main {
    public static void main(String[] args) {
        Author author = new Author("Михаил ", "Булгаков");
        Book book = new Book ("Собачье сердце", author, 1925);
        System.out.println(book.getBookName()+" "+book.getPublishingYear()+ " " +author.getFirstName() + author.getSecondName());

        Author author1 = new Author("Александр ", "Пушкин");
        Book book1 = new Book("Капитанская дочка", author1, 1836);
        System.out.println(book1.getBookName()+" "+book1.getPublishingYear()+ " " +author1.getFirstName() + author1.getSecondName());
        book1.setPublishingYear(1837);
        System.out.println(book1.getBookName()+" "+book1.getPublishingYear()+ " " +author1.getFirstName() + author1.getSecondName());
        }
}