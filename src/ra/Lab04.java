package ra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhap vao ngay thang nam sinh theo dinh dang: dd/MM/yyyy");
            String inputType = sc.nextLine();
            Date d = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat(inputType);
            System.out.println("Date hien tai la: "+sdf.format(d));
        }
        catch (Exception e) {
            System.out.println("Dinh dang sai roi");
        }
    }
}
