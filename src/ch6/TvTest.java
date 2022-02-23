package ch6;

class Tv {
    // Tv의 속성(멤버변수)
    String color;
    boolean power;
    int channer;

    // Tv의 기능(메서드)
    void power() {
//        power != power;
    }
    void channelUp() {
        ++channer;
    }
    void channelDown() {
        --channer;
    }
}

class TvTest {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();
        t.channer = 7;
        t.channelDown();
        System.out.println(t.channer);
    }
}
