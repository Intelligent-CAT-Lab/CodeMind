public class p00369 {
    public static int sub(int[] maxs, int[] mins) {
        for (int i = 0; i < maxs.length; i++) {
            if (maxs[i] != mins[i]) {
                if (i == maxs.length - 1) {
                    return maxs[i] - mins[i];
                }
                if (i == maxs.length - 2) {
                    return maxs[i] - mins[i];
                }
                return 10;
            }
        }
        return 0;
    }

    public static int checkEqual(String S) {
        int ans = 8;
        for (int k = 2; k < S.length(); k++) {
            if (S.length() % k != 0) {
                continue;
            }
            int[] mins = new int[k];
            int[] maxs = new int[k];
            for (int i = 0; i < k; i++) {
                mins[i] = Integer.parseInt(S.substring(i, i + k));
                maxs[i] = Integer.parseInt(S.substring(i, i + k));
            }
            ans = Math.min(ans, sub(maxs, mins));
        }

        return ans;
    }

    public static int check12(String S) {
        int maxv = 0;
        int minv = 10;
        int p = 0;
        while (p < S.length()) {
            int v = Integer.parseInt(S.substring(p, p + 1));
            if (S.charAt(p) == '1' && p + 1 < S.length()) {
                v = 10 + Integer.parseInt(S.substring(p + 1, p + 2));
                p++;
            }
            maxv = Math.max(maxv, v);
            minv = Math.min(minv, v);
            p++;
        }
        return maxv - minv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }
}