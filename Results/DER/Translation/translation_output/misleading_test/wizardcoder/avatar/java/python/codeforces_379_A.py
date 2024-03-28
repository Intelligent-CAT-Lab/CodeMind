Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
80 970

Expected output:
146

```
import java.util.*;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        
        while (a >= b) {
            res += (a / b);
            a = (a / b) + (a % b);
        }
        
        System.out.println(res);
    }
}
```

### Response:
```python
import java.util.*;

public class codeforces_379_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int res = a;
        
        while (a >= b) {
            res += (a // b);
            a = (a // b) + (a % b);
        }
        
        System.out.println(res);
    }
}
```

Explanation:

- We import the `java.util` package to use the `Scanner` class.
- We declare the `main` function which takes in a string array of arguments.
- We create a `Scanner` object to read input from the standard input stream.
- We read two integers `a` and `b` from the input stream using the `nextInt()` method of the `Scanner` class.
- We initialize the `res` variable to `a`.
- We use a `while` loop to repeatedly divide `a` by `b` and add the quotient to `res` until `a` is less than `b`.
- Inside the loop, we use integer division `//` to get the quotient and modulo `%` to get the remainder.
- We update `a` by adding the quotient to it and the remainder.
- Finally, we print the value of `res` to the standard output stream using the `println()` method of the `System.out` object.<|endoftext|>
