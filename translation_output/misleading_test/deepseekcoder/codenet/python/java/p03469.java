<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2017/01/07

Expected output:
2018/O01/07

```
print('2018'+input()[4:])
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String year = String.valueOf(Integer.parseInt(date.substring(0, 4)) + 1);
        System.out.println(year + date.substring(4));
    }
}
```

This Java program reads a date in the format "YYYY/MM/DD" from the user, increments the year by 1, and then prints the new date. The `substring` method is used to extract the year and the rest of the date, and the `Integer.parseInt` method is used to convert the year from a string to an integer. The incremented year is then converted back to a string using `String.valueOf`.
<|EOT|>
