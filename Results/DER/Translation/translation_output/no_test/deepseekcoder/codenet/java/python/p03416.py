<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    for i in range(a, b+1):
        array = [int(d) for d in str(i)]
        if len(array) < 5:
            array = [0]*(5-len(array)) + array
        if array[0] == array[4] and array[1] == array[3]:
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, generates all 5-digit numbers between these two integers, and counts how many of these 5-digit numbers have the same first and last digit. The count is then printed to the standard output.
<|EOT|>
