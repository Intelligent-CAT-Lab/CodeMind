System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3

Expected output:
6


```
import java.util.*;
import java.lang.*;


public class p03796 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        double power = 1;
        for (int i = 1; i <= cnt; i++) {
            power = (power*i)%(Math.pow(10, 9) + 7);
        }
        System.out.println((int)power);
    }
}
```


Answer:
```python
def main():
    cnt = int(input())
    power = 1
    for i in range(1, cnt + 1):
        power = (power * i) % (10 ** 9 + 7)
    print(int(power))

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "3",
]

test_outputs = [
    "6",
]

def test_main():
    from io import StringIO
    import sys
    for test_input, test_output in zip(test_inputs, test_outputs):
        sys.stdin = StringIO(test_input)
        main()
        assert sys.stdout.getvalue() == test_output + "\n"

test_main()
```<|endoftext|>
