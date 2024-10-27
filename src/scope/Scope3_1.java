package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // temp의 범위가 불필요하게 넓다 -> 비효울적인 메모리 사용, 코드 복작성 증가
        if (m > 0) {
            temp = m * 2;
            System.out.println(temp);
        }
        System.out.println(m);
    }
}
