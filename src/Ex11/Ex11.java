package Ex11;

class Dog {
    private String name;
    private String color;

    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}

public class Ex11 {
    public static void main(String[] args) {
        Dog myDog = new Dog("ppo", "brown");

        System.out.println("이름 :" + myDog.getName());
        System.out.println("색상 :" + myDog.getColor());
    }
}
