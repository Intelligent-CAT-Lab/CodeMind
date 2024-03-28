import java.util.*;

public class p01863 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        int BASE = 100;
        long MOD1 = 1000000007;
        long MOD2 = 2147483647;
        long acc1 = 0;
        long acc2 = 0;
        List<Long> hlst1 = new ArrayList<>();
        List<Long> hlst2 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            int i = (int) c;
            acc1 = (acc1 * BASE + i) % MOD1;
            acc2 = (acc2 * BASE + i) % MOD2;
            hlst