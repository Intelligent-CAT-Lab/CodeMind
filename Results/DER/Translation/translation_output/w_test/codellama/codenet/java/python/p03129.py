<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
YES


```
import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}



```
[/INST]
```
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if (a + 1) // 2 >= b:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```
Note: The `//` operator in Python is used for integer division, which is equivalent to the `floor` function in Java.</s>
