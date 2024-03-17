Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
H H

Expected output:
H


```
a,b=input().split()

if a=='H':
  print(b)
else:
  if b=='H':
    print('D')
  else:
    print('H')
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    if (a.equals("H")) {
      System.out.println(b);
    } else {
      if (b.equals("H")) {
        System.out.println("D");
      } else {
        System.out.println("H");
      }
    }
  }
}
```<|endoftext|>
