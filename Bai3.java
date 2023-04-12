public class Bai3 {
    
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten: ");
        String ten = scanner.nextLine();
        System.out.print("Nam Sinh: ");
        int namSinh = scanner.nextInt();

        int tuoi = 2023 - namSinh;

        if (tuoi < 16) {
            System.out.println("Ban " + ten + " o tuoi vi thanh nien.");
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("Ban " + ten + " O tuoi truowng thanh.");
        } else {
            System.out.println("Ban " + ten + " Da Gia.");
        }
    }
}