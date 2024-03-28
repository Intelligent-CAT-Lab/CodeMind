import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        int[] x1 = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            x1[i] = Integer.parseInt(x[i]);
        }
        int a = x1[0];
        int b = x1[1];
        System.out.print(Math.min(a, b) + " â ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}