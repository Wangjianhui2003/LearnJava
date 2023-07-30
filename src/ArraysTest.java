//Arrays类sort,Comparator
import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("Journey",111);
        books[1] = new Book("Home",264);
        books[2] = new Book("GodFather",323);
        books[3] = new Book("One",434);

        //从小到大排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
        System.out.println(Arrays.toString(books));

        //按名字长度排序
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().length() - o2.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));

    }
}

class Book{
    private String name;
    private int price;
    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{" + "name:" + name +
                ", price:" + price +
                '}';
    }
}