System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
Yes


```
import java.util.Scanner;

public class p02577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long c=0;
        for(int i=0;i<s.length();i++){
            c+=(s.charAt(i)-'0');
        }
        if(c%9 == 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

```


Answer:
```python
def main():
    s = input()
    c = sum(int(digit) for digit in s)
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "123456789",
    "99999999",
    "12345678",
    "1111111",
]

expected_outputs = [
    "Yes",
    "Yes",
    "No",
    "No",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    with patch("builtins.input", return_value=test_input):
        main()
        captured = capsys.readouterr()
        assert captured.out.strip() == expected_output
```<|endoftext|>
