package Ex10;

class Cat {
    private String name;
    private int age;

    public Cat() {
        this.name = "Unknown";
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class Ex10  {
    public static void main(String[] args) {
        Cat myCat = new Cat();

        System.out.println("이름: " + myCat.getName());
        System.out.println("나이: " + myCat.getAge());
    }
}
