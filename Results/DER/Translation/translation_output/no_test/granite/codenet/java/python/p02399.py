System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02399 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		int d = a/b;
		int r = a%b;
		String f = String.format("%.5f",  1.0 * a / b);
		
		System.out.printf("%d %d %s", d, r, f);
		
	}

}
```


Answer:
```python
import java.util.Scanner;

class p02399:

    def main(self):
        sc = Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        sc.close()
        d = a // b
        r = a % b
        f = "{:.5f}".format(1.0 * a / b)
        print(d, r, f)

p02399().main()
```<|endoftext|>
