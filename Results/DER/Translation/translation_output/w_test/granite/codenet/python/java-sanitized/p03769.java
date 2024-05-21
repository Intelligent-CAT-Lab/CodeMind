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
    
    static List<Integer> calc(int n, int k) {
        if (n <= 0) {
            return new ArrayList<>();
        }
        
        int i = 0;
        while ((1 << (i+1)) - 1 <= n) {
            i++;
        }
        
        List<Integer> ret = new ArrayList<>();
        for (int j = 0; j <= i; j++) {
            ret.add(k);
        }
        
        int rem = n - ((1 << i) - 1);
        int kk = k + 1;
        i++;
        int j = i / 2;
        
        while (j > 0) {
            while (true) {
                int tmp = sC(i, j);
                if (tmp <= rem) {
                    ret.add(j, kk);
                    ret.add(kk);
                    kk++;
                    rem -= tmp;
                } else {
                    break;
                }
            }
            
            j--;
        }
        
        List<Integer> res = new ArrayList<>();
        res.add(ret.size());
        res.addAll(ret);
        res.addAll(calc(rem, kk));
        
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        List<Integer> X = calc(N, 1);
        for (int i = 0; i < X.size(); i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(X.get(i));
        }
        System.out.println();
    }
}