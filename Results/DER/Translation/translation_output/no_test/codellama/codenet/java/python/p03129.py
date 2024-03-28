<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}




Translate the above java code to python.

python code:

[/INST]
```
import sys

def main():
    sc = sys.stdin.readline().split()
    if (int(sc[0]) + 1) // 2 >= int(sc[1]):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
Note: The `//` operator in Python is used for integer division, which is equivalent to the `floor()` function in Java.</s>
