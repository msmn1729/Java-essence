package ch6;

class Car3 {
    private int num;
    private String name;

    Car3(int num, String name) {
        this.num = num;
        this.name = name;
    }

    Car3(Car3 car3) {
//        num = car3.num;
//        name = car3.name;

        // 이미 생성한 생성자를 활용하는 것이 바람직
        this(car3.num, car3.name);
    }

    @Override
    public String toString() {
        return "Car3{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}

public class CarTest3 {
    public static void main(String[] args) {
        Car3 car3 = new Car3(33, "Avante");
        Car3 car3Copy = new Car3(car3);

        System.out.println(car3);
        System.out.println(car3Copy);
    }
}
