<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 7 9 3

Expected output:
Yes


```
import java.util.Scanner;
public class p03351{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int ab = Math.abs(a-b);
        int ac = Math.abs(a-c);
        int bc = Math.abs(b-c);
        if(ac <= d || (ab <= d && bc <= d)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }
    }
}
```

### Response:
```python
def p03351(a, b, c, d):
    ab = abs(a-b)
    ac = abs(a-c)
    bc = abs(b-c)
    if ac <= d or (ab <= d and bc <= d):
        return "Yes"
    else:
        return "No"

# Test input
print(p03351(4, 7, 9, 3))
```

In the Python code, we define a function `p03351` that takes four arguments `a`, `b`, `c`, and `d`. The function calculates the absolute differences `ab`, `ac`, and `bc` between `a`, `b`, and `c` respectively. It then checks if `ac` is less than or equal to `d`, or if `ab` and `bc` are both less than or equal to `d`. If either of these conditions is true, it returns "Yes". Otherwise, it returns "No". The function is then called with the test input `4, 7, 9, 3` and the result is printed.
<|EOT|>
