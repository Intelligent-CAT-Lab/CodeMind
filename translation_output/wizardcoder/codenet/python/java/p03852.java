Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
x = input()

if x == "a" or x == "i" or x == "u" or x == "e" or x == "o" :
    print("vowel")
else:
    print("consonant")

```

### Response:
```java
import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String x = input.nextLine();

        if (x.equals("a") || x.equals("i") || x.equals("u") || x.equals("e") || x.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
```<|endoftext|>
