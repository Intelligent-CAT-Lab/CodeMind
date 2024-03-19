import java.util.*;

public class p03329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> six = Arrays.asList(6, 6, 6, 6, 6, 6);
        List<Integer> nine = Arrays.asList(9, 9, 9, 9, 9, 9);

        int count6 = 0;
        int count9 = 0;

        for (int i = 0; i < six.size(); i++) {
            if (six.get(i) <= N) {
                count6 = 1;
                break;
            }
        }

        count6 += DP(N - six.get(i));

        for (int i = 0; i < nine.size(); i++) {
            if (nine.get(i) <= N) {
                count9 = 1;
                break;
            }
        }

        count9 += DP(N - nine.get(i));

        return Math.min(count6, count9);
    }

    public static int DP(int n) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for (int i = 0; i < 6; i++) {
            if (six.get(i) <= n) {
                n -= six.get(i);
                count6 = 1;
                break;
            }
        }
        count6 += DP(n);
        n = tmp;
        if (n < 9) {
            return count6;
        }
        for (int i = 0; i < 6; i++) {
            if (nine.get(i) <= n) {
                n -= nine.get(i);
                count9 = 1;
                break;
            }
        }
        count9 += DP(n);
        n = tmp;
        return Math.min(count6, count9);
    }
}