<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02111 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minute = 12 * 60 * n / 360;
        System.out.println((minute / 60) + " " + (minute % 60));
    }
}


Translate the above java code to python.

python code:

[/INST]
```
import math

n = int(input("Enter a number: "))
minute = 12 * 60 * n / 360
print(f"{minute // 60} {minute % 60}")
```
Explanation:

* `import math` is used to import the `math` module, which provides mathematical functions.
* `n = int(input("Enter a number: "))` prompts the user to enter a number and converts the input to an integer using the `int()` function.
* `minute = 12 * 60 * n / 360` calculates the number of minutes in the given number of hours.
* `print(f"{minute // 60} {minute % 60}")` prints the number of minutes in the given number of hours, with the minutes part rounded down to the nearest integer. The `f"{minute // 60} {minute % 60}"` is a formatted string literal, which is used to print the result in the desired format. The `//` operator is used to perform integer division, and the `%` operator is used to calculate the remainder.</s>
