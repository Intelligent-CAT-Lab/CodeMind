import java.util.*;
public class p00939 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String D = sc.next();
        int N = D.length();
        int[] DI = new int[N];
        for(int i = 0; i < N; i++) DI[i] = D.charAt(i) - '0';
        int su = 0;
        for(int i = 0; i < N; i++) su += DI[i];
        long pd = 1;
        for(int i = 0; i < N; i++) pd *= (DI[i] + 1);
        long[][] memo = new long[N][];
        for(int i = 0; i < N; i++) memo[i] = new long[10];
        long dfs0(int i, int s, long p){
            if(i == N) return s > 0 || (s == 0 && p < pd);
            if(memo[i][s]!= 0) return memo[i][s];
            long r = 0;
            for(int v = Math.min(s, 9); v >= 0; v--){
                r += dfs0(i+1, s-v, p*(v+1));
            }
            memo[i][s] = r;
            return r;
        }
        long res1 = dfs0(0, su, 1);
        long[][] memo1 = new long[N][];
        for(int i = 0; i < N; i++) memo1[i] = new long[10];
        long dfs1(int i, int s, long p, int m){
            if(i == N) return s == 0 && p == 1;
            if(memo1[i][s]!= 0) return memo1[i][s];
            long r = 0;
            int b = s - (N-1-i)*9;
            int di = DI[i];
            for(int v = Math.max(b, 0); v <= Math.min(s, 9); v++){
                if(p % (v+1)) continue;
                if(m == 0){
                    if(di < v) break;
                    r += dfs1(i+1, s-v, p/(v+1), +(v < di));
                }else{
                    r += dfs1(i+1, s-v, p/(v+1), 1);
                }
            }
            memo1[i][s] = r;
            return r;
        }
        long res2 = dfs1(0, su, pd, 0) - 1;
        long ans = res1 + res2;
        System.out.println(ans);
    }
}