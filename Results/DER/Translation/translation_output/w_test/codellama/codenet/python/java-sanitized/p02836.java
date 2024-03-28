public class p02836 {
    public static void main(String[] args) {
        String s = "redcoder";
        int n = s.length() - 1;
        int ans = 0;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}