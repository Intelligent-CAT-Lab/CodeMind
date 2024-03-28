import java.util.*;

public class p03371 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        Arrays.fill(arr, sc.nextInt());
        int A = arr[0];
        int B = arr[1];
        int C = arr[2];
        int X = arr[3];
        int Y = arr[4];

        int mi = Math.min(X, Y);
        int a = A * X + B * Y;
        int b = mi * C * 2 + A * (X - mi) + B * (Y - mi);
        int c = Math.max(X, Y) * C * 2;

        System.out.println(Math.min(a, b, c));
    }
}