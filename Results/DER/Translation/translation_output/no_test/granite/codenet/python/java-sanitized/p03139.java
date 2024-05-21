import java.util.*;

public class p03139 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int min = Math.min(A, B);
        int max = Math.max(A + B - N, 0);
        System.out.println(min + " " + max);
    }
}