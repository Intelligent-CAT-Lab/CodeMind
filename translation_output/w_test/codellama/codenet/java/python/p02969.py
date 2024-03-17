<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4

Expected output:
48


```
import java.util.*;

class p02969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(a*a*3);
    }
}


```
[/INST]
```
import java.util.Scanner;

public class p02969 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a*a*3);
    }
}
```

In Python, we can use the `input()` function to read a line of text from the user, and the `int()` function to convert the input to an integer. We can then use the `*` operator to multiply the input by 3 and print the result.
```
a = int(input())
print(a*a*3)
```
This code will read a line of text from the user, convert it to an integer, and then multiply it by 3 and print the result.

Here is an example of how the code would work:
```
$ python3 p02969.py
4
48
```
In this example, the user enters the number 4, and the code multiplies it by 3 and prints the result, which is 48.</s>
