import java.util.*;
public class p03329 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> six = Arrays.stream(new int[7]).map(i -> (int) Math.pow(6, i)).toList();
        List<Integer> nine = Arrays.stream(new int[7]).map(i -> (int) Math.pow(9, i)).toList();
        Collections.reverse(six);
        Collections.reverse(nine);
        int result = DP(N);
        System.out.println(result);
    }
    public static int DP(int n) {
        if (n < 6) {
            return n;
        }
        int tmp = n;
        int count6 = 0;
        int count9 = 0;
        for (int sixx : six) {
            if (sixx <= n) {
                n -= sixx;
                count6 = 1;
                break;
            }
            count6 += DP(n);
        }
        n = tmp;
        if (n < 9) {
            return count6;
        }
        for (int ninee : nine) {
            if (ninee <= n) {
                n -= ninee;
                count9 = 1;
                break;
            }
            count9 += DP(n);
        }
        n = tmp;
        return Math.min(count6, count9);
    }
}