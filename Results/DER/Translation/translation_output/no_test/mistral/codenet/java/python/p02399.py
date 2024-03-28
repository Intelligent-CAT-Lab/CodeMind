<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    a = int(input())
    b = int(input())
    
    d = a//b
    r = a%b
    f = "{:.5f}".format(1.0*a/b)
    
    print(d, r, f)

if __name__ == "__main__":
    main()
```</s>
