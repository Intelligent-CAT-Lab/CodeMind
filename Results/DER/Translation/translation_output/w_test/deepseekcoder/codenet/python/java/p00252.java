<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Open


```
B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")


```

### Response:
Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String B = scanner.nextLine();

        List<String> O = Arrays.asList("1 1 0", "0 0 1");

        if (O.contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```

This Java code reads a line of input from the user, checks if it's in the list of strings `O`, and prints "Open" if it is, "Close" otherwise.
<|EOT|>
