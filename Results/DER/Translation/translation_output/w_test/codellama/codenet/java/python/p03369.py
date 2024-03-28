<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxo

Expected output:
900


```
import java.util.Scanner;

public class p03369 {

	static Scanner scanner;
	public static void main(String[] args) {
	    scanner = new Scanner(System.in);

	    String s=gs();

        System.out.println((s.length() - s.replace("o","").length())*100+700);
//        if (a<=x && a+b>=x) {
//        	System.out.print("YES");
//        }else {
//        	System.out.print("NO");
//        }


	}

	// æå­åã¨ãã¦å¥åãåå¾
	public static String gs() {
		return scanner.next();
	}

	// intã¨ãã¦å¥åãåå¾
	public static int gi() {
		return Integer.parseInt(scanner.next());
	}

	// longã¨ãã¦å¥åãåå¾
	public static long gl() {
		return Long.parseLong(scanner.next());
	}
	
	// doubleã¨ãã¦å¥åãåå¾
	public static double gd() {
		return Double.parseDouble(scanner.next());
	}
}
```
[/INST]
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    print((len(s) - len(s.replace("o", ""))) * 100 + 700)

if __name__ == "__main__":
    main()
```
This code reads a string from standard input using `sys.stdin.readline()`, strips the newline character from the end of the string using `strip()`, and then calculates the number of "o" characters in the string using `len(s) - len(s.replace("o", ""))`. The result is then multiplied by 100 and added to 700, and the final result is printed to standard output using `print()`.</s>
