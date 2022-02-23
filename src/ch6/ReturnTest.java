package ch6;

public class ReturnTest {
    public static void main(String[] args) {
        ReturnTest r = new ReturnTest();
        int res = add(3, 4);
        System.out.println(res);
    }

    static int add(int a, int b) {
        int x;
        return a + b;
    }
}
