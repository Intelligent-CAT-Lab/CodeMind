<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    s = input()
    print((len(s) - len(s.replace("o", ""))) * 100 + 700)

if __name__ == "__main__":
    main()
```
This is the equivalent Python code for the given Java code. The `input()` function is used to read a string from the user, and the `len()` function is used to get the length of the string. The `replace()` method is used to remove all occurrences of the letter "o" from the string, and the `len()` function is used again to get the length of the resulting string. The result is then multiplied by 100 and added to 700, and the final result is printed to the console.</s>
