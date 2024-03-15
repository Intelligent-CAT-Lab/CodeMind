public class p02233 {
    public int solution(int n) {
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < n) {
            a = b;
            b = a + b;
            i++;
        }
        return a;
    }
}