<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12 18

Expected output:
-48

```
//package BeginnerContest142;

import java.util.*;
import java.io.*;

public class p02900 {
    static long MODULO = (long)1e9+7;

    public static long gcd(long n, long m){
        if(m == 0) return n;
        return gcd(m, n % m);
    }


    public static HashSet<Long> factors(long n){ // returns a list of the prime factors of the number n
        HashSet<Long> fact = new HashSet<>();
        fact.add(1L);
        for(long i = 2; i*i <= n; i++){
            while(n % i == 0){
                fact.add(i);
                n/=i;
            }
        }
        if(n > 1)
            fact.add(n);
        return fact;
    }
    // can also use sieve of eratosthenes for precomputing prime

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter pw = new PrintWriter(System.out);
        long a = sc.nextLong();
        long b = sc.nextLong();
        pw.println(factors(gcd(a,b)).size());
        //pw.println(factors(gcd(a,b)));
        pw.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```
[/INST]
```python
import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def factors(n):
    factors = set()
    factors.add(1)
    for i in range(2, int(math.sqrt(n))+1):
        while n % i == 0:
            factors.add(i)
            n //= i
    if n > 1:
        factors.add(n)
    return factors

a = int(input())
b = int(input())
print(len(factors(gcd(a,b))))
```</s>
