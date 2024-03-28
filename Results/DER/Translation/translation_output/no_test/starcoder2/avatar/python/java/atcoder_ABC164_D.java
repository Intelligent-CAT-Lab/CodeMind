
```

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = 2019;
        int[] tens = new int[s.length() + 1];
        for (int i = 0; i < tens.length; i++) {
            tens[i] = 1;
        }
        for (int i = 1; i < tens.length; i++) {
            tens[i] = tens[i - 1] * 10 % k;
        }
        int[] mods0toi = new int[s.length()];
        int cur = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = s.length() - i - 1;
            mods0toi[i] = (cur + (s.charAt(i) - '0') * tens[j]) % k;
            cur = mods0toi[i];
        }
        Map<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < mods0toi.length; i++) {
            if (s.containsKey(mods0toi[i])) {
                s.put(mods0toi[i], s.get(mods0toi[i]) + 1);
            } else {
                s.put(mods0toi[i], 1);
            }
        }
        int ans = 0;
        for (int c : s.keySet()) {
            if (c == 0) {
                ans += s.get(c);
            }
            ans += (s.get(c) * (s.get(c) - 1)) / 2;
        }
        System.out.println(ans);
    }
}


```

## 10. 1000000007

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
    n = I ( )
    a = LI ( )
    b = LI ( )
    c = LI ( )
    d = LI ( )
    e = LI ( )
    f = LI ( )
    ans = 0
    for i in range ( n ) :
        for j in range ( n ) :
            for k in range ( n ) :
                for l in range ( n ) :
                    for m in range ( n ) :
                        for o in range ( n ) :
                            if a [ i ] + b [ j ] + c [ k ] + d [ l ] + e [ m ] + f [ o ] == 1000000007 :
                                ans += 1
    print ( ans )
main ( )


```

java code:
```

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[n];
        int[] e = new int[n];
        int[] f = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextInt();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < n; l++) {
                        for (int m = 0; m < n; m++) {
                            for (int o = 0; o < n; o++) {
                                if (a[i] + b[j] + c[k] + d[l] + e[m] + f[o] == 1000000007) {
                                    ans++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ans);
    }
}


```

## 11. 1000000008

Translate the following python code to java and enclose your solution inside ```java```:
```

import math , string , itertools , fractions , heapq , collections , re , array , bisect , sys , random , time , copy , functools
from collections import deque
sys . setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
mod = 10 ** 9 + 7
DR = [ 1 , - 1 , 0 , 0 ]
DC = [ 0 ,
