<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 50 50 100

Expected output:
-21

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
This is a solution to the problem you provided. It uses the `sys` module to read input from stdin and the `map` function to convert the input strings to integers. It then creates an array of size 101 to store the counts of the numbers between 0 and 100.

The program then loops through the input ranges and increments the corresponding elements in the array. Finally, it loops through the array again to count the number of elements that have a value of 2, which indicates that the number is in both ranges.

The solution is enclosed in a `main` function and the `if __name__ == "__main__":` block is used to ensure that the code is only executed when the file is run as a script.</s>
