Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud

Expected output:
pnxnn muduhzn aquud


```
print ( input ( ). replace ( ", ", " â " ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(", ");
        String output = String.join(" ", words);
        System.out.println(output);
    }
}
```

Explanation:

- We first import the `Scanner` class from the `java.util` package to read input from the user.
- We then create a `Scanner` object to read input from the user.
- We read the input as a string and store it in the `input` variable.
- We split the input string into an array of words using the `split()` method and store it in the `words` variable.
- We join the words in the `words` array using the `join()` method and store it in the `output` variable.
- We print the `output` variable to the console.<|endoftext|>
