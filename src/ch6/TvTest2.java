package ch6;

class Tv2 {
    String color;
    boolean power;
    int channel;

    void setColor(String color) {
        this.color = color;
    }

    void power(boolean power) {
        this.power = !power;
    }

    void channelUp() {
        channel++;
    }

    void channelDown() {
        channel--;
    }
}

public class TvTest2 {
    public static void main(String[] args) {
        Tv2 tv2 = new Tv2();
        tv2.setColor("blue");
        System.out.println(tv2.color);
        tv2.power(tv2.power);
        System.out.println(tv2.power);
        tv2.power(tv2.power);
        System.out.println(tv2.power);

        tv2.channelUp();
        System.out.println(tv2.channel);
        tv2.channelDown();
        System.out.println(tv2.channel);
    }
}
