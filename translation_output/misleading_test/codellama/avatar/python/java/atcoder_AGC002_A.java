<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positie

```
a , b = map ( int , input ( ) . split ( ) )
if a <= 0 and 0 <= b :
    print ( " Zero " )
elif a < 0 and min ( b - a , - a ) % 2 == 0 :
    print ( " Negative " )
else :
    print ( " Positive " )


```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        if (a <= 0 && 0 <= b) {
            System.out.println("Zero");
        } else if (a < 0 && (b - a) % 2 == 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Positive");
        }
    }
}
```

Explanation:

* The `Scanner` class is used to read input from the user.
* The `split()` method is used to split the input string into two parts, separated by a space.
* The `parseInt()` method is used to convert the two parts of the input string into integers.
* The `if-else` statement is used to determine the sign of the number. If the number is less than or equal to 0 and the other number is greater than or equal to 0, the sign is "Zero". If the number is less than 0 and the difference between the two numbers is even, the sign is "Negative". Otherwise, the sign is "Positive".
* The `System.out.println()` method is used to print the result to the console.</s>
