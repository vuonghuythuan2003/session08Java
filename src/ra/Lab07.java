package ra;

public class Lab07 {
    public static void main(String[] args) {
        String input = "123abc456";

        int result = convertStringToInteger(input);

        System.out.println("Chuỗi sau khi chuyển đổi thành số nguyên: " + result);
    }
    public static int convertStringToInteger(String str) {
        String numericString = str.replaceAll("[^0-9]", "0");

        return Integer.parseInt(numericString);
    }
}
