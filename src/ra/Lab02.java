package ra;

import java.util.Scanner;

public class Lab02
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhập vào số nguyên đầu tiên: ");
                int numberOne= Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập vào số nguyên thứ hai: ");
                int numberTwo= Integer.parseInt(scanner.nextLine());
                int sum = numberOne + numberTwo;
                System.out.println("Kết quả của phép chia là : " + sum);
            } catch(Exception e){
                System.out.println("Nhập vào đúng định dạng khác không và phải là số nguyên");
            } }while(true);
    }
}
