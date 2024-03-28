Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
b


```
C=input()
al=[]
for idx in range(97,123):
  al.append(chr(idx))
idx = al.index(C)
print(al[idx+1])
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String C = sc.nextLine();
    char[] al = new char[26];
    for (int i = 0; i < 26; i++) {
      al[i] = (char) (i + 97);
    }
    int idx = -1;
    for (int i = 0; i < 26; i++) {
      if (C.equals(String.valueOf(al[i]))) {
        idx = i;
        break;
      }
    }
    if (idx == -1) {
      System.out.println("Invalid input");
    } else {
      System.out.println(al[idx + 1]);
    }
  }
}
```<|endoftext|>
