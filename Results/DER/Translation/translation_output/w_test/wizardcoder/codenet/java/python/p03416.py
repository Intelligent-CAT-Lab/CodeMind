Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
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

### Response:
```python
a, b = map(int, input().split())
count = 0

for i in range(a, b+1):
    array = [int(x) for x in str(i)]
    if array[0] == array[4] and array[1] == array[3]:
        count += 1

print(count)
```

Explanation:

- We first take input from the user using the `input()` function and split it into two variables `a` and `b` using the `split()` function.
- We initialize a variable `count` to 0 to keep track of the number of pairs of numbers that satisfy the given condition.
- We use a `for` loop to iterate over all the numbers from `a` to `b`.
- For each number, we convert it to a list of digits using the `str()` function and then convert each digit to an integer using a list comprehension.
- We check if the first and fifth digits of the number are equal and the second and fourth digits are equal. If they are, we increment the `count` variable.
- Finally, we print the value of `count`.<|endoftext|>
