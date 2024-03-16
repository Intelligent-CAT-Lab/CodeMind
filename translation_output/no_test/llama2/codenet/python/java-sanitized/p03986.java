public class p03986 {
    public int solution(String X) {
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < X.length(); i++) {
            if (X.charAt(i) == 'T') {
                if (memo == 0) {
                    pass;
                } else {
                    memo -= 1;
                }
            } else {
                memo += 1;
            }
        }
        return memo * 2;
    }
}