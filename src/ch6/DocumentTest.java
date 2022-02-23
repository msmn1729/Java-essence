package ch6;

class Document {
    static int count = 0;
    String name;

    Document() {
        this("제목없음" + ++count);
    }

    Document(String name) {
        this.name = name;
        System.out.println(name + "이 생성되었습니다.");
    }
}

public class DocumentTest {
    public static void main(String[] args) {
        Document d1 = new Document();
        Document d2 = new Document("자바의 정석");
        Document d3 = new Document();
        Document d4 = new Document();
    }
}
