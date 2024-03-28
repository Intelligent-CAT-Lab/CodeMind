<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
```python
import sys

def gs():
    return sys.stdin.readline().strip()

def gi():
    return int(sys.stdin.readline().strip())

def gl():
    return long(sys.stdin.readline().strip())

def gd():
    return float(sys.stdin.readline().strip())

def main():
    s = gs()
    print((len(s) - s.count('o'))*100 + 700)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads a string from the standard input, counts the number of 'o' characters in the string, and then prints the result of the calculation. The `gs()`, `gi()`, `gl()`, and `gd()` functions are used to read strings, integers, long integers, and double values from the standard input, respectively.<｜end▁of▁sentence｜>
