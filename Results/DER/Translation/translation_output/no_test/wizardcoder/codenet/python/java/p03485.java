Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=map(int,input().split())
c = (a+b)/2
d = int(c)
if c-d>0:
  print(d+1)
else:
  print(d)
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    double c = (a + b) / 2.0;
    int d = (int) c;
    if (c - d > 0) {
      System.out.println(d + 1);
    } else {
      System.out.println(d);
    }
  }
}
```<|endoftext|>
