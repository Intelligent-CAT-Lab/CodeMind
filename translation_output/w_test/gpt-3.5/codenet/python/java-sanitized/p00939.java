import java.util.*;

public class p00939 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String D = sc.next();
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = Character.getNumericValue(D.charAt(i));
        }
        int su = Arrays.stream(DI).sum();
        int pd = 1;
        for (char d : D.toCharArray()) {
            pd *= Character.getNumericValue(d) + 1;
        }

        List<Map<String, Integer>> memo = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            memo.add(new HashMap<>());
        }

        int res1 = dfs0(0, su, 1, N, DI, pd, memo);
        
        List<Map<String, Integer>> memo1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            memo