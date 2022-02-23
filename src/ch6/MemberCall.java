package ch6;

public class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv; // 인스턴스 변수는 클래스 변수를 사용할 수 있음
    static int cv2 = new MemberCall().iv;

    static void staticMethod1() {
        System.out.println(cv);
        MemberCall c = new MemberCall();
        System.out.println(c.iv);
    }

    static int add(int... args) {
        for (int i : args) {
            System.out.println(i);
        }
        System.out.println(args[0]);
        return args.length;
    }

    static void func(int[] ar) {

    }

    public static void main(String[] args) {
        System.out.println(add(1, 9, 5));
        func(new int[]{1, 2, 3});
    }
}
