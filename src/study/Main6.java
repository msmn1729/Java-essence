package study;

public class Main6 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello2");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("world2");
        });
//        t.start();

        System.out.println("hello2");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("world2");
        System.out.println("hello");
        Thread.sleep(5000);
        System.out.println("world");
    }
}
