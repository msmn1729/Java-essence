package ch2;

public class CastingEx2 {
    public static void main(String[] args) {
        byte a = (byte) 128;
        System.out.println(a);
        int i = 10;
        byte b = (byte) i;
        System.out.println(i + " " + b);

        i = 300;
        b = (byte) i;
        System.out.println(i + " " + b);
    }
}
