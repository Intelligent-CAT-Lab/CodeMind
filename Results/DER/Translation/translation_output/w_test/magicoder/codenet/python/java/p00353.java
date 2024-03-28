<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 3000 3000

Expected output:
2000


```
m,f,b =map(int, input().split())
if m+f<b:
  print("NA")
elif m>=b:
  print("0")
else:
  print(b-m)

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int f = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (m + f < b) {
            System.out.println("NA");
        } else if (m >= b) {
            System.out.println("0");
        } else {
            System.out.println(b - m);
        }
    }
}
```

You can test this code with the following test input:

```
1000 3000 3000
```

And it should output:

```
2000
```<｜end▁of▁sentence｜>
