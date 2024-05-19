System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1118

Expected output:
Yes


```
import java.util.Scanner;

public class p03543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int n1 = n % 10;
		int n10 = (n - n1) % 100/10;
		int n100 = (n - n1 - n10 * 10) % 1000/100;
		int n1000 = n / 1000;

		if ((n1 == n10 && n1 == n100)
				|| (n10 == n100 && n10 == n1000)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}

```


Answer:
```python
def main():
    n = int(input())

    n1 = n % 10
    n10 = (n - n1) % 100 // 10
    n100 = (n - n1 - n10 * 10) % 1000 // 100
    n1000 = n // 1000

    if (n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_cases = [
    (1118, "Yes"),
    (1212, "Yes"),
    (1234, "No"),
    (1111, "Yes"),
    (1122, "No"),
]
for n, expected_output in test_cases:
    with patch('builtins.input', return_value=str(n)):
        main()
        captured = capsys.readouterr()
        assert captured.out.strip() == expected_output
```<|endoftext|>
