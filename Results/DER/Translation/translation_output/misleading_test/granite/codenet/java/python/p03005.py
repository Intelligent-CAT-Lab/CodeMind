System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 2

Expected output:
34

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


Answer:
```python
import sys

def main():
    n, k = map(int, sys.stdin.readline().split())
    ans = 0
    if k == 1:
        ans = 0
    else:
        ans = n - k
    print(ans)

if __name__ == "__main__":
    main()
```

Test input:
```
3 2
```

Expected output:
```
34
```<|endoftext|>
