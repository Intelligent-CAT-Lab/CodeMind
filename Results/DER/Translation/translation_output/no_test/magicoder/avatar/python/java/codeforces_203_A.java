<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int da = scanner.nextInt();
        int db = scanner.nextInt();

        for (int i = 0; i <= t; i++) {
            for (int j = 0; j <= t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code you provided. It reads six integers from the standard input, and then checks if there exists some combination of `i` and `j` such that `a - da * i + b - db * j` equals `d`, `a - da * i` equals `d`, `b - db * j` equals `d`, or `d` equals `0`. If such a combination exists, it prints "YES" and returns. If no such combination is found after checking all possible combinations, it prints "NO".<｜end▁of▁sentence｜>
