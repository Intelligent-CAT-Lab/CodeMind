public class p02125 {
    public int solution(int N) {
        int ans = 0;
        int x = 1;
        while (2 * x - 1 <= N) {
            x = 2 * x;
            ans++;
        }
        return ans;
    }
}