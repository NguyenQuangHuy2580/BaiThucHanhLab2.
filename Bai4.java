public class Bai4 {
    
}

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap mot so tu 1 den 12: ");
        int month = scanner.nextInt();
        String monthName;

        switch (month) {
            case 1:
                monthName = "Thang 1";
                break;
            case 2:
                monthName = "Thang 2";
                break;
            case 3:
                monthName = "Thang 3";
                break;
            case 4:
                monthName = "Thang 4";
                break;
            case 5:
                monthName = "Thang 5";
                break;
            case 6:
                monthName = "Thang 6";
                break;
            case 7:
                monthName = "Thang 7";
                break;
            case 8:
                monthName = "Thang 8";
                break;
            case 9:
                monthName = "Thang 9";
                break;
            case 10:
                monthName = "Thang 10";
                break;
            case 11:
                monthName = "Thang 11";
                break;
            case 12:
                monthName = "Thang 12";
                break;
            default:
                monthName = "Khong hop le";
                break;
        }
        System.out.println(monthName);
    }
}
