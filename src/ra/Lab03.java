package ra;

import java.util.Scanner;

public class Lab03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhâp số tử phần mảng: ");
        int n = Integer.parseInt(scanner.nextLine());
        int [] arrayInt = new int[n];
        System.out.println("Nhap cac phan tu cua mang");
        for(int i = 0; i < n; i++){
            arrayInt[i] = Integer.parseInt(scanner.nextLine());
        }

        int max = arrayInt[0];
        for(int i = 0; i < n; i++) {
            if(arrayInt[i] > max) {
                max = arrayInt[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng số nguyên là :" +max);
    }
}
