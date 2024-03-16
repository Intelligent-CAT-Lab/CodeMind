import java.util.Scanner;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anti, b, c, d, l, m;
        anti = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        l = Math.abs(anti - c);
        m = Math.abs(b - d);
        if (anti == c) {
            System.out.println(anti + m + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l!= m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }
    }
}