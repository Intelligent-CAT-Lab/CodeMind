System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
4


```
import java.util.*;

class p03416 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int count = 0;
    for (int i = a; i <= b; i++) {
      int[] array = new int[5];
      array[0] = i % 10;
      array[1] = i / 10 % 10;
      array[2] = i / 100 % 10;
      array[3] = i / 1000 % 10;
      array[4] = i / 10000 % 10;
      if (array[0] == array[4] && array[1] == array[3]) {
        count++;
      }
    }
    System.out.println(count);
  }
}
```


Answer:
```python
def main():
    a, b = map(int, input().split())
    count = 0
    for i in range(a, b + 1):
        array = [int(digit) for digit in str(i)]
        if array[0] == array[-1] and array[1] == array[-2]:
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "11009 11332"
expected_output = "4"
output = str(main())
assert output == expected_output, f"Expected {expected_output}, got {output}"
```<|endoftext|>
