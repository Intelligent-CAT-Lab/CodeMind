<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02390{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int h = S / 3600;
        int hi = S % 3600;
        int m = hi / 60;
        int s = S % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import sys

S = int(sys.stdin.readline())
h = S // 3600
hi = S % 3600
m = hi // 60
s = S % 60
print(f"{h}:{m}:{s}")
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `floor()` function in Java. The `%` operator is used for modulo division in Python, which is equivalent to the `remainder()` function in Java.</s>
