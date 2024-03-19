<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 1 3 4

Expected output:
n

```
num = list(map(int,input().split()))
num.sort()
if num[0] == num[1] and num[2] ==num[3]:
    print("yes")
else :
    print("no")

```

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] num = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            num[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(num);
        if (num[0] == num[1] && num[2] == num[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads the input, splits it into an array of strings, converts each string to an integer, and sorts the array. It then checks if the first two elements and the last two elements are equal, and prints "yes" if they are, and "no" otherwise.<｜end▁of▁sentence｜>
