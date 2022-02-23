package ch6;

class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color2, String gearType2, int door2) {
        color = color2;
        gearType = gearType2;
        door = door2;
    }
}

public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println(c1.color + " " + c1.gearType + " " + c1.door);
        System.out.println(c2.color + " " + c2.gearType + " " + c2.door);
    }
}
