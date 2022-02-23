package ch2;

import java.util.Date;

public class VarEx2 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        int tmp = 0;

        System.out.println(x + ", " + y);

        tmp = x;
        x = y;
        y = tmp;
        System.out.println(x + ", " + y);

        Date today = new Date();
        System.out.println(today);

        Object obj = new Object();
        System.out.println(obj.toString());

        final int MAX_SPEED;
        MAX_SPEED = 10;
        System.out.println(MAX_SPEED);

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;
        System.out.println(octNum + ", " + hexNum + ", " + binNum);

        float pi = 3.14f;
        char ch = 'J';
        String name = new String("Java");
        System.out.println(name);
    }
}
