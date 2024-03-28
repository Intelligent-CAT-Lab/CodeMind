Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
pnxnn,muduhzn,aquud

Expected output:
FLxhm mMuduhzn Rj;uk

```
print ( input ( ). replace ( ", ", " â " ) )


```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(", ");
        String output = "";
        for (String word : words) {
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            output += firstLetter.toUpperCase() + restOfWord.toLowerCase() + " ";
        }
        System.out.println(output.trim());
    }
}
```

Explanation:

- We first import the `Scanner` class from the `java.util` package to read input from the user.
- We create a `Scanner` object `sc` to read input from the user.
- We read the input string from the user using `sc.nextLine()` and store it in the `input` variable.
- We split the input string into an array of words using `input.split(", ")`.
- We create an empty string `output` to store the output.
- We loop through each word in the `words` array using a for-each loop.
- For each word, we extract the first letter using `word.substring(0, 1)` and store it in the `firstLetter` variable.
- We extract the rest of the word using `word.substring(1)` and store it in the `restOfWord` variable.
- We convert the first letter to uppercase using `firstLetter.toUpperCase()` and store it back in the `firstLetter` variable.
- We convert the rest of the word to lowercase using `restOfWord.toLowerCase()` and store it back in the `restOfWord` variable.
- We append the modified word to the `output` string using `output += firstLetter.toUpperCase() + restOfWord.toLowerCase() + " ";`.
- We trim the `output` string using `output.trim()` to remove any extra spaces at the beginning or end.
- Finally, we print the `output` string using `System.out.println(output.trim())`.<|endoftext|>
