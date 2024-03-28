Solution


public class p03192 {
    public int solution(String N) {
        int count = 0;
        for (int i = 0; i < N.length(); i++) {
            if (N.charAt(i) == '2') {
                count++;
            }
        }
        return count;
    }
}