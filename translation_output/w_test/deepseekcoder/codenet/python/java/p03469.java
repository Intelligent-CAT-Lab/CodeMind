<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2017/01/07

Expected output:
2018/01/07


```
print('2018'+input()[4:])
```

### Response:
```java
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);
        date = date.plusYears(1);
        System.out.println(date.format(formatter));
    }
}
```

This Java code reads a date in the format "yyyy/MM/dd" from the user, adds one year to it, and then prints the new date. The `java.time` package is used to handle dates and times in Java. The `LocalDate` class represents a date (year, month, day), and the `DateTimeFormatter` class provides methods for formatting and parsing dates.
<|EOT|>
