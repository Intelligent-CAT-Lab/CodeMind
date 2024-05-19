System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```


Answer:
```python
import sys

def main():
    s = sys.stdin.read().strip()
    leng = len(s)
    print(s[0] + str(leng-2) + s[leng-1])

if __name__ == "__main__":
    main()
```

Test input:
internationalization

Expected output:
i18n<|endoftext|>
