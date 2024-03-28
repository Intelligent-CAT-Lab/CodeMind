<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
25

Expected output:
ChC!eRmms

```
D=int(input())
d={25:'Christmas',24:'Christmas Eve',23:'Christmas Eve Eve',22:'Christmas Eve Eve Eve'}
print(d[D])
```
[/INST]
```java
import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "";
        switch (input) {
            case 25:
                output = "Christmas";
                break;
            case 24:
                output = "Christmas Eve";
                break;
            case 23:
                output = "Christmas Eve Eve";
                break;
            case 22:
                output = "Christmas Eve Eve Eve";
                break;
            default:
                output = "Invalid input";
                break;
        }
        System.out.println(output);
    }
}
```
This code uses a `switch` statement to check the input and print the corresponding output. The `switch` statement is used instead of an `if-else` statement because it is more concise and easier to read.

The `Scanner` class is used to read the input from the user. The `nextInt()` method is used to read the input as an integer.

The `String` output variable is used to store the output of the program. The `switch` statement is used to check the input and set the output variable accordingly.

Finally, the output is printed using the `System.out.println()` method.</s>
