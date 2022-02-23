//package ch7;
//
//interface I {
//    public abstract void methodB();
//}
//
//class A {
//    public void methodA(I i) {
//        i.methodB();
//    }
//}
//
//class B implements I {
//    @Override
//    public void methodB() {
//        System.out.println("methodB in B class");
//    }
//}
//
//public class InterfaceTest {
//    public static void main(String[] args) {
//        A a = new A();
//        a.methodA(new B());
//    }
//}
