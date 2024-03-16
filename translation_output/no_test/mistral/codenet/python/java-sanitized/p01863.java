import java.util.*;

public class p01863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        int BASE = 100;
        int MOD1 = 1000000007;
        int MOD2 = 2147483647;
        int acc1 = 0;
        int acc2 = 0;
        List<Integer> hlst1 = new ArrayList<>(Arrays.asList(0));
        List<Integer> hlst2 = new ArrayList<>(Arrays.asList(0));
        for (char c : s.toCharArray()) {
            int i = (int) c;
            acc1 = (acc1 * BASE + i) % MOD1;
            acc2 = (acc2 * BASE + i) % MOD2;
            hlst