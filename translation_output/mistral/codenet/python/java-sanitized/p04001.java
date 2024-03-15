public class p04001 {
    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i++;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1], s.length()));
            return ans;
        }

        // içªç®ã«+ãå©¥ããæ
        sep[i] = i;
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ãå©¥ããªãæ
        sep[i] = -1;
        tot += dfs(i, sep, s, 0);

        return tot;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] sep = new int[s.length() + 1];
        int tot = 0;
        tot += dfs(0, sep, s, 0);
        System.out.println(tot);
    }
}