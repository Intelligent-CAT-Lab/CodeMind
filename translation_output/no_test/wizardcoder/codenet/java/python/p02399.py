Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import java.util.Scanner

public class p02399:

    def main(args):
        sc = Scanner(System.in)
        a = sc.nextInt()
        b = sc.nextInt()
        sc.close()
        d = a/b
        r = a%b
        f = format(1.0 * a / b, '.5f')
        print(d, r, f)

```<|endoftext|>
