import java.util.*;

public class p03329 {
    private static List<Integer> six = new ArrayList<>();
    private static List<Integer> nine = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        createPowers();
        System.out.println(DP(N));
    }

    private static void createPowers() {
        for (int i = 7; i >= 1; i--) {
            six.add((int) Math.pow(6, i));
            nine.add((int) Math.pow(9, i));
        }
    }

    private static int DP(int n) {
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
        }
        count6 += DP(n);
        n = tmp;
        if (n < 9) {
            return count6;
        }
        for (int ninee : nine) {
            if (n >= ninee) {
                n -= ninee;
                count9 = 1;
                break;
            }
        }
        count9 += DP(n);
        n = tmp;
        return Math.min(count6, count9);
    }
}