Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
AtCoder Beginner Contest

Expected output:
AC

```
A,x,C=input().split()
print("A"+x[0]+"C")

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        String output = "A" + arr[0].charAt(0) + "C";
        System.out.println(output);
    }
}
```<|endoftext|>
