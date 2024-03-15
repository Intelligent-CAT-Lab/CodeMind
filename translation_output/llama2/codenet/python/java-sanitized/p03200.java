public class p03200 {
    public int solution(String s) {
        int cnt = 0;
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'W') {
                cnt += i - l;
                l = i + 1;
            }
        }
        return cnt;
    }
}