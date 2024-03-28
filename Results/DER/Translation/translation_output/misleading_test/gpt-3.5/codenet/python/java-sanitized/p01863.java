import java.util.*;

public class p01863 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int length = s.length();
        final int BASE = 100;
        final int MOD1 = 1000000007;
        final int MOD2 = 2147483647;
        int acc1 = 0, acc2 = 0;
        List<Integer> hlst1 = new ArrayList<>();
        List<Integer> hlst2 = new ArrayList<>();
        hlst