System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 20

Expected output:
31

```
import java.util.*;
public class p03481 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Long X = sc.nextLong();
        Long Y = sc.nextLong();

        int i=0;
        while(X<=Y){
            i++;
            X*=2;
        }

        System.out.println(i);
    }
}
```


Answer:
```python
import sys

def main():
    X, Y = map(int, sys.stdin.readline().split())
    i = 0
    while X <= Y:
        X *= 2
        i += 1
    print(i)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "3 20"
expected_output = "31"

with patch('builtins.input', side_effect=[test_input]):
    output = io.StringIO()
    with redirect_stdout(output):
        main()
    assert output.getvalue().strip() == expected_output
```<|endoftext|>
