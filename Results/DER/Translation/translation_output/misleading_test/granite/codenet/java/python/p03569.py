System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
xabxa

Expected output:
-81

```
import java.util.*;

public class p03569 {
    public void main(Scanner sc) {
        String s = sc.next();
        int length = s.length();

        int cnt = 0;
        int l = 0;
        int r = length - 1;
        while (l <= r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);

            if (cl == cr) {
                l++;
                r--;
            } else {
                if (cl == 'x') {
                    cnt++;
                    l++;
                } else if (cr == 'x') {
                    cnt++;
                    r--;
                } else {
                    cnt = -1;
                    break;
                }
            }
        }

        System.out.println(cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new p03569().main(sc);
        sc.close();
    }
}

```


Answer:
```python
def main():
    s = input()
    length = len(s)

    cnt = 0
    l = 0
    r = length - 1
    while l <= r:
        cl = s[l]
        cr = s[r]

        if cl == cr:
            l += 1
            r -= 1
        else:
            if cl == 'x':
                cnt += 1
                l += 1
            elif cr == 'x':
                cnt += 1
                r -= 1
            else:
                cnt = -1
                break

    print(cnt)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "xabxa",
    "xxabxxa",
    "axbax",
    "axbxax",
    "axbxaxb",
    "axbxaxbxaxb",
]

expected_outputs = [
    -81,
    1,
    0,
    1,
    2,
    3,
]

for test_input, expected_output in zip(test_inputs, expected_outputs):
    input_value = test_input
    expected_value = expected_output
    actual_value = main()
    assert actual_value == expected_value, f"Expected {expected_value}, got {actual_value} for input {input_value}"

print("All test cases passed!")
```<|endoftext|>
