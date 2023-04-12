import java.util.Scanner;

public class BaiTapToanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        double num1 = sc.nextDouble();

        System.out.print("Nhap so thu hai: ");
        double num2 = sc.nextDouble();

        double sum = num1 + num2;
        System.out.println("Tong cua " + num1 + " va " + num2 + " la " + sum);

        double diff = num1 - num2;
        System.out.println("Hieu Cua " + num1 + " va " + num2 + " la " + diff);

        double product = num1 * num2;
        System.out.println("Tichs cua " + num1 + " va " + num2 + " la " + product);

        if (num2 != 0) {
            double quotient = num1 / num2;
            System.out.println("Thuong cua " + num1 + " va " + num2 + " la " + quotient);
        } else {
            System.out.println("Khong the chia cho so 0!");
        }

        if (num2 != 0) {
            double remainder = num1 % num2;
            System.out.println("Chia lay so du cua " + num1 + " va " + num2 + " la " + remainder);
        } else {
            System.out.println("Khong the chia cho 0!");
        }

        if (num1 == num2) {
            System.out.println(num1 + " bang " + num2);
        } else if (num1 > num2) {
            System.out.println(num1 + " lon hon " + num2);
        } else {
            System.out.println(num1 + " nho hon " + num2);
        }
    }
}
