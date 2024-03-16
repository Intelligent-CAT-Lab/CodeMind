<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

scanner = iter(sys.stdin.readline, '')

def gs():
    return next(scanner)

def gi():
    return int(next(scanner))

def gl():
    return long(next(scanner))

def gd():
    return float(next(scanner))

def main():
    s = gs().strip()
    print((len(s) - s.count('o'))*100 + 700)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads a string from standard input, counts the number of 'o's in the string, and then prints the result of that count multiplied by 100 plus 700.
<|EOT|>
