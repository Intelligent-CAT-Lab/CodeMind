<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import java.util
import java.util.stream
import java.util.function

def p03125():
    sc = java.util.Scanner(java.util.System.in)
    a = int(sc.next())
    b = int(sc.next())
    
    return b % a == 0 ? a + b : b - a

# // ãã©ã¡ã¿æ¸¡ãã░ããã¨ã¯ã©ã¹ä½ãã®ã░é¢å'ãªã®ã§ææã
# // å¿"?è¦ãªå¤ã¯ããã§å"?é¨åã£ã¦ãã¾ã
# sc = java.util.Scanner(java.util.System.in)
# n = int(sc.next())
# {sc.nextLine();}
# a = [int(sc.next()) for i in range(n)]

# def solve():
#     return n + "" + str(a)

# return solve()
```</s>
