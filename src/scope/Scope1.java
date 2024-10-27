package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if (m == 10) {
            int a = 20;
            System.out.println(a);
            System.out.println(m);
        }
        System.out.println(m);
    }
}
