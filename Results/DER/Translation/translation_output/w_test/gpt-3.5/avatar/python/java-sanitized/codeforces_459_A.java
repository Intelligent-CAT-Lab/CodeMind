import java.util.Scanner;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anti = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        int l = Math.abs(anti - c);
        int m = Math.abs(b - d);
        
        if (anti == c) {
            System.out.println((anti + m) + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(anti + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(anti + " " + d + " " + c + " " + b);
        }
    }
}