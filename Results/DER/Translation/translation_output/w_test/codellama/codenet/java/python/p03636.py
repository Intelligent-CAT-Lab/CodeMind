<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```
[/INST]
```
import java.util.Scanner;

public class p03636 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

In Python, we can use the `input()` function to get the user input, and the `len()` function to get the length of the string. We can then use string slicing to extract the first and last characters of the string, and print them along with the length of the string minus 2.

Here's the Python code:
```
s = input("Enter a string: ")
leng = len(s)
print(s[0], leng-2, s[-1])
```
Sample input and output:
```
Enter a string: internationalization
i 18 n
```</s>
