System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
RUDLUDR

Expected output:
5>/

```
import java.util.Scanner;

public class p02910 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		for (int i = 0; i < N.length(); i++) {
			char c = N.charAt(i);
			if (i % 2 == 0) {
				if (c =='L') {
					System.out.println("No");
					break;
				}
			}else {
				if (c =='R') {
					System.out.println("No");
					break;
				}
			}
			if (i == N.length() - 1) {
				System.out.println("Yes");
			}
		}
	}

}
```


Answer:
```python
def main():
    N = input()

    for i in range(len(N)):
        c = N[i]
        if i % 2 == 0:
            if c =='L':
                print("No")
                break
        else:
            if c =='R':
                print("No")
                break
    else:
        print("Yes")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "RUDLUDR",
    "LLRRRRR",
    "RLRLRLRL",
]

expected_outputs = [
    "Yes",
    "No",
    "Yes",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    test_output = main(test_input)
    assert test_output == expected_output, f"Expected {expected_output}, got {test_output} for input {test_input}"
```<|endoftext|>
