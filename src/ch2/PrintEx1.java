package ch2;

public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010;
        int hexNum = 0x10;
        int binNum = 0b10;

        System.out.printf("b=%d%n", b);
        System.out.println(binNum);
        System.out.printf("bimNum=%s%n", Integer.toBinaryString(binNum));
    }
}
