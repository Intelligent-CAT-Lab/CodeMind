<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder out = new StringBuilder();

    static int readInt() throws IOException {
        return Integer.parseInt(in.readLine());
    }

    static int[] readInts() throws IOException {
        String[] s = in.readLine().split(" ");
        int[] res = new int[s.length];
        for (int i = 0; i < s.length; i++)
            res[i] = Integer.parseInt(s[i]);
        return res;
    }

    public static void main(String[] args) throws IOException {
        int[] input = readInts();
        int d = input[0], t = input[1], a = input[2], b = input[3], da = input[4], db = input[5];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                if (a - da * i + b - db * j == d || a - da * i == d || b - db * j == d || d == 0) {
                    out.append("YES\n");
                    System.out.print(out);
                    return;
                }
            }
        }
        out.append("NO\n");
        System.out.print(out);
    }
}
```

This Java code does the same thing as the Python code. It reads in six integers from the standard input, then checks for each possible combination of `i` and `j` (where `i` and `j` range from 0 to `t-1`) whether `a - da*i + b - db*j` equals `d`, `a - da*i` equals `d`, `b - db*j` equals `d`, or `d` equals 0. If any of these conditions are met, it prints "YES" and returns. If no such combination is found after checking all combinations, it prints "NO".
<|EOT|>
