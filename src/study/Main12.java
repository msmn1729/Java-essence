package study;

public class Main12 {
    public static void main(String[] args) {
        HelloWorld a = get();
        a.helloWorld();
    }

    static HelloWorld get() {
        return new B();
    }

    static class A implements HelloWorld {
        void a() {
            System.out.println("Hello");
        }

        void b() {
            System.out.println("World");
        }

        void c() {
            System.out.println("건열");
        }

        public void helloWorld() {
            a();
            b();
            c();
        }
    }

    static class B implements HelloWorld {
        @Override
        public void helloWorld() {
            System.out.println("HelloWorld 경수");
        }
    }

    static interface HelloWorld {
        void helloWorld();
    }

}
