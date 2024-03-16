<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    static int k = 2019;
    static int[] tens = new int[1000001];
    static int[] mods0toi = new int[1000000];
    static int cur = 0;
    static Map<Integer, Integer> s = new HashMap<>();
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            tens[i + 1] = tens[i] * 10 % k;
        }
        for (int i = 0; i < s1.length(); i++) {
            mods0toi[i] = (cur + Integer.parseInt(s1.charAt(i) + "")) % k;
            cur = mods0toi[i];
        }
        s = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            s.put(mods0toi[i], s.getOrDefault(mods0toi[i], 0) + 1);
        }
        for (int i = 0; i < s.keySet().size(); i++) {
            if (s.get(i) == 0) {
                ans += s.get(i);
            }
            ans += (s.get(i) - 1) / 2 * s.get(i);
        }
        System.out.println(ans);
    }
}
```</s>
