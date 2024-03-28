<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000

Expected output:
6BC

```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p03813 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        if (input < 1200) {
            System.out.println("ABC");
        } else {
            System.out.println("ARC");
        }
    }
}
```

In Python, we can use the `input()` function to read a line of text from the user, and then use the `int()` function to convert the input to an integer. We can then use an if-else statement to check if the input is less than 1200, and print "ABC" or "ARC" accordingly.

Here is the Python code:
```
input_str = input("Enter a number: ")
input_int = int(input_str)
if input_int < 1200:
    print("ABC")
else:
    print("ARC")
```
This code will prompt the user to enter a number, and then convert the input to an integer. If the input is less than 1200, it will print "ABC", otherwise it will print "ARC".</s>
