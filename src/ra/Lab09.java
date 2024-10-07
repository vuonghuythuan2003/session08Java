package ra;

import java.util.Scanner;

public class Lab09 {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số thứ nhất: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập số thứ hai: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            if (num1 == 0 && num2 == 0) {
                throw new IllegalArgumentException("Cả hai số đều bằng 0, không có UCLN.");
            }

            int gcdValue = gcd(Math.abs(num1), Math.abs(num2));
            System.out.println("Ước chung lớn nhất của " + num1 + " và " + num2 + " là: " + gcdValue);

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đầu vào không hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
