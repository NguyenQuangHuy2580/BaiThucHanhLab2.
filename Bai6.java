import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i = 1;
        long giaiThua = 1;

        do {
            System.out.print("Nhap So Duong n: ");
            n = input.nextInt();
        } while (n <= 0);

        while (i <= n) {
            giaiThua *= i;
            i++;
        }

        System.out.printf("Giai thua cua %d la %d", n, giaiThua);
    }
}