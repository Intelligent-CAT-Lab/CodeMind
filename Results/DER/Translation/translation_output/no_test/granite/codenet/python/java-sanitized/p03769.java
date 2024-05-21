import java.util.*;

public class p03769 {
    static int[] fact = new int[101];
    static {
        fact[0] = 1;
        for (int i = 1; i < 101; i++) {
            fact[i] = fact[i-1] * i;
        }
    }
    
    static int C(int a, int b) {
        return fact[a] / (fact[b] * fact[a-b]);
    }
    
    static int sC(int a, int b) {
        int ret = 0;
        for (int i = 0; i <= Math.min(b, a-b); i++) {
            ret += C(b, i) * C(a - b, i);
        }
        return ret;
    }
    
    static List<String> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        
        int i = 0;
        while ((1 << (i+1)) - 1 <= n) {
            i++;
        }
        
        List<String> ret = new ArrayList<>();
        for (int j = 0; j <= i; j++) {
            ret.add(String.valueOf(k));
        }
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
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<String> X = calc(N, 1);
        System.out.println(X.size());
        System.out.println(String.join(" ", X));
    }
}