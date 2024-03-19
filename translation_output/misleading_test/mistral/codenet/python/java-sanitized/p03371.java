import java.util.*;

public class p03371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] input = new int[5];
        for (int i = 0; i < 5; i++) {
            input[i] = sc.nextInt();
        }
        int A = input[0];
        int B = input[1];
        int C = input[2];
        int X = input[3];
        int Y = input[4];
        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;
        System.out.println(Math.min(a, b, c));
    }
}