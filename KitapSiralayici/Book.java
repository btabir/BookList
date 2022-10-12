package KitapSiralayici;

public class Book implements Comparable<Book> {

    private String bookName;
    private Integer pageSize;
    private String writerName;
    private Integer releaseYear;

    public Book(String bookName, Integer pageSize, String writerName, Integer releaseYear) {
        this.bookName = bookName;
        this.pageSize = pageSize;
        this.writerName = writerName;
        this.releaseYear = releaseYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public String getWriterName() {
        return writerName;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    @Override
    public int compareTo(Book o) {
        return this.getBookName().compareTo(o.bookName);
    }
}
