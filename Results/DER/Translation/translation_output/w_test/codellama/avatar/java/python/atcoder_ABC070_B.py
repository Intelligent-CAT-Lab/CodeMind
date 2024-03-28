<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
0


```
import java.util.*;

public class atcoder_ABC070_B {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int[] array = new int[101];
        
        for (int i = a; i < b; i++) {
            array[i]++;
        }
        
        for (int i = c; i < d; i++) {
            array[i]++;
        }
        
        int ans = 0;
        for (int i = 0; i < 101; i++) {
            if (array[i] == 2) {
                ans++;
            }
        }
        
        System.out.println(ans);
    }
}
```
[/INST]
```python
import sys

def main():
    a, b, c, d = map(int, sys.stdin.readline().split())
    array = [0] * 101

    for i in range(a, b):
        array[i] += 1

    for i in range(c, d):
        array[i] += 1

    ans = 0
    for i in range(101):
        if array[i] == 2:
            ans += 1

    print(ans)

if __name__ == "__main__":
    main()
```
This is a solution to the problem in Python. The code first reads the input from the standard input using the `sys.stdin.readline()` method, and then splits the input into four integers using the `split()` method.

The code then creates an array of size 101 to store the number of times each integer from 0 to 100 appears in the input. The `for` loop iterates over the range of integers from `a` to `b` and increments the corresponding element in the array. The `for` loop iterates over the range of integers from `c` to `d` and increments the corresponding element in the array.

The code then iterates over the array and checks if each element is equal to 2. If it is, the code increments the `ans` variable. Finally, the code prints the value of `ans` to the standard output.

Note that this solution assumes that the input is valid and that the integers in the input are within the range of 0 to 100. If the input is not valid, the code may produce incorrect results or crash.</s>
