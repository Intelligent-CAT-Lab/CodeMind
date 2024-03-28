Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
X = int(input())

if X >= 400 and X <= 599:
  print(8)
elif X >= 600 and X <= 799:
  print(7)
elif X >= 800 and X <= 999:
  print(6)
elif X >= 1000 and X <= 1199:
  print(5)
elif X >= 1200 and X <= 1399:
  print(4)
elif X >= 1400 and X <= 1599:
  print(3)
elif X >= 1600 and X <= 1799:
  print(2)
elif X >= 1800 and X <= 1999:
  print(1)

```

### Response:
```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();

        if (X >= 400 && X <= 599) {
            System.out.println(8);
        } else if (X >= 600 && X <= 799) {
            System.out.println(7);
        } else if (X >= 800 && X <= 999) {
            System.out.println(6);
        } else if (X >= 1000 && X <= 1199) {
            System.out.println(5);
        } else if (X >= 1200 && X <= 1399) {
            System.out.println(4);
        } else if (X >= 1400 && X <= 1599) {
            System.out.println(3);
        } else if (X >= 1600 && X <= 1799) {
            System.out.println(2);
        } else if (X >= 1800 && X <= 1999) {
            System.out.println(1);
        }
    }
}
```<|endoftext|>
