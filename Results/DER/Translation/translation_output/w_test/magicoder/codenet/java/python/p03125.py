<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 12

Expected output:
16


```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class p03125 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        System.out.println(b % a == 0 ? a + b : b - a);
    }
    
    // // ãã©ã¡ã¿æ¸¡ããã¡ããã¨ã¯ã©ã¹ä½ãã®ãé¢åãªã®ã§ææã
    // // å¿è¦ãªå¤ã¯ããã§å¨é¨åã£ã¦ãã¾ã
    // Scanner sc = new Scanner(System.in);
    // int n = Integer.parseInt(sc.next());
    // {sc.nextLine();}
    // int[] a = IntStream.range(0, n).map(i -> Integer.parseInt(sc.next())).toArray();
    
    // String solve() {
    //     return n + "" + Arrays.toString(a);
    // }
    
}

```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    print(b % a == 0 and a + b or b - a)

if __name__ == "__main__":
    main()
```

This Python code reads two integers from the standard input, `a` and `b`, and then prints the result of the expression `b % a == 0 ? a + b : b - a`. The `map(int, sys.stdin.readline().split())` line reads the input and splits it into two integers. The `if __name__ == "__main__":` line is a common idiom in Python to ensure that the `main()` function is only called when the script is run directly, not when it's imported as a module.<｜end▁of▁sentence｜>
