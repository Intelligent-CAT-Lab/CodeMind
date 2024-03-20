Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i1n

```
a,*b,c = input()
print(a+str(len(b))+c)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'i' || chars[i] == 'n') {
                count++;
            }
        }
        System.out.println(input.charAt(0) + "" + count + input.charAt(input.length() - 1));
    }
}
```

Explanation:

In Java, we can use the Scanner class to read input from the user. We can then convert the input string to a character array and iterate through it to count the number of occurrences of the letters 'i' and 'n'. Finally, we can print the first character of the input string, the count, and the last character of the input string.<|endoftext|>
