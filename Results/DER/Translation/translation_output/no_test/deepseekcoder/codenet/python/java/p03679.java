<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

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
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (b <= a) {
            System.out.println("delicious");
        } else if ((b - a) <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
```
<|EOT|>
