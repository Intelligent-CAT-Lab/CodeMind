Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


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
        for (char c : chars) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        System.out.println(input.substring(0, count) + input.substring(count, input.length()));
    }
}
```

Explanation:

In Java, we can use the Scanner class to read input from the user. We can then convert the input string to a character array and iterate over each character to count the number of letters. We can then use the substring method to extract the first count characters from the input string and concatenate them with the remaining characters to get the desired output.<|endoftext|>
