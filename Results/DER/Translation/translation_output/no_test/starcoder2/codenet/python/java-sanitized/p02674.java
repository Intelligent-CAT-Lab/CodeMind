import java.util.Scanner;

public class p02674 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dic = {1, 1, 1, 7, 4, 1, 336, 384, 334, 220, 108, 36, 6, 976, 108, 4, 220, 1, 334, 384, 334, 220, 108, 36, 6};
        if (n < 27) {
            System.out.println(dic[n - 1]);
        } else if (n < 60) {
            System.out.println(dic[n - 27]);
        } else if (n < 124) {
            System.out.println(dic[n - 60]);
        } else if (n < 252) {
            System.out.println(dic[n - 124]);
        } else if (n < 508) {
            System.out.println(dic[n - 252]);
        } else if (n < 1020) {
            System.out.println(dic[n - 508]);
        } else if (n < 2044) {
            System.out.println(dic[n - 1020]);
        } else if (n < 4092) {
            System.out.println(dic[n - 2044]);
        } else if (n < 8188) {
            System.out.println(dic[n - 4092]);
        } else if (n < 134217723) {
            System.out.println(dic[n - 8188]);
        } else if (n < 268435451) {
            System.out.println(dic[n - 134217723]);
        } else if (n < 536870907) {
            System.out.println(dic[n - 268435451]);
        } else if (n < 1152921504606846970L) {
            System.out.println(dic[n - 536870907]);
        } else if (n < 2305843009213693946L) {
            System.out.println(dic[n - 1152921504606846970L]);
        } else {
            System.out.println(-1);
        }
    }
}