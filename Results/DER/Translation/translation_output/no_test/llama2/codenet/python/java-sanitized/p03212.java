public class p03212 {
    public int dfs(String s) {
        int n = Integer.parseInt(s);
        int ret = 1;
        for (char c : '753'.toCharArray()) {
            ret += dfs(s + c);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = Integer.parseInt(args[0]);
        System.out.println(solution.dfs("0"));
    }
}