<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1199

Expected output:
BC

```
n = int(input())
if(n < 1200):
    print("ABC")
elif(n < 2800):
    print("ARC")
else:
    print("AGC")
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 1200){
            System.out.println("ABC");
        } else if(n < 2800){
            System.out.println("ARC");
        } else {
            System.out.println("AGC");
        }
    }
}
```

You can test this code with the following test case:

Test input:
1199

Expected output:
ABC<｜end▁of▁sentence｜>
