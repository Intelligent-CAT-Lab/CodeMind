import java.util.*;
public class atcoder_ABC135_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().split(" ");
        int n = s.length;
        int[] amari = new int[n];
        Arrays.fill(amari, 1);
        int[][] ans = new int[2][13];
        Arrays.fill(ans, new int[13], 0, 13);
        ans[0][0] = 1;
        ans[1][0] = 1;
        for (int i = 0; i < n; i++) {
            String s1 = s[n - 1 - i];
            if (s