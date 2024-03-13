<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
# B 
si = lambda: input()
ni = lambda: int(input())
nm = lambda: map(int, input().split())
nl = lambda: list(map(int, input().split()))
a,b=nm()

if a<=0<=b:
    print('Zero')
elif b<0:
    if (b-a+1)%2==1:
        print('Negative')
    elif (b-a+1)%2==0:
        print('Positive')
elif 0<a:
    print('Positive')
    

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (b < 0) {
            if ((b - a + 1) % 2 == 1) {
                System.out.println("Negative");
            } else if ((b - a + 1) % 2 == 0) {
                System.out.println("Positive");
            }
        } else if (0 < a) {
            System.out.println("Positive");
        }
    }
}
```<｜end▁of▁sentence｜>
