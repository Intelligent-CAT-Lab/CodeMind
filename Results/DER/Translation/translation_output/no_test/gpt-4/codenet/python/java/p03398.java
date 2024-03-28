Here is the Java equivalent of the provided Python code. The Python code is using a list of numbers and then indexing it with an input number (`input()` in Python). In Java, we can use an array to store the numbers, and use the Scanner class to receive input from the user.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long[] numbers = {0L, 1L, 2L, 12L, 84L, 770L, 8340L, 106400L, 1546888L, 25343766L,
                          461133960L, 232367169L, 627905865L, 632459808L, 928262728L,
                          919805769L, 382796331L, 887217496L, 639768068L, 869694124L,
                          205875097L, 205589953L, 487772376L, 239955313L, 998339621L,
                          31622834L, 902930073L, 146839084L, 449786840L, 982224660L,
                          865803735L, 21834818L, 721531716L, 26008837L, 471774471L,
                          69010090L, 700009308L, 776938882L, 645550477L, 526939604L,
                          142728157L, 654489641L, 128201240L, 185493259L, 789721045L,
                          977049419L, 589149550L, 700648836L, 25087729L, 874433491L,
                          352791804L};

        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        if (index >= 0 && index < numbers.length) {
            System.out.println(numbers[index]);
        } else {
            System.out.println("Invalid index");
        }
        scanner.close();
    }
}
```
Please note that I've declared the array `numbers` with type `long` instead of `int`, as some values in the original list exceed the range of `int`. Also, an error message is printed if the input index is out of bounds, since array indices must be between 0 and the length of the array minus one in Java.
