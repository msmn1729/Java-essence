package ch7;

import java.util.Vector;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price / 10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv extends Product {
    Tv() {
        super(100); // Tv의 가격을 100만원으로 한다
    }
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    int i = 0;
    Vector item = new Vector();

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("잔액이 부족합니다");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + " 구입 완료");
    }

    void refund(Product p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " 환불 완료!");
        } else {
            System.out.println("구매한 물품이 아닙니다");
        }
    }

    void summary() {
        int priceSum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("구입한 제품이 없습니다.");
            return;
        }

        for (int i = 0; i < item.size(); i++) {
            if (item.get(i) == null) break;
            Product p = (Product) item.get(i);
            priceSum += p.price;
            itemList += ((i == 0) ? p : ", " + p);
        }
        System.out.println("총 구매항목: " + itemList);
        System.out.println("총 금액: " + priceSum);
    }
}

public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer buyer = new Buyer();
        Tv tv = new Tv();
        Computer computer = new Computer();
        System.out.println(buyer.money + ", " + buyer.bonusPoint);
        buyer.buy(tv);
        System.out.println(buyer.money + ", " + buyer.bonusPoint);
        buyer.buy(computer);
        System.out.println(buyer.money + ", " + buyer.bonusPoint);

        System.out.println();
        buyer.summary();

        buyer.refund(tv);

        System.out.println();
        buyer.summary();
    }
}
