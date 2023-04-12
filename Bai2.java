public class Bai2 {
    
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " La So Chan");
        } else {
            System.out.println(num + " la so le");
        }
    }
}
