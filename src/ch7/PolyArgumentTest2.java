//package ch7;
//
//class Product {
//    int price;
//    int bonusPoint;
//
//    Product(int price) {
//        this.price = price;
//        bonusPoint = (int)(price / 10.0);
//    }
//
//    Product() {}
//}
//
//class Tv extends Product {
//    Tv() {
//        super(100); // Tv의 가격을 100만원으로 한다
//    }
//    public String toString() {
//        return "Tv";
//    }
//}
//
//class Computer extends Product {
//    Computer() {
//        super(200);
//    }
//    public String toString() {
//        return "Computer";
//    }
//}
//
//class Buyer {
//    int money = 1000;
//    int bonusPoint = 0;
//    int i = 0;
//    Product[] items = new Product[10];
//
//    void buy(Product p) {
//        if (money < p.price) {
//            System.out.println("잔액이 부족합니다");
//            return;
//        }
//        money -= p.price;
//        bonusPoint += p.bonusPoint;
//        items[i++] = p;
//        System.out.println(p + " 구입 완료");
//    }
//
//    void summary() {
//        int priceSum = 0, bonusPointSum = 0;
//        String itemList = "";
//
//        for (int i = 0; i < items.length; i++) {
//            if (items[i] == null) break;
//            itemList += items[i] + ", ";
//            priceSum += items[i].price;
//            bonusPointSum += items[i].bonusPoint;
//        }
//        System.out.println("구매항목: " + itemList);
//        System.out.println("합계 금액: " + priceSum);
//        System.out.println("합계 보너스: " + bonusPointSum);
//    }
//}
//
// class PolyArgumentTest2 {
//    public static void main(String[] args) {
//        Buyer buyer = new Buyer();
//        System.out.println(buyer.money + ", " + buyer.bonusPoint);
//        buyer.buy(new Tv());
//        System.out.println(buyer.money + ", " + buyer.bonusPoint);
//        buyer.buy(new Computer());
//        System.out.println(buyer.money + ", " + buyer.bonusPoint);
//
//        buyer.summary();
//    }
//}
