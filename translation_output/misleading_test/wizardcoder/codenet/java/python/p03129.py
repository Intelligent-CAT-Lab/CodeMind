Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
kg-

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

### Response:
```python
import java.util.*;

public class p03129 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        if((sc.nextInt() + 1) / 2 >= sc.nextInt()) System.out.println("YES");
        else System.out.println("NO");
    }

}
```

In Python, we can use the `input()` function to get input from the user. We can then use the `if` statement to check if the sum of the first integer and 1 divided by 2 is greater than or equal to the second integer. If it is, we print "YES". Otherwise, we print "NO". Here's the Python code:

```python
a = int(input())
b = int(input())
if (a + 1) // 2 >= b:
    print("YES")
else:
    print("NO")
```

Note that we use the floor division operator `//` to perform integer division. This ensures that the result is an integer, rather than a float.<|endoftext|>
