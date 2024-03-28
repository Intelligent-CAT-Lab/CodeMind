import java.util.*;

public class p04001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int[] sep = new int[n];
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(dfs(0, sep, s, dp));
    }

    public static int dfs(int i, int[] sep, String s, int[] dp) {
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
¥ããªãæ
        int[] newSep = Arrays.copyOf(sep, sep.length+1);
        newSep[sep.length] = i;
        int with = dfs(i, newSep, s, dp);

        // içªç®ã«+ãå
¥ããªãæ
        int[] newSep2 = Arrays.copyOf(sep, sep.length);
        int without = dfs(i, newSep2, s, dp);

        return with + without;
    }
}