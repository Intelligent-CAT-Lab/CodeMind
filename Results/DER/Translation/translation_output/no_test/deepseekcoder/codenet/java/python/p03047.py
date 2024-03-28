<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03047 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// æ´æ°ã®å¥å
		int n = sc.nextInt();
		int k= sc.nextInt();
		
		System.out.println(n-k+1);

	}
}
```

### Response:
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    print(n-k+1)

if __name__ == "__main__":
    main()
```
<|EOT|>
