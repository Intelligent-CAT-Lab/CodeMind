<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s.count("1"))

```

@@ Response
Here is the Java equivalent of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int count = countOccurrences(s, "1");
        System.out.println(count);
    }

    public static int countOccurrences(String str, String word) {
        String a[] = str.split("\\s");
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the user, counts the number of occurrences of the character "1" in the string, and then prints the count. The `countOccurrences` method is used to count the number of occurrences of a specific word in a string.<｜end▁of▁sentence｜>
