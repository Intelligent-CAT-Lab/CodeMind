import java.util.Scanner;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        scanner.close();

        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int c = Integer.parseInt(input[2]);
        int d = Integer.parseInt(input[3]);

        int l = Math.abs(a - c);
        int m = Math.abs(b - d);

        if (a == c) {
            System.out.println(a + m + " " + b + " " + (c + m) + " " + d);
        } else if (b == d) {
            System.out.println(a + " " + (b + l) + " " + c + " " + (d + l));
        } else if (l != m) {
            System.out.println(-1);
        } else {
            System.out.println(a + " " + d + " " + c + " " + b);
        }
    }
}