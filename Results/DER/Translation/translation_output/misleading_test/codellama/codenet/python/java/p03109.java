<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2019/04/30

Expected output:
Heeisei

```
A,B,C = map(str,input().split("/"))
if int(A) <= 2018:
  print("Heisei")
elif int(A) == 2019 and int(B) <=4 and int(C)<=30:
  print("Heisei")
else:
  print("TBD")

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split("/");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        if (year <= 2018) {
            System.out.println("Heisei");
        } else if (year == 2019 && month <= 4 && day <= 30) {
            System.out.println("Heisei");
        } else {
            System.out.println("TBD");
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `split()` method to split the input string into three parts (year, month, and day). It then uses the `parseInt()` method to convert the strings to integers, and the `if-else` statement to determine the output based on the input.</s>
