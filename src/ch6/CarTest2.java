package ch6;

class Car {
    private int num;
    private String name;

    Car() {
        // 생성자에서 생성자를 호출할 때는 this()를 사용하고, 반드시 첫째 줄에서 호출해야함
//        System.out.println(); // 에러
        this(7777, "Benz");
        System.out.println();
    }

    Car(int num) {
        this(num, "BMW");
    }

    Car(int num, String name) {
        this.num = num;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);

        Car car2 = new Car(2022);
        System.out.println(car2);

        Car car3 = new Car(4321, "sonata");
        System.out.println(car3);
    }
}