<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2017/01/07

Expected output:
2018/O01/07

```
print('2018'+input()[4:])
```

@@ Response
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String year = "2018";
        System.out.println(year + input.substring(4));
    }
}
```

This Java code reads a date from the user, and then prints the same date with the year changed to 2018. The `substring(4)` method is used to get the rest of the date string after the year.

You can test this code with the following test input:

```
2017/01/07
```

And the expected output will be:

```
2018/01/07
```<｜end▁of▁sentence｜>
