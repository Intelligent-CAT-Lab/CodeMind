<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    sum = 0
    if d <= a:
        print(d)
        return
    sum = a
    d -= a
    if d <= b:
        print(sum)
        return
    d -= b
    sum -= d
    print(sum)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, and then calculates and prints the result. If the fourth integer is less than or equal to the first, it prints the fourth integer. If the fourth integer is greater than the first, it subtracts the first from the fourth and then checks if the result is less than or equal to the second. If it is, it prints the sum of the first and the result of the subtraction. If the result is greater than the second, it subtracts the second from the result and then subtracts this from the sum of the first and the second. The final sum is then printed.
<|EOT|>
