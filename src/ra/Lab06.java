package ra;

import java.util.Scanner;

public class Lab06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số phần tử trong mảng: ");
        int n = Integer.parseInt(sc.nextLine());

        int[] arrayInt = new int[n];
        int sum = 0;

        System.out.println("Nhập vào các giá trị trong mảng: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.printf("Giá trị thứ %d: ", i);
            try {
                arrayInt[i] = Integer.parseInt(sc.nextLine());
                sum += arrayInt[i];
            }catch (NumberFormatException e){
                System.out.println("Gia tri nay khong phai so nguyen bo qua gia tri nay");
            }
        }
        System.out.println("Tong cac gia tri so nguyen trong mang la : " +sum);

    }
}
