import java.util.Scanner;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anti = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);
        if (anti == c) {
            System.out.println(anti + m + " " + b + " " + c + m + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + b + m + " " + c + " " + d + m);
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }
    }
}