package ra;

import java.util.Scanner;

public class Lab08 {

    static class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String message) {
            super(message);
        }
    }

    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Cạnh của tam giác không được là số âm hoặc bằng 0.");
        }

        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Tổng hai cạnh của tam giác phải lớn hơn cạnh còn lại.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập cạnh thứ nhất: ");
            double side1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Nhập cạnh thứ hai: ");
            double side2 = Double.parseDouble(scanner.nextLine());

            System.out.print("Nhập cạnh thứ ba: ");
            double side3 = Double.parseDouble(scanner.nextLine());

            checkTriangle(side1, side2, side3);

            System.out.println("Ba cạnh đã nhập tạo thành một tam giác hợp lệ.");
        } catch (IllegalTriangleException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đầu vào không hợp lệ.");
        } finally {
            scanner.close();
        }
    }
}
