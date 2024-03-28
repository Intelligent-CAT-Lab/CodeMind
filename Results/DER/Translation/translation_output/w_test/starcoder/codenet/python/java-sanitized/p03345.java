import java.util.*;
public class p03345 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int K = in.nextInt();
        if (K % 2 == 0) {
            System.out.println(A - B);
        } else {
            System.out.println(B - A);
        }
    }
}