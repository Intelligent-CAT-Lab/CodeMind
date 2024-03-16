<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```

import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
from collections import deque
sys . setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
mod = 10 ** 9 + 7
DR = [ 1 , - 1 , 0 , 0 ]
DC = [ 0 , 0 , 1 , - 1 ]
def LI ( ) : return [ int ( x ) for x in sys . stdin . readline ( ) . split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys . stdin . readline ( ) . split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys . stdin . readline ( ) . split ( ) ]
def LS ( ) : return sys . stdin . readline ( ) . split ( )
def I ( ) : return int ( sys . stdin . readline ( ) )
def F ( ) : return float ( sys . stdin . readline ( ) )
def S ( ) : return input ( )
def main ( ) :
    s = S ( )
    k = 2019
    tens = [ 1 for _ in range ( len ( s ) + 1 ) ]
    for i in range ( 1 , len ( s ) + 1 ) :
        tens [ i ] = tens [ i - 1 ] * 10 % k
    mods0toi = [ 0 for _ in range ( len ( s ) ) ]
    cur = 0
    for i in range ( len ( s ) ) [ : : - 1 ] :
        j = len ( s ) - i - 1
        mods0toi [ i ] = ( cur + int ( s [ i ] ) * tens [ j ] ) % k
        cur = mods0toi [ i ]
    s = collections . Counter ( mods0toi )
    ans = 0
    t = s . keys ( )
    for c in t :
        if c == 0 :
            ans += s [ c ]
        ans += ( s [ c ] ) * ( s [ c ] - 1 ) // 2
    print ( ans )
main ( )


```

### Response:
```java
import java.util.*;
import java.io.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    static long[] tens;
    static long[] mods0toi;
    static final int k = 2019;
    static long[] count;

    public static void main(String[] args) throws IOException {
        String s = next();
        tens = new long[s.length() + 1];
        mods0toi = new long[s.length()];
        count = new long[k];

        tens[0] = 1;
        for (int i = 1; i <= s.length(); i++) {
            tens[i] = tens[i - 1] * 10 % k;
        }

        long cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + (s.charAt(i) - '0') * tens[j]) % k;
            cur = mods0toi[i];
            count[(int) mods0toi[i]]++;
        }

        long ans = 0;
        for (int i = 0; i < k; i++) {
            if (i == 0) {
                ans += count[i];
            }
            ans += (count[i] * (count[i] - 1)) / 2;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads a string, calculates the remainder of each digit when divided by 2019, and counts the number of occurrences of each remainder. It then calculates the number of pairs of indices whose remainders are the same, and adds this to the total count.
<|EOT|>
