Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s[::2])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, s.length() - 1));
    }
}
```

Explanation:

In Java, we can use the `substring()` method to extract a portion of a string. The `substring()` method takes two arguments: the starting index and the ending index of the substring. In this case, we want to extract every other character from the input string, so we can use `substring(0, s.length() - 1)` to extract all characters except the last one.<|endoftext|>
