System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12 4

Expected output:
33

```
import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}
```


Answer:
```python
import sys

def main():
    line = sys.stdin.readline()
    a, b = map(int, line.split())
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input_1 = "12 4"
expected_output_1 = "33"
test_input_2 = "5 2"
expected_output_2 = "1"
test_input_3 = "10 3"
expected_output_3 = "4"

actual_output_1 = main(test_input_1)
actual_output_2 = main(test_input_2)
actual_output_3 = main(test_input_3)

assert actual_output_1 == expected_output_1
assert actual_output_2 == expected_output_2
assert actual_output_3 == expected_output_3
```<|endoftext|>
