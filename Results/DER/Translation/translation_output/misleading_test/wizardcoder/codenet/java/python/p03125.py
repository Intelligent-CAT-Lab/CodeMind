Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 12

Expected output:
-77

```
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class p03125 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        System.out.println(b % a == 0? a + b : b - a);
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

### Response:
```python
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class p03125 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        System.out.println(b % a == 0? a + b : b - a);
    }
}
```

The given java code is a simple program that takes two integers as input from the user and prints the sum or difference of the two numbers based on whether the second number is divisible by the first number or not. The solution is achieved using the modulo operator `%`. If the second number is divisible by the first number, then the sum of the two numbers is printed, otherwise, the difference of the two numbers is printed.

In Python, we can achieve the same functionality using the `if-else` statement. Here's the Python code:

```python
import java.util.*;
import java.util.stream.*;
import java.util.function.*;

public class p03125 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        
        if b % a == 0:
            print(a + b)
        else:
            print(b - a)
    }
}
```

In the above code, we have used the `if-else` statement to check whether the second number is divisible by the first number or not. If it is divisible, then we print the sum of the two numbers, otherwise, we print the difference of the two numbers.<|endoftext|>
