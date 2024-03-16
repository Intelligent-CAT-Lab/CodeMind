<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.io.*;
import java.util.*;

public class codeforces_459_A {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        
        int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt();
        
        if (x1 == x2) {
            int dif = Math.abs(y1 - y2);
            pw.println((x1 + dif) + " " + y1 + " " + (x1 + dif) + " " + y2);
        } else if (y1 == y2) {
            int dif = Math.abs(x1 - x2);
            pw.println((x1) + " " + (y1 + dif) + " " + (x2) + " " + (y2 + dif));
        } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
            pw.println(x1 + " " + y2 + " " + x2 + " " + y1);
        } else {
            pw.println(-1);
        }
        
        pw.close();
    }
    
    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import math

def main():
    x1, y1, x2, y2 = map(int, input().split())

    if x1 == x2:
        dif = abs(y1 - y2)
        print(x1 + dif, y1, x1 + dif, y2)
    elif y1 == y2:
        dif = abs(x1 - x2)
        print(x1, y1 + dif, x2, y2 + dif)
    elif abs(x1 - x2) == abs(y1 - y2):
        print(x1, y2, x2, y1)
    else:
        print(-1)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `math` module to calculate the absolute value of the differences between the coordinates, and the `input()` function to read the coordinates from the user. The rest of the code is similar to the Java code, with the exception of the `debug()` function, which is not present in Python.</s>
