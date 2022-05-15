package ch6;

class Test {
    int x;
}

public class PrimitiveParamEx {
    public static void main(String[] args) {
        Test test = new Test();
        test.x = 500;
        System.out.println("변경 전: " + test.x);
        change(test.x);
        System.out.println("변경 후: " + test.x);

        change2(test);
        System.out.println("변경 후: " + test.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("기본형 매개변수의 값 변경");
    }

    static void change2(Test test) {
        test.x = 2000;
        System.out.println("참조형 매개변수의 값 변경");
    }
}
