public class Bai5 {
    
}

import java.util.Scanner;

public class SumWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;

        while (sum <= 100) {
            System.out.print("Nhap so nguyen: ");
            num = sc.nextInt();
            sum += num;
        }

        System.out.println("Tong: " + sum);
    }
}