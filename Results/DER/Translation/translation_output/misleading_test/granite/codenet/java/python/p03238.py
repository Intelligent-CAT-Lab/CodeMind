System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1

Expected output:
Hell WoMrld

```
import java.util.*;

public class p03238{
	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int n = fs.nextInt();
		if(n == 1)System.out.println("Hello World");
		else {
			int a = fs.nextInt(),b = fs.nextInt();
			System.out.println(a+b);
		}
		fs.close();
	}
}
```


Answer:
```python
import sys

n = int(input())
if n == 1:
    print("Hello World")
else:
    a, b = map(int, input().split())
    print(a + b)
```

You can write the following test cases to ensure it works correctly:

```python
test_input_1 = "1"
expected_output_1 = "Hello World"
test_input_2 = "2\n1 2"
expected_output_2 = "3"

sys.stdin = open("input.txt", "w")
sys.stdout = open("output.txt", "w")

print(test_input_1, file=sys.stdin)
print(test_input_2, file=sys.stdin)

sys.stdin.close()
sys.stdout.close()

with open("output.txt", "r") as output_file:
    actual_output = output_file.read().strip()

assert actual_output == expected_output_1, "Test case 1 failed"

with open("output.txt", "w") as output_file:
    print(test_input_2, file=sys.stdin)

sys.stdin.close()
sys.stdout.close()

with open("output.txt", "r") as output_file:
    actual_output = output_file.read().strip()

assert actual_output == expected_output_2, "Test case 2 failed"
```<|endoftext|>
