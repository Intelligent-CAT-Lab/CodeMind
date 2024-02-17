import java.util.*;

public class Main {
    static long INF = (long)1e18;
    
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        // ans: 「1+2+...+k」がnの倍数である最小のk
        // -> k(k+1)/2 % n = 0
        // -> k(k+1) % 2n = 0
        // ex. 10*11 % 2*11 = 0
        
        // how:
        // a = 2nの約数, b = 2n/aとして、 (ex. n,a,b = 11,11,2)
        // ax + by = 1なる(x,y)を求めて、 (ex. 11*1 + 2*-5 = 1)
        // y < 0であるmin(-by)を求める。
        // <- これを全てのaで行いmin(min(-by))を出力する。
        
        if (n == 1) {
            System.out.println(1);
            return;
        }
        
        List<Long> list = divisorList(2*n);
        
        long ans = INF;
        for (Long a : list) {
            long b = 2*n/a;
            
            long[] eg = extgcd(a, b);
            
            long g = eg[0];
            long x = eg[1];
            long y = eg[2];
            
            if (x == 0 || y == 0) continue;
            
            if (g == 1) {
                if (y < 0) {
                    ans = Math.min(ans, -b*y);
                }
                // System.out.println(a + "*" + x + "+" + b + "*" + y + "=" + g);
            }
        }
        System.out.println(ans);
    }
    
    public static List<Long> divisorList(long n) {
        List<Long> res = new ArrayList<Long>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                res.add(i);
                
                long j = n / i;
                if (j != i) {
                    res.add(j);
                }
            }
        }
        res.sort(Comparator.naturalOrder());
        
        return res;
    }
    
    // 拡張ユークリッド法: ax + by = gcdを解く
    public static long[] extgcd(long a, long b) {
        long x0 = 1, x1 = 0;
        long y0 = 0, y1 = 1;
        
        while (b != 0) {
            long q = a / b;
            long r = a % b;
            long x2 = x0 - q * x1;
            long y2 = y0 - q * y1;
        
            a = b; b = r;
            x0 = x1; x1 = x2;
            y0 = y1; y1 = y2;
        }
        
        return new long[]{a, x0, y0};
    }
}