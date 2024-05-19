System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 7 4

Expected output:
2


```
import java.util.*;
public class p02696 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long a=sc.nextLong();
		long b=sc.nextLong();
		long n=sc.nextLong();
		if(n>=b){
			System.out.println(a*(b-1)/b);
		}else{
			System.out.println(a*n/b);
		}
	}
}
```


Answer:
```python
import sys

def main():
    a, b, n = map(int, sys.stdin.readline().split())
    if n >= b:
        print(a * (b - 1) // b)
    else:
        print(a * n // b)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "5 7 4"
expected_output = "2"
output = subprocess.check_output(["python", "p02696.py"], input=test_input, text=True)
assert output.strip() == expected_output
```<|endoftext|>
