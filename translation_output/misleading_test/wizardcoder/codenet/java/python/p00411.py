Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
0.057217574079786004

```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```

### Response:
```python
import math

a = float(input())
t = float(input())
r = float(input())

print(r * t / a)
```

Explanation:

- We first import the math module to use the constant pi.
- We then take input from the user for the values of a, t, and r.
- We calculate the final output using the formula r * t / a and print it to the console.<|endoftext|>
