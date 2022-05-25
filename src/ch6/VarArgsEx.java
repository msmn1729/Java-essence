package ch6;

public class VarArgsEx {
    public static void main(String[] args) {
        System.out.println(concatenate("aaa"));
        System.out.println(concatenate("aaa", "bbb"));
        System.out.println(concatenate("a", "c", "q"));

        System.out.println(concatenate());
        try {
            System.out.println(concatenate(null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(concatenate(new String[]{}));
    }

    // 가변인자 메서드
    public static String concatenate(String... args) {
        StringBuilder builder = new StringBuilder();
        for (String arg : args) {
            builder.append(arg);
        }
        return builder.toString();
    }
}
