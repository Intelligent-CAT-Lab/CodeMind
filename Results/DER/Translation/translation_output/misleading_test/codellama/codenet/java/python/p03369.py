<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
oxo

Expected output:
977

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
Explanation:

* The `sys` module is used to read input from stdin.
* The `strip()` method is used to remove any leading or trailing whitespace from the input string.
* The `len()` function is used to get the length of the input string.
* The `replace()` method is used to replace all occurrences of the letter "o" with an empty string.
* The `len()` function is used again to get the length of the string after replacing all occurrences of "o".
* The difference between the two lengths is calculated and multiplied by 100 to get the final result.
* The result is then printed to stdout.

Note: The `if __name__ == "__main__":` block is used to prevent the code from being executed when the file is imported as a module.</s>
