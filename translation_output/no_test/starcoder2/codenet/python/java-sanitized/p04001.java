import java.util.Scanner;

public class p04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dfs(0, new int[]{0}, s, 0));
    }

    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i += 1;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j + 1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length - 1]));
            return ans;
        }

        // içªç®ã«+ãå
¥ããæ
        int[] sep_copy = sep.clone();
        sep_copy = Arrays.copyOf(sep_copy, sep_copy.length + 1);
        sep_copy[sep_copy.length - 1] = i;
        tot += dfs(i, sep_copy, s, 0);

        // içªç®ã«+ãå
¥ããªãæ
        sep_copy = Arrays.copyOf(sep, sep.length - 1);
        tot += dfs(i, sep_copy, s, 0);

        return tot;
    }
}