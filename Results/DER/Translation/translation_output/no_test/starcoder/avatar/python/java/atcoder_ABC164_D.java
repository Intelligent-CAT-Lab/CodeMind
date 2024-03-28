<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```

import math, string, itertools, fractions, heapq, collections, re, array, bisect, sys, random, time, copy, functools
from collections import deque
sys. setrecursionlimit ( 10 ** 7 )
inf = 10 ** 20
mod = 10 ** 9 + 7
DR = [ 1, - 1, 0, 0 ]
DC = [ 0, 0, 1, - 1 ]
def LI ( ) : return [ int ( x ) for x in sys. stdin. readline ( ). split ( ) ]
def LI_ ( ) : return [ int ( x ) - 1 for x in sys. stdin. readline ( ). split ( ) ]
def LF ( ) : return [ float ( x ) for x in sys. stdin. readline ( ). split ( ) ]
def LS ( ) : return sys. stdin. readline ( ). split ( )
def I ( ) : return int ( sys. stdin. readline ( ) )
def F ( ) : return float ( sys. stdin. readline ( ) )
def S ( ) : return input ( )
def main ( ) :
    s = S ( )
    k = 2019
    tens = [ 1 for _ in range ( len ( s ) + 1 ) ]
    for i in range ( 1, len ( s ) + 1 ) :
        tens [ i ] = tens [ i - 1 ] * 10 % k
    mods0toi = [ 0 for _ in range ( len ( s ) ) ]
    cur = 0
    for i in range ( len ( s ) ) [ : : - 1 ] :
        j = len ( s ) - i - 1
        mods0toi [ i ] = ( cur + int ( s [ i ] ) * tens [ j ] ) % k
        cur = mods0toi [ i ]
    s = collections. Counter ( mods0toi )
    ans = 0
    t = s. keys ( )
    for c in t :
        if c == 0 :
            ans += s [ c ]
        ans += ( s [ c ] ) * ( s [ c ] - 1 ) // 2
    print ( ans )
main ( )


```

java code:<fim_suffix><fim_middle>
```

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = 2019;
        int[] tens = new int[s.length() + 1];
        tens[0] = 1;
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
        Map<Integer, Integer> sMap = new HashMap<>();
        for (int i = 0; i < mods0toi.length; i++) {
            if (sMap.containsKey(mods0toi[i])) {
                sMap.put(mods0toi[i], sMap.get(mods0toi[i]) + 1);
            } else {
                sMap.put(mods0toi[i], 1);
            }
        }
        int ans = 0;
        Set<Integer> sSet = sMap.keySet();
        for (int c : sSet) {
            if (c == 0) {
                ans += sMap.get(c);
            }
            ans += (sMap.get(c) * (sMap.get(c) - 1) / 2);
        }
        System.out.println(ans);
    }
}


```
<|endoftext|>
