<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c = map(int,input().split())
if a == b and b != c:
  print("Yes")
elif b == c and a != b:
  print("Yes")
elif a == c and a != b:
  print("Yes")
else:
  print("No")
```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a == b && b != c) || (b == c && a != b) || (a == c && a != b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<｜end▁of▁sentence｜>
