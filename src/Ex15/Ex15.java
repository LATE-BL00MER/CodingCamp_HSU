package Ex15;

class Car {
    private String make; // 제조사
    private String model; // 모델명
    private int year; // 제조 연도

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}

public class Ex15 {
    public static void main(String[] args) {
        Car car = new Car("Hyundai", "Genesis", 2025);

        System.out.println("제조사: " + car.getMake());
        System.out.println("모델명: " + car.getModel());
        System.out.println("제조 연도: " + car.getYear());
    }
}
