Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n = input()
tmp = 0
for i in range(len(n)):
  tmp = (tmp + int(n[i])) % 9

print("Yes") if tmp == 0 else print("No")
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    int tmp = 0;
    for (int i = 0; i < n.length(); i++) {
      tmp = (tmp + Character.getNumericValue(n.charAt(i))) % 9;
    }
    System.out.println(tmp == 0? "Yes" : "No");
  }
}
```<|endoftext|>
