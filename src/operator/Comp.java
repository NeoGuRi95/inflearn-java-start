package operator;

public class Comp {
    public static void main(String[] args) {
        String str1 = "str1";
        String str2 = "str2";

        boolean result1 = "hello".equals("hello");
        boolean result2 = str1.equals("str1");
        boolean result3 = str1.equals(str2);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}

