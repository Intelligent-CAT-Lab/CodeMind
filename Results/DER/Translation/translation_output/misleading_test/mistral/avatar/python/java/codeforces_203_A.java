<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 20 15 17 5

Expected output:
NGO

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
        String input = br.readLine();
        String[] split = input.split(" ");
        int t = Integer.parseInt(split[0]);
        int a = Integer.parseInt(split[1]);
        int b = Integer.parseInt(split[2]);
        int d = Integer.parseInt(split[3]);
        int[] da = new int[t];
        int[] db = new int[t];
        for (int i = 0; i < t; i++) {
            String[] split2 = br.readLine().split(" ");
            da[i] = Integer.parseInt(split2[0]);
            db[i] = Integer.parseInt(split2[1]);
        }
        for (int i = 0; i < t; i++) {
            if (a - da[i] * i + b - db[i] * i == d || a - da[i] * i == d || b - db[i] * i == d || d == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
```</s>
