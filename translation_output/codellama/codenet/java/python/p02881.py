<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.io.*;
import java.util.*;

public class p02881 {


    private  static void solver(InputReader sc, PrintWriter out) throws Exception {
        long n = sc.nextLong();
        long sqrt = (long) Math.sqrt(n);
        long x=0,y=0;
        for(long i=sqrt;i>=1;i--){
            if(n%i==0){
               x  =i;
               y = (long) n/i;
                break;
            }
        }
        long ans =0;
        if(x!=0 && y!=0)
             ans = (x-1)+(y-1);
        else
            ans = n-1;
        out.println(ans);
    }
    private  static long gcd(long a, long b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }

    public static void main(String[] args) throws Exception{
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        solver(in,out);
        out.close();
    }
    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        public long nextLong(){
            return Long.parseLong(next());
        }

        public long[] readLongArr(int n){
            long arr[] = new long[n];
            for(int i=0; i<n; i++){
                arr[i] = nextLong();
            }
            return arr;
        }
        public int[] readIntArr(int n){
            int arr[] = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = nextInt();
            }
            return arr;
        }
    }
}
class Pair implements Comparable<Pair>{
    int x;
    String s;
    Pair(int x, String s){
        this.x = x;
        this.s = s;
    }
    public int compareTo(Pair p){
        return this.x-p.x;
    }
}

Translate the above java code to python.

python code:

[/INST]
```python
import math

def solver(n):
    sqrt = int(math.sqrt(n))
    x, y = 0, 0
    for i in range(sqrt, 0, -1):
        if n % i == 0:
            x = i
            y = n // i
            break
    ans = 0
    if x != 0 and y != 0:
        ans = x - 1 + y - 1
    else:
        ans = n - 1
    return ans

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    n = int(input())
    print(solver(n))

if __name__ == "__main__":
    main()
```
This is the Python translation of the Java code. The `solver` function is similar to the `solver` method in the Java code, but it takes a single argument `n` instead of a `InputReader` object. The `gcd` function is also similar, but it takes two arguments `a` and `b` instead of a single argument `n`. The `main` function is also similar, but it takes no arguments and prints the result of the `solver` function to the console.

Note that the `readLongArr` and `readIntArr` methods in the Java code are not present in the Python code, as they are not necessary for the functionality of the program.</s>
