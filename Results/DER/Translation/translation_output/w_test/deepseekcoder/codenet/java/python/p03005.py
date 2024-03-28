<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
1


```
import java.util.*;
public class p03005{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		if(k == 1){
			ans = 0;
		}else{
			ans = n - k;
		}
		
		System.out.println(ans);
	}
}

```

### Response:
```python
import sys

def main():
    ans = 0
    n, k = map(int, sys.stdin.readline().split())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

if __name__ == "__main__":
    main()
```

In Python, we use `sys.stdin.readline()` to read input from the console. The `map()` function is used to convert the input into integers. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly.
<|EOT|>
