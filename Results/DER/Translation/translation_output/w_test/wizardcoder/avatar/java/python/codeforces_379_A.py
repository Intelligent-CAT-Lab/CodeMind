Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
80 970

Expected output:
80


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
a, b = map(int, input().split())
res = a

while a >= b:
    res += a // b
    a = (a // b) + (a % b)

print(res)
```

Explanation:

- We first read the input values of a and b using the `map()` function and store them in variables `a` and `b`.
- We initialize the variable `res` to `a`.
- We use a while loop to keep adding the quotient of `a` divided by `b` to `res` until `a` is less than `b`.
- Inside the while loop, we first add the quotient of `a` divided by `b` to `res`.
- We then update `a` by adding the quotient of `a` divided by `b` to the remainder of `a` divided by `b`.
- Finally, we print the value of `res`.<|endoftext|>
