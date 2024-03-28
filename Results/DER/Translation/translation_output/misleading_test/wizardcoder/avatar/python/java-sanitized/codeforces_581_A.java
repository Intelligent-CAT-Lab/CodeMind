import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        for (int i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(x[i]);
        }
        int a = x[0];
        int b = x[1];
        System.out.print(Math.min(a, b) + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.print(Math.abs(a - b) / 2);
        } else {
            System.out.print(0);
        }
    }
}