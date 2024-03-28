<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

A,B,C = map(str,input().split("/"))
if int(A) <= 2018:
  print("Heisei")
elif int(A) == 2019 and int(B) <=4 and int(C)<=30:
  print("Heisei")
else:
  print("TBD")


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
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
Note that the `Scanner` class is used to read input from the user, and the `split()` method is used to split the input string into an array of strings based on the "/" character. The `parseInt()` method is used to convert the strings to integers.</s>
