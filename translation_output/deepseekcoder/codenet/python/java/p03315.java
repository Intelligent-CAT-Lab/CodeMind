<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int e = countOccurrences(a, "+");
        int f = countOccurrences(a, "-");
        System.out.println(e - f);
    }

    public static int countOccurrences(String str, String subStr) {
        int lastIndex = 0;
        int count = 0;

        while (lastIndex != -1) {
            lastIndex = str.indexOf(subStr, lastIndex);

            if (lastIndex != -1) {
                count++;
                lastIndex += subStr.length();
            }
        }

        return count;
    }
}
```

This Java code does the same thing as the Python code. It reads a line of input, counts the number of "+" and "-" characters in the input, and then prints the difference between the two counts. The `countOccurrences` method is a helper method that counts the number of occurrences of a substring in a string.
<|EOT|>
