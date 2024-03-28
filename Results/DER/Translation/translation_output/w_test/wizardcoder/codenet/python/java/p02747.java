Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
hihi

Expected output:
Yes


```
S = input() 
if (S == 'hi' or S == 'hihi' or S == 'hihihi' or S == 'hihihihi' or S == 'hihihihihi'):
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
    String S = sc.nextLine();
    if (S.equals("hi") || S.equals("hihi") || S.equals("hihihi") || S.equals("hihihihi") || S.equals("hihihihihi")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
```<|endoftext|>
