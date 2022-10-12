package KitapSiralayici;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        TreeSet<Book> books = new TreeSet<Book>();

        Book b1 = new Book("Don Kişot",75,"Amicis",1550);
        Book b2 = new Book("Alis Harikalar Diyarında",120,"Lewis Carroll",1974);
        Book b3 = new Book("Oliver Twist",35,"Charles Dickens",1955);
        Book b4 = new Book("Elon Musk",300,"Elon Muska",2015);
        Book b5 = new Book("Tanrı Yanılgısı",255,"Richard Dawkins",1998);

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println();
        System.out.println("Kitap Adına Göre Alfabetik Sıralama ");
        System.out.println();
        for (Book book : books){
            System.out.println("Kitap Adı : " +book.getBookName() + " , "+
                                "Yazarı : " +book.getWriterName() + " , "+
                                "Sayfa Sayısı : " + book.getPageSize() + " , "+
                                "Yayınlanma Yılı : " + book.getReleaseYear());
        }

        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println();
        System.out.println("Sayfa Uzunluğuna Göre Sıralama");
        System.out.println();
        TreeSet<Book> books2 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageSize()-o2.getPageSize();
            }
        });

        books2.add(b1);
        books2.add(b2);
        books2.add(b3);
        books2.add(b4);
        books2.add(b5);

        for (Book book2 : books2){
            System.out.println("Kitap Adı : " +book2.getBookName() + " , "+
                    "Yazarı : " +book2.getWriterName() + " , "+
                    "Sayfa Sayısı : " + book2.getPageSize() + " , "+
                    "Yayınlanma Yılı : " + book2.getReleaseYear());
        }
    }
}
