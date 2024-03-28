public class p04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int ans = dfs(0, new ArrayList<Integer>(), s, 0);
        System.out.println(ans);
    }

    public static int dfs(int i, List<Integer> sep, String s, int tot) {
        int n = s.length();
        i++;

        // ææ·±é¨ã¾ã§å°éããæwick
        if (i == n) {
            int ans = 0;
            if (sep.size() > 1) {
                for (int j = 0; j < sep.size() - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep.get(j), sep.get(j + 1)));
                }
            }
            ans += Integer.parseInt(s.substring(sep.get(sep.size() - 1), s.length()));
            return ans;
        }

        // içªç®ã«+ã'å©¥ããæwick
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ã'å©¥ããªãæwick
        sep.remove(sep.size() - 1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}