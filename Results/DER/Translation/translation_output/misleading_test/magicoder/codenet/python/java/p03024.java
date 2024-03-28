<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxoxoxoxoxoxox

Expected output:
YESO

```
x=input()
a=0
for i in x:
  if i=='x':
    a+=1
print(["NO","YES"][a<=7])
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        int a = 0;
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == 'x') {
                a++;
            }
        }
        System.out.println(a <= 7 ? "YES" : "NO");
    }
}
```

You can test this code with the following test input:

```
oxoxoxoxoxoxox
```

And it will output:

```
YES
```<｜end▁of▁sentence｜>
