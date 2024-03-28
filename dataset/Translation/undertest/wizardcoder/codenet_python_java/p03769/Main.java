import java.util.*;

public class p03769 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
    
    public static List<String> calc(int n, int k) {
        List<String> ret = new ArrayList<>();
        if (n <= 0) {
            return ret;
        }
        int i = 0;
        while ((1 << (i + 1)) - 1 <= n) {
            i++;
        }
        ret.addAll(Collections.nCopies(i + 1, String.valueOf(k)));
        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;
        int j = i / 2;
        while (j > 0) {
            while (true) {
                int tmp = sC(i, j);
                if (tmp <= rem) {
                    ret.add(j, String.valueOf(kk));
                    ret.add(String.valueOf(kk));
                    kk++;
                    rem -= tmp;
                } else {
                    break;
                }
            }
            j--;
        }
        ret.addAll(calc(rem, kk));
        return ret;
    }
    
    public static int sC(int a, int b) {
        int ret = 1;
        for (int i = 1; i <= b; i++) {
            ret = ret * (a - b + i) / i;
        }
        return ret;
    }
}