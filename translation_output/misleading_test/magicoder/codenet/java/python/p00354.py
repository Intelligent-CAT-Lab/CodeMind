<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
fr

```
import java.util.Scanner;
public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}

```

@@ Response
Here is the Python equivalent of the given Java code:

```python
day_of_week = ["thu", "fri", "sat", "sun", "mon", "tue", "wed"]

def get_day(day_number):
    return day_of_week[day_number % 7]

day_number = int(input())
print(get_day(day_number))
```

In this Python code, we first define a list `day_of_week` that contains the days of the week. Then we define a function `get_day` that takes a day number as input and returns the corresponding day of the week. The `%` operator is used to ensure that the day number is within the range of the list. Finally, we get the day number from the user, call the `get_day` function with this number, and print the result.<｜end▁of▁sentence｜>
