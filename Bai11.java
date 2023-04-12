import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] A = new int[n];

        System.out.println("Nhap cac phan tu cua mang A: ");
        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "] = ");
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        System.out.println("Mang so ban dau: " + Arrays.toString(A));
        System.out.println("Mang da sap xep: " + Arrays.toString(A));
    }
}