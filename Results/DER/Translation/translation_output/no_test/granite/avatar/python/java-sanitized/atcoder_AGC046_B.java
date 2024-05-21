import java.util.*;

public class atcoder_AGC046_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);
        int D = Integer.parseInt(input[3]);
        int m = 998244353;
        int[][] d = new int[C+1][D+1];
        d[A][B] = 1;
        for (int i = A; i <= C; i++) {
            for (int j = B; j <= D; j++) {
                d[i][j] = (int) (((long) d[i][j-1] * i + (long) d[i-1][j] * j - (long) d[i-1][j-1] * (i-1) * (j-1)) % m);
            }
        }
        System.out.println(d[C][D]);
    }
}