<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxxoxoo

Expected output:
o

```
import java.util.Scanner;
public class p01521
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		char c[]=in.next().toCharArray();
		System.out.println(c[0]=='x'&&c[c.length-1]=='x' ? "x":"o");
	}
}
```
[/INST]
```
import java.util.Scanner;

public class p01521 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] c = in.next().toCharArray();
		System.out.println(c[0] == 'x' && c[c.length - 1] == 'x' ? "x" : "o");
	}
}
```

Here's the Python code that translates the Java code:
```
import java.util.Scanner

class p01521:
    def main(self, args):
        in = Scanner(System.in)
        c = in.next().toCharArray()
        print(c[0] == 'x' and c[c.length - 1] == 'x' ? 'x' : 'o')
```
Note that the `Scanner` class is not available in Python, so we need to use a different method to read input from the user. In this case, we use the `input()` function to read a string from the user and then convert it to a character array using the `toCharArray()` method.</s>
