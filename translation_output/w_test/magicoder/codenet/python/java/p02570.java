<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1000 15 80

Expected output:
Yes


```
data=list(map(int,input().split()))
if data[0]/data[1]<=data[2]:
    print('Yes')
else:
    print('No')
```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int data0 = Integer.parseInt(input[0]);
        int data1 = Integer.parseInt(input[1]);
        int data2 = Integer.parseInt(input[2]);

        if ((double) data0 / data1 <= data2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

This Java code reads the input from the user, splits it into three parts, converts the first two parts into integers, and then checks if the first part divided by the second part is less than or equal to the third part. If it is, it prints "Yes"; otherwise, it prints "No".<｜end▁of▁sentence｜>
