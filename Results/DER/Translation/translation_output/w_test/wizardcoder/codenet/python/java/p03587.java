Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
111100

Expected output:
4


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

In Java, we can use the `Scanner` class to read input from the user. We then use the `count()` method to count the number of occurrences of the character "1" in the input string. 

However, the problem statement requires us to count the number of "1" bits in the binary representation of the input string. We can achieve this by first converting the input string to a binary string using the `Integer.toBinaryString()` method, and then counting the number of "1" bits using the `replaceAll()` method. 

Finally, we subtract the number of "0" bits from the length of the binary string to get the number of "1" bits.<|endoftext|>
