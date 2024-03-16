public class p03967 {
    public int solution(String s) {
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            ret += (i % 2) - (s.charAt(i) == 'p' ? 1 : 0);
        }
        return ret;
    }
}