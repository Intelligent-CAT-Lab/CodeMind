System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
Yes


```
import java.util.Scanner;

public class p03502 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 
	int N = sc.nextInt();

	int X = N;

	int fx = 0;


	while(N>=10) {

		fx += N%10;

		N /= 10;

	}

	fx += N;

	if(X%fx == 0) System.out.println("Yes");

	else System.out.println("No");
}

}
```


Answer:
```python
def main():
    n = int(input())
    x = n
    fx = 0
    while n >= 10:
        fx += n % 10
        n //= 10
    fx += n
    if x % fx == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "12",
    "35",
    "100",
    "101",
    "102",
]

test_outputs = [
    "Yes",
    "No",
    "Yes",
    "Yes",
    "No",
]

for test_input, expected_output in zip(test_inputs, test_outputs):
    input_value = test_input
    expected_value = expected_output
    actual_value = main()
    assert actual_value == expected_value, f"Expected {expected_value}, got {actual_value} for input {input_value}"
```<|endoftext|>
