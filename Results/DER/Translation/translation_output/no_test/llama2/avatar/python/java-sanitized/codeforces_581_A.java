import java.util.Scanner;

public class codeforces_581_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] x = sc.nextLine().split(" ");
        int[] a = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            a[i] = Integer.parseInt(x[i]);
        }
        int min = Integer.MAX_VALUE;
        int abs = 0;
        for (int i = 0; i < x.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        if (Math.abs(a[0] - a[1]) >= 2) {
            abs = Math.abs(a[0] - a[1]) / 2;
        } else {
            abs = 0;
        }
        System.out.println(min + " â " + abs);
    }
}