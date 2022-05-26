package ch6;

class Product {
    private static int serialNum;

    // 인스턴스 초기화블럭
    {
        serialNum++;
        System.out.println(serialNum);
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product();
        Product product2 = new Product();
        Product product3 = new Product();
    }
}
