package ch6;

class Data {
    int value;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data data1 = new Data();
        data1.value = 7;

        Data data2 = copy1(data1);
        System.out.println(data1 + " " + data1.value); // data1의 주솟값 7
        System.out.println(data2 + " " + data2.value); // 9
        System.out.println("\n");

        Data data3 = copy2(data1);
        System.out.println(data1 + " " + data1.value); // 9
        System.out.println(data3 + " " + data3.value); // 0
    }

    static Data copy1(Data data) {
        Data tmp = new Data();
        tmp.value = data.value; // 이 경우에는 data1, data2 참조변수의 주솟값이 다르다
        tmp.value = 9;
        return tmp;
    }

    static Data copy2(Data data) {
        Data tmp = data;
        tmp = new Data(); // 이 경우에는 data1, data3 참조변수의 주솟값이 같다
        data.value = 9;
        return tmp;
    }
}

/*
ch6.Data@1540e19d 7
ch6.Data@677327b6 7

ch6.Data@1540e19d 7
ch6.Data@1540e19d 7
 */