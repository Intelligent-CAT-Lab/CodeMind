Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
101

Expected output:
2


```
print(input().count('1'))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.length() - input.replace("1", "").length());
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We then use the `count()` method to count the number of occurrences of the character '1' in the input string. The `replace()` method is used to remove all occurrences of the character '1' from the input string. Finally, we subtract the length of the resulting string from the length of the original string to get the number of '1's in the input string.<|endoftext|>
