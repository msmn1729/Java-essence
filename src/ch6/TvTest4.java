package ch6;

class TvTest4 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i] = new Tv();
            tvArr[i].channer = i + 10;
        }
        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(tvArr[i].channer);
        }
        for (int i = 0; i < tvArr.length; i++) {
            tvArr[i].channelUp();
        }
        System.out.println();
        for (int i = 0; i < tvArr.length; i++) {
            System.out.print(tvArr[i].channer);
        }
    }
}