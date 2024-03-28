<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 20 15 17 5

Expected output:
NO


```
import sys
input = sys . stdin . readline
ii = lambda : int ( input ( ) )
mi = lambda : map ( int , input ( ) . split ( ) )
li = lambda : list ( map ( int , input ( ) . split ( ) ) )
from collections import defaultdict
d , t , a , b , da , db = mi ( )
def solve ( ) :
    for i in range ( t ) :
        for j in range ( t ) :
            if a - da * i + b - db * j == d or a - da * i == d or b - db * j == d or d == 0 :
                print ( ' YES ' )
                return
    print ( ' NO ' )
solve ( )


```
[/INST]
```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            int[] da = new int[a];
            int[] db = new int[b];
            for (int j = 0; j < a; j++) {
                da[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < b; j++) {
                db[j] = Integer.parseInt(st.nextToken());
            }
            if (solve(a, b, d, da, db)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean solve(int a, int b, int d, int[] da, int[] db) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a; i++) {
            map.put(da[i], i);
        }
        for (int i = 0; i < b; i++) {
            if (map.containsKey(db[i])) {
                int index = map.get(db[i]);
                if (a - index * d == d || a - index * d == d - 1 || b - index * d == d || b - index * d == d - 1 || d == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
```</s>
