Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
fAIR, LATER, OCCASIONALLY CLOUDY.

Expected output:
Fair, later, occasionally cloudy.


```
s = input()
print(s.swapcase())

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.replaceAll("[a-z]", String.valueOf(Character.toUpperCase(s.charAt(0))) + String.valueOf(Character.toLowerCase(s.charAt(0)))));
    }
}
```

Explanation:

In Java, we can use the `replaceAll()` method to replace all occurrences of a character or a substring with another string. In this case, we are using it to replace all lowercase letters with their uppercase counterparts and vice versa.

We first read the input string using the `Scanner` class and store it in the `s` variable. Then, we use the `replaceAll()` method to replace all lowercase letters with their uppercase counterparts and vice versa.

Finally, we print the modified string using the `System.out.println()` method.<|endoftext|>
