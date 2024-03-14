Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner

class p03369:
    scanner = Scanner(System.in)

    def main(args):
        s = gs()
        print((s.length() - s.replace("o", "").length()) * 100 + 700)

    def gs():
        return scanner.next()

    def gi():
        return int(scanner.next())

    def gl():
        return long(scanner.next())

    def gd():
        return float(scanner.next())

p03369().main(None)
```<|endoftext|>
