package ch6;

class Block {
    static {
        System.out.println("Block static { }");
    }
}

public class BlockTest_2 {
    // 클래스 초기화 블럭
    static {
        System.out.println("static { }");
    }

    // 인스턴스 초기화 블럭
    {
        System.out.println("instance { }");
    }

    public BlockTest_2() {
        System.out.println("생성자");
    }

    public static void main(String[] args) {
        BlockTest_2 blockTest_2 = new BlockTest_2();
        BlockTest_2 blockTest_21 = new BlockTest_2();

        Block block = new Block();
    }
}
