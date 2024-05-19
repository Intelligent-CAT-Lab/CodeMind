System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12

Expected output:
Yoes

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
    "15",
    "24",
    "30",
    "36",
    "45",
    "54",
    "63",
    "72",
    "81",
    "90",
    "99",
]

expected_outputs = [
    "Yes",
    "No",
    "Yes",
    "No",
    "Yes",
    "No",
    "Yes",
    "No",
    "Yes",
    "No",
    "Yes",
    "Yes",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    with patch("builtins.input", return_value=test_input):
        main()
        captured = capsys.readouterr()
        assert captured.out.strip() == expected_output
```<|endoftext|>
