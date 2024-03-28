

```python
import sys

def calc(n, x):
    if n == 0:
        return 1
    sum = 0
    x -= 1
    length = length(n-1)
    p = p(n-1)
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n-1, x)
        x -= length
    if x > 0:
        x -= 1
        sum += 1
    if x > 0:
        if length <= x:
            sum += p
        else:
            sum += calc(n-1, x)
    return sum

def length(n):
    return 1 + 4 * ((2**n) -1)

def p(n):
    return 1 + 2 * ((2**n) -1)

n, x = map(int, sys.stdin.readline().split())
print(calc(n, x))
```

## 03210

```

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
10


```

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p03210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner();
        int n = sc.nextInt();

        System.out.println(calc(n));
    }


    static long calc(int n){
        if(n == 0)
            return 1;
        long sum = 0;
        long length = length(n-1);
        long p = p(n-1);
        sum += p;
        sum += calc(n-1);
        sum += p;
        sum += calc(n-1);
        return sum;
    }

    static long length(int n){
        return 1 + 4 * ((long)Math.pow(2, n) -1);
    }

    static long p(int n){
        return 1 +2 * ((long)Math.pow(2, n) -1);
    }
}

class Scanner {
    private static final int SPACE = (int)' ';
    private static final int LINE_END_0 = 13;
    private static final int LINE_END_1 = 10;
    private static final int BEFORE = -1;
    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public String next(){
        StringBuilder sb = new StringBuilder();
        
        int length = BEFORE;
        readLoop: while(true) {
            try {
                int value = br.read();
                switch(value) {
                case LINE_END_1:
                    if(length == BEFORE)
                        break;
                    
                    if((int)sb.charAt(length) == LINE_END_0)
                        sb.deleteCharAt(length);
                case SPACE:
                    break readLoop;
                }
                sb.append((char)value);
                length++;

            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
    
    public String[] nextArray(int length) {
        String[] array = new String[length];
        for(int i = 0; i < length; i++)
            array[i] = next();
        return array;
    }
    
    public double nextDouble() {
        return Double.parseDouble(next());
    }
    
    public double[] nextDoubleArray(int length) {
        double[] array = new double[length];
        for(int i = 0; i < length; i++)
            array[i] = nextDouble();
        return array;
    }
    
    public int nextInt() {
        return Integer.parseInt(next());
    }
    
    public int[] nextIntArray(int length) {
        int[] array = new int[length];
        for(int i = 0; i < length; i++)
            array[i] = nextInt();
        return array;
    }
    
    public long nextLong() {
        return Long.parseLong(next());
    }
    
    public long[] nextLongArray(int length) {
        long[] array = new long[length];
        for(int i = 0; i < length; i++)
            array[i] = nextLong();
        return array;
    
