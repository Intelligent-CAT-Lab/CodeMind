import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] x = scanner.nextLine().split(" ");
        int[] xInt = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            xInt[i] = Integer.parseInt(x[i]);
        }
        int a = xInt[0];
        int b = xInt[1];
        System.out.print(Math.min(a, b) + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.print(Math.abs(a - b) / 2);
        } else {
            System.out.print(0);
        }
    }
}