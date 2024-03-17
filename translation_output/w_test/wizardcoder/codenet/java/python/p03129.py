Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

The given java code is a simple program that takes two integers as input from the user and checks if the sum of the first integer and 1 divided by 2 is greater than or equal to the second integer. If the condition is true, it prints "YES" else it prints "NO".

In python, we can achieve the same functionality using the input() function to take input from the user and the if-else statement to check the condition. Here's the solution:

```python
a = int(input())
b = int(input())

if((a + 1) // 2 >= b):
    print("YES")
else:
    print("NO")
```

In this solution, we first take two integers as input using the input() function and store them in variables a and b. Then we check if the sum of a and 1 divided by 2 is greater than or equal to b using the if-else statement. If the condition is true, we print "YES" else we print "NO".

Note that we used the floor division operator // instead of the regular division operator / to get the integer part of the division.<|endoftext|>
