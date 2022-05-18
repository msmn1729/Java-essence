package ch6;

class Data {
    int value;
}

public class ReferenceReturnEx {
    public static void main(String[] args) {
        Data data = new Data();
        data.value = 7;

        Data data2 = copy(data);
        System.out.println(data.value);
        System.out.println(data2.value);
    }

    static Data copy(Data data) {
        Data tmp = new Data();
        tmp = data;
        return tmp;
    }
}
