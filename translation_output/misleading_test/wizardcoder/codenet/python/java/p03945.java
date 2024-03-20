Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
101

```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = (int) input.chars().filter(ch -> ch == 'W' || ch == 'B').count();
        System.out.println(count);
    }
}
```

Explanation:

In Java, we can use the `Scanner` class to read input from the user. We can then use the `chars()` method to iterate over each character in the input string. We can use the `filter()` method to select only the characters 'W' and 'B', and then use the `count()` method to count the number of selected characters. Finally, we can cast the result to an `int` and print it to the console.<|endoftext|>
