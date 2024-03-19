<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1 1 3

Expected output:
29

```
import java.util.*;

public class p02682{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    int d = scan.nextInt();
    int sum = 0;
    if (d<=a){
      System.out.println(d);
      return;
    }
    sum = a;
    d -= a;
    if(d<=b){
      System.out.println(sum);
      return;
    }
    d-=b;
    sum -= d;
    System.out.println(sum);
  }
}

```

### Response:
```python
def p02682():
    a, b, c, d = map(int, input().split())
    sum = 0
    if d <= a:
        return d
    sum = a
    d -= a
    if d <= b:
        return sum
    d -= b
    sum -= d
    return sum

print(p02682())
```

This Python code does the same thing as the Java code. It reads four integers from the input, and then calculates the sum of the first two integers if the third integer is less than or equal to the first one. If the third integer is greater than the first one, it subtracts the difference between the third and the first integer from the sum. Finally, it returns the sum.
<|EOT|>
