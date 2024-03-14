Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x=input()
a=0
for i in x:
  if i=='x':
    a+=1
print(["NO","YES"][a<=7])
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.nextLine();
    int a = 0;
    for (int i = 0; i < x.length(); i++) {
      if (x.charAt(i) == 'x') {
        a++;
      }
    }
    System.out.println(a <= 7? "NO" : "YES");
  }
}
```<|endoftext|>
