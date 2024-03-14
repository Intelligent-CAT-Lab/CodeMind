Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s.count("1"))

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.length() - s.replace("1", "").length());
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We create a new instance of the `Scanner` class and pass `System.in` as the input stream. We then read the input as a string using the `nextLine()` method of the `Scanner` class.

We then use the `count()` method of the `String` class to count the number of occurrences of the character "1" in the input string.

In Java, we can also use the `replace()` method of the `String` class to remove all occurrences of a character from a string. We can then subtract the length of the resulting string from the length of the original string to get the count of occurrences of "1".<|endoftext|>
