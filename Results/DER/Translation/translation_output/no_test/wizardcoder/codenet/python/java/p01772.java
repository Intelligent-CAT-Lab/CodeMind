Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
ans = ""
flag = False
for c in s:
  if c == "A" and not flag:flag = True
  if c == "Z" and flag:
    ans += "AZ"
    flag = False
if ans == "":
  print(-1)
else:
  print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String ans = "";
    boolean flag = false;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c == 'A' &&!flag) {
        flag = true;
      } else if (c == 'Z' && flag) {
        ans += "AZ";
        flag = false;
      }
    }
    if (ans.isEmpty()) {
      System.out.println(-1);
    } else {
      System.out.println(ans);
    }
  }
}
```<|endoftext|>
