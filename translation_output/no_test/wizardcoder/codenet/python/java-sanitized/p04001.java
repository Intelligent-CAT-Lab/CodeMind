import java.util.*;

public class p04001 {
    public static int dfs(int i, List<Integer> sep, String s, int tot) {
        int n = s.length();
        i++;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.size() > 1) {
                for (int j = 0; j < sep.size() - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep.get(j), sep.get(j+1)));
                }
            }
            ans += Integer.parseInt(s.substring(sep.get(sep.size()-1)));
            return ans;
        }

        // içªç®ã«+ãå
¥ããæ
        sep.add(i);
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ãå
¥ããªãæ
        sep.remove(sep.size()-1);
        tot += dfs(i, sep, s, 0);

        return tot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<Integer> sep = new ArrayList<>();
        sep.add(0);
        System.out.println(dfs(0, sep, s, 0));
    }
}