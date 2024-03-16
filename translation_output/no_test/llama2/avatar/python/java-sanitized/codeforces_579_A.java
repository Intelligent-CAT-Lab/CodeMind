Solution


import java.util.Scanner;

public class codeforces_579_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (Math.log2(n) % 1 != 0) {
            x += 1;
            n -= 2 ** (int) Math.log2(n);
        }
        System.out.println(x);
    }
}