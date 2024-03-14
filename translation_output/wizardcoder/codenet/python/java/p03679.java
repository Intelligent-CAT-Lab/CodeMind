Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x,a,b=map(int,input().split())
if b<=a:
  print('delicious')
elif (b-a)<=x:
  print('safe')
else:
  print('dangerous')
```

### Response:
```java
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    if (b <= a) {
      System.out.println("delicious");
    } else if (b - a <= x) {
      System.out.println("safe");
    } else {
      System.out.println("dangerous");
    }
  }
}
```<|endoftext|>
