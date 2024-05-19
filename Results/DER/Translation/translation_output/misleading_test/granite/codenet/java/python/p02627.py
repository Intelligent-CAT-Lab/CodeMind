System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
B

Expected output:
A

```
import java.util.*;

public class p02627{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(str.matches("[A-Z]")? "A" : "a");
    }
}
```


Answer:
```python
import re

def main():
    str = input()
    print("A" if re.match(r"[A-Z]", str) else "a")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_data = [
    ("B", "A"),
    ("a", "a"),
    ("1", "a"),
    ("A", "A"),
]
for input_str, expected_output in test_data:
    with patch("builtins.input", return_value=input_str):
        main()
        captured = capsys.readouterr()
        assert captured.out == expected_output + "\n"
```<|endoftext|>
