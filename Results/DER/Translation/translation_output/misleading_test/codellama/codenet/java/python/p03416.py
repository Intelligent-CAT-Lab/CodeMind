<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
11009 11332

Expected output:
101

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
[/INST]
```python
import sys

def main():
    a, b = map(int, sys.stdin.readline().split())
    count = 0
    for i in range(a, b+1):
        array = [i % 10, i // 10 % 10, i // 100 % 10, i // 1000 % 10, i // 10000 % 10]
        if array[0] == array[4] and array[1] == array[3]:
            count += 1
    print(count)

if __name__ == "__main__":
    main()
```
This code uses the `sys` module to read input from stdin and the `map` function to convert the input strings to integers. It then uses a for loop to iterate over the range of numbers from `a` to `b`, and for each number, it creates an array of the digits of the number and checks if the first and last digits are the same, and the second and third digits are the same. If both conditions are true, it increments the `count` variable. Finally, it prints the value of `count`.</s>
