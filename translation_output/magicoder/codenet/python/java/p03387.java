<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c=map(int,input().split())
x=max(a,b,c)
y=min(a,b,c)
z=a+b+c-x-y
if (z-y)%2==0:
  print(x-z+(z-y)//2)
else:
  print(x-z+1+(z-y+1)//2)
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
        int x = Math.max(a, Math.max(b, c));
        int y = Math.min(a, Math.min(b, c));
        int z = a + b + c - x - y;
        if ((z - y) % 2 == 0) {
            System.out.println(x - z + (z - y) / 2);
        } else {
            System.out.println(x - z + 1 + (z - y + 1) / 2);
        }
    }
}
```<｜end▁of▁sentence｜>
