import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        int[] a = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            a[i] = Integer.parseInt(x[i]);
        }
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.print(min + " ");
        if (Math.abs(a[0] - a[1]) >= 2) {
            System.out.println(Math.abs(a[0] - a[1]) / 2);
        } else {
            System.out.println(0);
        }
    }
}