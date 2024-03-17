<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5

Expected output:
YES


```
import java.util.*;
import java.math.BigDecimal;

public class p03210 {
	public static void main(String[] args) {  
  		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
      
      	if(age == 3 || age == 5 || age == 7) {
        	System.out.println("YES");
        } else {
          	System.out.println("NO");
        }

    }
}
```
[/INST]
```
import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age == 3 || age == 5 || age == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

Here's the Python code:
```
import sys

age = int(sys.stdin.readline())

if age == 3 or age == 5 or age == 7:
    print("YES")
else:
    print("NO")
```
Note that the `sys.stdin.readline()` method is used to read a line of input from the standard input stream, and the `int()` function is used to convert the input string to an integer.</s>
