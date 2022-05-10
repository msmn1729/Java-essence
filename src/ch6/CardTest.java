package ch6;

class Card {
    // 카드의 크기는 클래스 변수
    static int width;
    static int height;

    // 카드의 패턴과 숫자는 인스턴스 변수
    String patten;
    int number;

    Card(String patten, int number) {
        this.patten = patten;
        this.number = number;
    }
}

public class CardTest {
    public static void main(String[] args) {
        Card.width = 50;
        Card.height = 100;
        Card card = new Card("clover", 7);
        Card card2 = new Card("heart", 3);

        System.out.println(card.width);
        System.out.println(card.height);

        Card.width += 100;
        Card.height += 100;
        System.out.println(card2.width);
        System.out.println(card2.height);
    }
}
