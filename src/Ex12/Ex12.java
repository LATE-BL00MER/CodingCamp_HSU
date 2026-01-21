package Ex12;

class Book {
    private String title;
    private String author;
    private int price;

    // 기본 생성자
    public Book() {
        this("아기돼지 3형제", "미상", 1000);
    }

    // 매개변수 2개 생성자
    public Book(String title, String author) {
        this(title, author, 1000);
    }

    // 매개변수 3개 생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

}

public class Ex12 {
    public static void main(String[] args) {
        Book book1 = new Book(); // 기본 생성자 확인
        Book book2 = new Book("미녀와 야수", "디즈니");
        Book book3 = new Book("겨울왕국", "디즈니", 15000);

        System.out.println("기본 생성자: " + book1.getTitle() + "," +  book1.getAuthor() + "," + book1.getPrice());
        System.out.println("매개변수 1 생성자: " + book2.getTitle() + "," +  book2.getAuthor() + "," + book2.getPrice());
        System.out.println("매개변수 2 생성자: " + book3.getTitle() + "," +  book3.getAuthor() + "," + book3.getPrice());

    }
}
