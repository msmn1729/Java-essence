package ch6;

class MyMath2 {
    long a, b;

    long add(long a, long b) {
        return a + b;
    }
}

class MyMathTest2 {
    public static void main(String[] args) {
        MyMath2 mm = new MyMath2();
        mm.a = 3;
        mm.b = 5;
        System.out.println(mm.add(1, 2));
    }
}

