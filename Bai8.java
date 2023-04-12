import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so phan tu cua day xo: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Nhap vao cac phan tu cua day so: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("Phan tu thu %d: ", i + 1);
            arr[i] = scanner.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = sum / n;

        System.out.printf("Trung Binh cong cua %d So nguyen da nhap la: %.2f", n, average);
    }
}