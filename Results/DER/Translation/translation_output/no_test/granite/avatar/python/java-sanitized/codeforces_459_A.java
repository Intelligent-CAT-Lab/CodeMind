import java.util.*;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int anti = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);

        if (anti == c) {
            System.out.println(anti + m + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l!= m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + (c) + " " + b);
        }
    }
}