System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
260522

Expected output:
-1


```
import java.util.*;

public class atcoder_ABC174_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 7;
        int res = 1;

        while (num < n) {
            num = num * 10 + 7;
            res++;
        }

        Set<Integer> set = new HashSet<>();

        while (true) {
            if (num % n == 0)
                break;
            num %= n;
            res++;
            if (!set.add(num)) {
                res = -1;
                break;
            }
            num = num * 10 + 7;
        }

        System.out.println(res);
    }
}
```


Answer:
```python
def main():
    n = int(input())
    num = 7
    res = 1

    while num < n:
        num = num * 10 + 7
        res += 1

    seen = set()

    while True:
        if num % n == 0:
            break
        num %= n
        res += 1
        if num in seen:
            res = -1
            break
        seen.add(num)
        num = num * 10 + 7

    print(res)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "260522",
    "100000000",
    "100000007",
]

expected_outputs = [
    "-1",
    "1",
    "1",
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    test_output = str(main(test_input))
    assert test_output == expected_output, f"Expected output {expected_output}, but got {test_output} for input {test_input}"
```<|endoftext|>
