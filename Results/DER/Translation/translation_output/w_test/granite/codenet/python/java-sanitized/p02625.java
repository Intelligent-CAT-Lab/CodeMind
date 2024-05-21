import java.util.*;

public class p02625 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        long[] d = new long[n+1];
        Arrays.fill(d, 1);
        for (int i = 0; i < n; i++) {
            d[i+1] = ((m-i)*((m-n+i)*d[i]+i*d[i-1]*(m-i+1)))%(100000007);
        }
        System.out.println(d[n]);
    }
}