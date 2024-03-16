import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p03286 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        
        if (N == 0) {
            System.out.println("0");
            return;
        }
        
        Set<Integer> l = new HashSet<>();
        while (N != 0) {
            if (N > 0) {
                int r = plus(N);
                l.add(r);
                N -= Math.pow(2, r);
            } else {
                int r = minus(N);
                l.add(r);
                N += Math.pow(2, r);
            }
        }
        
        int maxIndex = l.stream().max(Integer::compareTo).orElse(0);
        int[] s = new int[maxIndex + 1];
        
        for (int i = 0; i <= maxIndex; ++i) {
            if (l.contains(i)) {
                s[i] = 1;
            }
        }
        
        StringBuilder result = new StringBuilder();
        for(int i = s.length - 1; i >= 0; --i) {
            result.append(s[i]);
        }
        
        System.out.println(result.toString());
    }
    
    private static int plus(int N) {
        int p = 0;
        int n = 0;
        while (true) {
            p += Math.pow(2, n);
            if (p >= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
    
    private static int minus(int N) {
        int p = 0;
        int n = 1;
        while (true) {
            p -= Math.pow(2, n);
            if (p <= N) {
                break;
            }
            n += 2;
        }
        return n;
    }
}