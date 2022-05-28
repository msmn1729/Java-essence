package ch8;

public class FinallyTest3 {
    public static void main(String[] args) {
        method1();
    }

    static void method1() {
        try {
            System.out.println("method1()이 실행");
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("method1()의 finally 블럭 실행"); // try/catch 블럭에서 return을 해도 실행됨
        }
    }
}
