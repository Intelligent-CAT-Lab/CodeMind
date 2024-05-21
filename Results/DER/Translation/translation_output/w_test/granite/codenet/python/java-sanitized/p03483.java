import java.util.*;

public class p03483 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        char oddChar ='';
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() % 2!= 0) {
                oddCount++;
                oddChar = entry.getKey();
            }
        }
        if (oddCount > 1) {
            System.out.println(-1);
            return;
        }
        long ans = 0;
        int[] prefixSum = new int[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + (s.charAt(i) == oddChar? 1 : 0);
        }
        int[] left = new int[n];
        int[] right = new int[n];
        int l = 0, r = n - 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == oddChar) {
                left[l++] = i;
            } else {
                right[r--] = i;
            }
        }
        FenwickTree tree = new FenwickTree(n);
        for (int i = 0; i < n; i++) {
            int pos = left[i];
            ans += tree.query(pos);
            tree.update(pos, 1);
        }
        tree = new FenwickTree(n);
        for (int i = n - 1; i >= 0; i--) {
            int pos = right[i];
            ans += tree.query(pos);
            tree.update(pos, 1);
        }
        System.out.println(ans);
    }

    static class FenwickTree {
        int[] bit;

        public FenwickTree(int n) {
            bit = new int[n + 1];
        }

        public void update(int i, int val) {
            i++;
            while (i < bit.length) {
                bit[i] += val;
                i += i & -i;
            }
        }

        public int query(int i) {
            i++;
            int sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }
}