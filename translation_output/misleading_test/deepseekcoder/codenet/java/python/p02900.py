<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
import sys

MODULO = int(1e9+7)

def gcd(n, m):
    if m == 0:
        return n
    return gcd(m, n % m)

def factors(n):  # returns a list of the prime factors of the number n
    fact = set()
    fact.add(1)
    i = 2
    while i * i <= n:
        while n % i == 0:
            fact.add(i)
            n //= i
        i += 1
    if n > 1:
        fact.add(n)
    return fact

def main():
    a = int(sys.stdin.readline().split()[0])
    b = int(sys.stdin.readline().split()[1])
    print(len(factors(gcd(a, b))))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates their greatest common divisor using the `gcd` function, finds the prime factors of the GCD using the `factors` function, and then prints the number of prime factors.
<|EOT|>
