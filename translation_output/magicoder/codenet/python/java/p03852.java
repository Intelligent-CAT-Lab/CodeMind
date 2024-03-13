<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
x = input()

if x == "a" or x == "i" or x == "u" or x == "e" or x == "o" :
    print("vowel")
else:
    print("consonant")

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        if (x.equals("a") || x.equals("i") || x.equals("u") || x.equals("e") || x.equals("o")) {
            System.out.println("vowel");
        } else {
            System.out.println("consonant");
        }
    }
}
```

In this Java code, we use the `Scanner` class to get user input. The `equals` method is used instead of `==` to compare strings in Java. The `equals` method checks if the content of the strings is the same, while `==` checks if the references are the same.<｜end▁of▁sentence｜>
