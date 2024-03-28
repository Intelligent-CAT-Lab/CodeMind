<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
40

```
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
```
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

n = int(input())
print(solver(n))
```</s>
