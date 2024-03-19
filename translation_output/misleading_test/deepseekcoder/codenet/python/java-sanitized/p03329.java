import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class p03329 {
    static ArrayList<Integer> six = new ArrayList<>();
    static ArrayList<Integer> nine = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i < 8; i++) {
            six.add((int)Math.pow(6, i));
            nine.add((int)Math.pow(9, i));
        }

        Collections.reverse(six);
        Collections.reverse(nine);

        System.out.println(DP(N));
    }

    static int DP(int n) {
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
            if (ninee <= n) {
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