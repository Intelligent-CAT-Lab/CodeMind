import java.util.*;

public class p00939 {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String D = sc.nextLine();
        int N = D.length();
        int[] DI = new int[N];
        for (int i = 0; i < N; i++) {
            DI[i] = Integer.parseInt(String.valueOf(D.charAt(i)));
        }
        int su = 0;
        for (int digit : DI) {
            su += digit;
        }
        int pd = 1;
        for (char c : D.toCharArray()) {
            pd *= Character.getNumericValue(c) + 1;
        }

        List<Map<List<Integer>, Integer>> memo = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            memo.add(new HashMap<>());
        }

        int res1 = dfs0(0, su, 1, N, DI, pd, memo);

        List<Map<List<Integer>, Integer>> memo1 = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            memo