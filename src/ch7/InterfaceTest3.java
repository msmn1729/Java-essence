package ch7;

public class InterfaceTest3 {
    public static void main(String[] args) {
        A a = new A();
        a.methodA();
    }
}

interface I {
    public abstract void methodB();
}

class A {
    void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }
}

class B implements I {
    @Override
    public void methodB() {
        System.out.println("methodB in B class");
    }
    public String toString() {
        return "class B";
    }
}

class InstanceManager {
    public static I getInstance() {
        return new B();
    }
}

