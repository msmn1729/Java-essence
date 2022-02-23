package ch3;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.println(i + " " + j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.println(i + " " + j);

        int x = 5;
        x = x++ - ++x;
        System.out.println(x);
    }
}
