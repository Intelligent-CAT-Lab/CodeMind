System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
+-++

Expected output:
88

```
import java.util.Scanner;

public class p03315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		int num=0;
		for (char c : ary) {
			if(c == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}


```


Answer:
```python
def main():
    ary = input()
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "++-"
expected_output = 1
assert main(test_input) == expected_output

test_input = "++--+"
expected_output = 1
assert main(test_input) == expected_output

test_input = "-+-++"
expected_output = -1
assert main(test_input) == expected_output
```<|endoftext|>
