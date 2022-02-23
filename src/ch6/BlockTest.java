package ch6;

public class BlockTest {
    static {
        System.out.println("static { }");
    }
    {
        System.out.println("{ }");
    }

    public BlockTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        System.out.println("BlockTest b1 = new BlockTest();");
        BlockTest bt;
        bt = new BlockTest();

        System.out.println("BlockTest b2 = new BlockTest();");
        BlockTest bt2 = new BlockTest();
    }
}
