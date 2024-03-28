<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
x=max(a,b,c)
y=min(a,b,c)
z=a+b+c-x-y
if (z-y)%2==0:
  print(x-z+(z-y)//2)
else:
  print(x-z+1+(z-y+1)//2)
```

### Response:
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x = Math.max(Math.max(a, b), c);
        int y = Math.min(Math.min(a, b), c);
        int z = a + b + c - x - y;

        if ((z - y) % 2 == 0) {
            System.out.println(x - z + (z - y) / 2);
        } else {
            System.out.println(x - z + 1 + (z - y + 1) / 2);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the input, finds the maximum and minimum of these integers, and then calculates a result based on the difference between the two middle integers and the maximum integer. The result is then printed to the console.
<|EOT|>
