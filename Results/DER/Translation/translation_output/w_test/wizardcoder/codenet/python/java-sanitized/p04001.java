import java.util.*;

public class p04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(dfs(0, new int[]{0}, s, 0));
    }

    public static int dfs(int i, int[] sep, String s, int tot) {
        int n = s.length();
        i++;

        // ææ·±é¨ã¾ã§å°éããæ
        if (i == n) {
            int ans = 0;
            if (sep.length > 1) {
                for (int j = 0; j < sep.length - 1; j++) {
                    ans += Integer.parseInt(s.substring(sep[j], sep[j+1]));
                }
            }
            ans += Integer.parseInt(s.substring(sep[sep.length-1]));
            return ans;
        }

        // içªç®ã«+ãå
¥ããæ
        sep[sep.length] = i;
        tot += dfs(i, sep, s, 0);

        // içªç®ã«+ãå
¥ããªãæ
        sep[sep.length-1] = i;
        tot += dfs(i, sep, s, 0);

        return tot;
    }
}