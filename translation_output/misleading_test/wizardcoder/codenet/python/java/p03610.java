Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdr>

```
s = input()
print(s[::2])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replaceAll("(?<=.)(.)(?=.)", "$2"));
    }
}
```

Explanation:

In Java, we can use the `replaceAll()` method to replace all occurrences of a substring with another substring. The `(?<=.)(.)(?=.)` regular expression matches any character that is not a newline character (`.`) followed by any character (`.`) followed by any character that is not a newline character (`.`). This regular expression matches any character that is not a newline character and replaces it with the second captured group (`.`). This effectively removes all even-indexed characters from the input string.

The `replaceAll()` method returns a new string with all occurrences of the regular expression replaced with the replacement string. In this case, we use the replacement string `$2` to replace all occurrences of the second captured group (`.`) with nothing. This effectively removes all even-indexed characters from the input string.

Finally, we print the modified string using `System.out.println()`.<|endoftext|>
