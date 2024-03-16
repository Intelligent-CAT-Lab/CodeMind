
```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int INF = Integer.MAX_VALUE;
    static long LINF = Long.MAX_VALUE;
    static int MOD = 1000000007;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[] dx8 = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy8 = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dx4 = {1, 0, -1, 0};
    static int[] dy4 = {0, 1, 0, -1};

    public static void main(String[] args) {
        String s = sc.next();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i) - '0';
            int cc = na + c;
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }
}
```

## C

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input_methods = [ ' clipboard ' , ' file ' , ' key ' ]
using_method = 0
input_method = input_methods [ using_method ]
IN = lambda : map ( int , input ( ) . split ( ) )
mod = 1000000007
def main_b ( ) :
    s = input ( )
    pp = 0
    na = 0
    for i , c in enumerate ( s [ : : - 1 ] ) :
        cc = na + int ( c )
        na = 0
        if cc <= 4 :
            pp += cc
        else :
            na = 1
            if i == len ( s ) - 1 :
                pp += 1
            pp += 10 - cc
    print ( pp )
def main ( ) :
    s = input ( )
    pmin = 1000
    mmin = 0
    s = '0' + s
    for c in s [ : : - 1 ] :
        v = int ( c )
        npmin = min ( pmin + 10 - ( v + 1 ) , mmin + 10 - v )
        nmmin = min ( pmin + v + 1 , mmin + v )
        pmin = npmin
        mmin = nmmin
    return min ( pmin , mmin )
isTest = False
def pa ( v ) :
    if isTest :
        print ( v )
def input_clipboard ( ) :
    import clipboard
    input_text = clipboard . get ( )
    input_l = input_text . splitlines ( )
    for l in input_l :
        yield l
if __name__ == " _ _ main _ _ " :
    if sys . platform == ' ios ' :
        if input_method == input_methods [ 0 ] :
            ic = input_clipboard ( )
            input = lambda : ic . __next__ ( )
        elif input_method == input_methods [ 1 ] :
            sys . stdin = open ( ' inputFile . txt ' )
        else :
            pass
        isTest = True
    else :
        pass
    ret = main ( )
    if ret is not None :
        print ( ret )


```

java code:
```
import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int INF = Integer.MAX_VALUE;
    static long LINF = Long.MAX_VALUE;
    static int MOD = 1000000007;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int[] dx8 = {0, 1, 1, 1, 0, -1, -1, -1};
    static int[] dy8 = {1, 1, 0, -1, -1, -1, 0, 1};
    static int[] dx4 = {1, 0, -1, 0};
    static int[] dy4 = {0, 1, 0, -1};

    public static void main(String[] args) {
        String s = sc.next();
        int pp = 0;
        int na = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int c = s.charAt(i) - '0';
            int cc = na + c;
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == s.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }
}
```

## D

Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
input_methods = [ ' clipboard ' , ' file ' , ' key ' ]
using_method = 0
input_method = input_methods [ using_method ]
IN = lambda : map ( int , input ( ) . split ( ) )
mod = 1000000007
def main_b ( ) :
    s = input ( )
    pp = 0
    na = 0
    for i , c in enumerate ( s [ : : - 1 ] ) :
        cc = na + int ( c )
        na = 0
        if cc <= 4 :
            pp += cc
        else :
            na = 1
            if i == len ( s ) - 1 :
                pp += 1
            pp += 10 - cc
    print ( pp )
def main ( ) :
    s = input ( )
    pmin = 1000
    mmin = 0
    s = '0' + s
    for c in s [ : : - 1 ] :
        v = int ( c )
        npmin = min ( pmin + 
