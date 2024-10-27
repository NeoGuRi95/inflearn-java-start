package Array;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] products = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        while (true) {
            System.out.println("1. 상품 등록 | 2. 상품 목록 | 3. 종료");
            System.out.print("메뉴를 선택하세요:");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    if (productCount == 10) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        break;
                    }
                    System.out.print("상품 이름을 입력하세요:");
                    String newProductName = sc.next();
                    products[productCount] = newProductName;
                    System.out.print("상품 가격을 입력하세요:");
                    int newProductPrice = sc.nextInt();
                    productPrices[productCount] = newProductPrice;
                    productCount += 1;
                    break;
                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        break;
                    }
                    for (int i = 0; i < productCount; i++) {
                        System.out.println(products[i] + ": " + productPrices[i]);
                    }
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
