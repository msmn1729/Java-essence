package ch6;

class Document_2 {
    private static int count;
    String name;

    Document_2() {
        name = "제목없음" + ++count;
        System.out.println(name + " 생성");
    }

    Document_2(String name) {
        this.name = name;
    }
}

public class DocumentTest_2 {
    public static void main(String[] args) {
        Document_2 document_2 = new Document_2();
        Document_2 document_21 = new Document_2("아기상어");
        System.out.println(document_21.name);

        Document_2 document_22 = new Document_2();
        System.out.println(document_22.name);
        Document_2 document_23 = new Document_2("정글만리");
        System.out.println(document_23.name);
    }
}
