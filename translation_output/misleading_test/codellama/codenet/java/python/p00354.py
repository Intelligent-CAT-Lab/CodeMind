<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import java.util.Scanner;

public class p00354 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("thu:fri:sat:sun:mon:tue:wed".split(":")[sc.nextInt()%7]);
    }
}
```

In Python, we can use the `split()` method to split a string into a list of substrings, and then use indexing to access the desired element.

Here's the Python code to solve the problem:
```
import sys

days = "thu:fri:sat:sun:mon:tue:wed"
days_list = days.split(":")

day_index = int(sys.stdin.readline()) % 7
print(days_list[day_index])
```
This code first defines a string `days` that contains the days of the week, separated by colons. It then splits the string into a list of substrings using the `split()` method, and stores the result in a variable `days_list`.

Next, it reads a line of input from the standard input using the `readline()` method, and converts it to an integer using the `int()` function. It then calculates the modulo of this integer with 7, which gives the index of the day of the week that we want to print.

Finally, it prints the desired day of the week using indexing, by accessing the element at the calculated index in the `days_list` list.</s>
