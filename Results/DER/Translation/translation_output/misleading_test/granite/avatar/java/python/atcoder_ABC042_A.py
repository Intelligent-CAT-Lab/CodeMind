System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 5 7

Expected output:
NO

```
import java.util.*;

class atcoder_ABC042_A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int num_1 = Integer.parseInt(str);

        str = scan.next();
        int num_2 = Integer.parseInt(str);

        str = scan.next();
        int num_3 = Integer.parseInt(str);

        if (num_1 == 7) {
            if (num_2 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_2 == 7) {
            if (num_1 == 5 && num_3 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else if (num_3 == 7) {
            if (num_2 == 5 && num_1 == 5) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
```


Answer:
```python
import sys

def main():
    input = sys.stdin.read()
    data = list(map(int, input.split()))

    if data[0] == 7:
        if data[1] == 5 and data[2] == 5:
            print("YES")
        else:
            print("NO")
    elif data[1] == 7:
        if data[0] == 5 and data[2] == 5:
            print("YES")
        else:
            print("NO")
    elif data[2] == 7:
        if data[0] == 5 and data[1] == 5:
            print("YES")
        else:
            print("NO")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input_1 = "5 5 7"
expected_output_1 = "YES"
test_input_2 = "7 7 5"
expected_output_2 = "YES"
test_input_3 = "7 5 5"
expected_output_3 = "NO"

output_1 = main(test_input_1)
output_2 = main(test_input_2)
output_3 = main(test_input_3)

assert output_1 == expected_output_1
assert output_2 == expected_output_2
assert output_3 == expected_output_3
```<|endoftext|>
