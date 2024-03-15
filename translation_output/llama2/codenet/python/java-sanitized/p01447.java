public class p01447 {
    public int solution(int n) {
        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        return ans;
    }
}