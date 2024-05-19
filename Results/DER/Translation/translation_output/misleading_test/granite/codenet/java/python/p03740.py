System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2 1

Expected output:
Brown

```
import java.util.Scanner;
public class p03740 {
    public static void main(String[] args) {
		try{
			Scanner sc  = new Scanner(System.in);
			System.out.println(Math.abs(sc.nextLong() - sc.nextLong()) <= 1? "Brown" : "Alice");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
```


Answer:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    if abs(a - b) <= 1:
        print("Brown")
    else:
        print("Alice")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "2 1"
expected_output = "Brown"
output = io.StringIO()
with redirect_stdout(output):
    main()
assert output.getvalue().strip() == expected_output
```<|endoftext|>
