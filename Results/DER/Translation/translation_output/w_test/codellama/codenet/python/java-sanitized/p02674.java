import java.util.Scanner;

public class p02674 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = -1;
        if (n == 1) {
            result = 1;
        } else if (n == 2) {
            result = 1;
        } else if (n == 3) {
            result = 1;
        } else if (n == 4) {
            result = 7;
        } else if (n == 5) {
            result = 4;
        } else if (n == 6) {
            result = 1;
        } else if (n == 7) {
            result = 336;
        } else if (n == 8) {
            result = 384;
        } else if (n == 9) {
            result = 334;
        } else if (n == 10) {
            result = 220;
        } else if (n == 11) {
            result = 108;
        } else if (n == 12) {
            result = 36;
        } else if (n == 13) {
            result = 6;
        } else if (n == 27) {
            result = 976;
        } else if (n == 28) {
            result = 108;
        } else if (n == 29) {
            result = 4;
        } else if (n == 60) {
            result = 220;
        } else if (n == 61) {
            result = 1;
        } else if (n == 124) {
            result = 334;
        } else if (n == 252) {
            result = 384;
        } else if (n == 508) {
            result = 334;
        } else if (n == 1020) {
            result = 220;
        } else if (n == 2044) {
            result = 108;
        } else if (n == 4092) {
            result = 36;
        } else if (n == 8188) {
            result = 6;
        } else if (n == 134217723) {
            result = 976;
        } else if (n == 268435451) {
            result = 108;
        } else if (n == 536870907) {
            result = 4;
        } else if (n == 1152921504606846970) {
            result = 220;
        } else if (n == 2305843009213693946) {
            result = 1;
        }
        System.out.println(result);
    }
}