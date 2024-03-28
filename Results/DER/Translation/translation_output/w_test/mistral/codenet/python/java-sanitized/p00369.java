public class p00369 {
    public static int sub(int[] maxs, int[] mins) {
        for (int i = 0; i < maxs.length; i++) {
            if (maxs[i] != mins[i]) {
                if (i == maxs.length - 1) {
                    return maxs[i] - mins[i];
                } else if (i == maxs.length - 2) {
                    return maxs[i] - mins[i];
                } else {
                    return 10;
                }
            }
        }
        return 0;
    }

    public static int checkEqual(String S) {
        int ans = 8;
        for (int k = 2; k <= S.length() / k; k++) {
            int[] mins = new int[k];
            int[] maxs = new int[k];
            mins[0] = Integer.parseInt(S.substring(0, k));
            maxs[0] = Integer.parseInt(S.substring(0, k));
            for (int i = 1; i < k; i++) {
                mins[i] = Math.min(mins[i], Integer.parseInt(S.substring(i * k, (i + 1) * k)));
                maxs[i] = Math.max(maxs[i], Integer.parseInt(S.substring(i * k, (i + 1) * k)));
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
            char c = S.charAt(p);
            if (c == '1' && p + 1 < S.length()) {
                maxv = Math.max(maxv, Integer.parseInt(S.substring(p + 1)));
                minv = Math.min(minv, Integer.parseInt(S.substring(p + 1)));
                p++;
            } else {
                maxv = Math.max(maxv, Integer.parseInt(S.substring(p)));
                minv = Math.min(minv, Integer.parseInt(S.substring(p)));
                p++;
            }
        }
        return maxv - minv;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        System.out.println(Math.min(checkEqual(S), check12(S)));
    }
}