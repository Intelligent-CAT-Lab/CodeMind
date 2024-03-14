<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    leng = len(s)
    print(s[0], end='')
    print(leng-2, end='')
    print(s[leng-1])

if __name__ == "__main__":
    main()
```
<|EOT|>
