System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 900

Expected output:
es

```
import java.util.Scanner;
 
class p02811 {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();

		if( X <= 500*K ) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
    
}
```


Answer:
```python
import sys

def main():
    K, X = map(int, sys.stdin.readline().split())
    if X <= 500 * K:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    ("2 900", "Yes"),
    ("2 1000", "No"),
    ("1 500", "Yes"),
    ("1 1000", "No"),
]
for input_str, expected_output in test_cases:
    sys.stdin = io.StringIO(input_str)
    main()
    assert sys.stdout.getvalue().strip() == expected_output
```<|endoftext|>
