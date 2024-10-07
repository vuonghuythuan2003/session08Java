package ra;

import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao mot chuoi bat ky: ");
        String inputString = sc.nextLine();
        if(inputString == null || inputString.equals("")){
            System.out.println("Vui long nhap mot chuoi hop ly: ");
        }else{
            String outputString = new StringBuilder(inputString).reverse().toString();
            System.out.println(outputString);
        }
    }
}
