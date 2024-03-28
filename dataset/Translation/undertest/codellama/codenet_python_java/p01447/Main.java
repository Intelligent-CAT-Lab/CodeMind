public class p01447 {
    public static void main(String[] args) {
        int n = 8;
        int ans = 0;
        int tmp = 1;
        while (n > tmp) {
            tmp *= 3;
            ans++;
        }
        System.out.println(ans);
    }
}