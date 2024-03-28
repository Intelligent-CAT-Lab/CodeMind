Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
a

Expected output:
vowel


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
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        if (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o') {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
```<|endoftext|>
