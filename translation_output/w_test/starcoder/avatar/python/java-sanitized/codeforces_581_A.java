import java.util.*;
public class codeforces_581_A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[2];
        for (int i = 0; i < x.length; i++) {
            x[i] = sc.nextInt();
        }
        int a = x[0];
        int b = x[1];
        System.out.print(Math.min(x[0], x[1]) + " ");
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }
    }
}