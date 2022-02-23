package ch5;

public class ArrayEx4 {
    public static void main(String[] args) {
        char[] abc = {'A', 'B', 'C'};
        char[] num = {'0', '1', '2', '3'};

        char[] result = new char[abc.length + num.length];
        System.arraycopy(abc, 0, result, 0, abc.length);
        System.out.println(result);
        System.arraycopy(num, 0, result, abc.length, num.length);
        System.out.println(result);
    }
}
