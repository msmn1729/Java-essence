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
//
//    void buy(Product p) {
//        if (money < p.price) {
//            System.out.println("잔액이 부족합니다");
//            return;
//        }
//        money -= p.price;
//        bonusPoint += p.bonusPoint;
//    }
//}
//
//public class PolyArgumentTest {
//    public static void main(String[] args) {
//        Buyer buyer = new Buyer();
//        System.out.println(buyer.money + ", " + buyer.bonusPoint);
//        buyer.buy(new Tv());
//        System.out.println(buyer.money + ", " + buyer.bonusPoint);
//        buyer.buy(new Computer());
//        System.out.println(buyer.money + ", " + buyer.bonusPoint);
//    }
//}
