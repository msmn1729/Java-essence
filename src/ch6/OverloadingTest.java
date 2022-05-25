package ch6;

public class OverloadingTest {
    public static void main(String[] args) {
        System.out.println(main(3, 5));
    }

    // main 메서드도 오버로딩이 가능
    public static int main(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    // 이 메서드는 에러 발생 -> 오버로딩은 매개변수 타입 / 개수만 영향을 끼침
    // 주의) 리턴타입만 바꾸면 오버로딩이 되지 않음 -> 메서드 호출시 이름과 매개변수만 작성하므로 어떤 메서드를 호출하는지 모호하기 때문
//    public static boolean sum(double a, int b) {
//        return a + b;
//    }
}
