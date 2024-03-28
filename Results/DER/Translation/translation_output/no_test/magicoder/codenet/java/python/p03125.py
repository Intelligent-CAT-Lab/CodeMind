<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    
    print(b % a == 0 and a + b or b - a)

if __name__ == "__main__":
    main()
```

The Python version of the code is quite straightforward. The `sys.stdin.readline()` function is used to read input from the standard input (stdin), which is equivalent to `sc.next()` in the Java version. The `int()` function is used to convert the input string to an integer. The `print()` function is used to output the result. The `and` and `or` operators are used for the ternary operator in Python, which is equivalent to the `? :` operator in Java.<｜end▁of▁sentence｜>
