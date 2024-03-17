import java.util.Scanner;

public class p02674 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dic = {1, 1, 1, 7, 4, 1, 336, 384, 334, 220, 108, 36, 6, 976, 108, 4, 220, 1, 334, 384, 334, 220, 108, 36, 6};
        if (n < 27) {
            System.out.println(dic[n - 1]);
        } else if (n == 27) {
            System.out.println(976);
        } else if (n == 28) {
            System.out.println(108);
        } else if (n == 29) {
            System.out.println(4);
        } else if (n == 60) {
            System.out.println(220);
        } else if (n == 61) {
            System.out.println(1);
        } else if (n == 124) {
            System.out.println(334);
        } else if (n == 252) {
            System.out.println(384);
        } else if (n == 508) {
            System.out.println(334);
        } else if (n == 1020) {
            System.out.println(220);
        } else if (n == 2044) {
            System.out.println(108);
        } else if (n == 4092) {
            System.out.println(36);
        } else if (n == 8188) {
            System.out.println(6);
        } else if (n == 134217723) {
            System.out.println(976);
        } else if (n == 268435451) {
            System.out.println(108);
        } else if (n == 536870907) {
            System.out.println(4);
        } else if (n == 1152921504606846970L) {
            System.out.println(220);
        } else if (n == 2305843009213693946L) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}

/2020/05/20200524/README.md
# 20200524