package ch6;

class MathTest2 {
    private int a, b;

    public MathTest2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // 클래스 메서드(스태틱 메서드)
    public static int sum(int a, int b) {
        return a + b;
    }

    // 인스턴스 메서드
    public int sum() {
        return a + b;
    }
}

public class MyMathTest2_2 {
    public static void main(String[] args) {
        // 스태틱 메서드: 인스턴스 생성없이 메서드 호출 가능
        // 인스턴스 멤버변수를 참조할 수 없으므로 매개변수로 넘겨준다
        System.out.println(MathTest2.sum(3, 5));

        // 인스턴스 메서드: 인스턴스를 생성 후 메서드 호출 가능
        // 인스턴스 멤버변수 참조가 가능함
        MathTest2 mathTest2 = new MathTest2(10, 20);
        System.out.println(mathTest2.sum());
    }
}
