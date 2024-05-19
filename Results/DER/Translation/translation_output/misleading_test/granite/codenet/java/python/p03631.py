System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
575

Expected output:
Ye

```
import java.util.Scanner;
public class p03631 {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// å¥å
    	int a = sc.nextInt();

    	int a100 = a/100;
    	int a10 = a/10 - a100*10;
    	int a1 = a - a100*100 - a10*10;
    	int rev = a1*100 + a10*10 + a100;
    	String ans;

    	if (a == rev){
    		ans = "Yes";
    	} else {
    		ans = "No";
    	}

    	// åºå
    	System.out.println(ans);
    }
}
```


Answer:
```python
def main():
    a = int(input())
    a100 = a // 100
    a10 = a // 10 % 10
    a1 = a % 10
    rev = a1 * 100 + a10 * 10 + a100
    ans = "Yes" if a == rev else "No"
    print(ans)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_data = [
    (575, "Yes"),
    (121, "Yes"),
    (12321, "Yes"),
    (1234, "No"),
]
for a, expected_output in test_data:
    with patch("builtins.input", return_value=str(a)):
        main()
        captured = capsys.readouterr()
        assert captured.out.strip() == expected_output
```<|endoftext|>
