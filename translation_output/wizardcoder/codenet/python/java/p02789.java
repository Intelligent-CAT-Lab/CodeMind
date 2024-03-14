Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a = [int(i) for i in input().split()]
if a[0] == a[1]:
  print('Yes')
else:
  print('No')
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[2];
    for (int i = 0; i < 2; i++) {
      a[i] = sc.nextInt();
    }
    if (a[0] == a[1]) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
```<|endoftext|>
