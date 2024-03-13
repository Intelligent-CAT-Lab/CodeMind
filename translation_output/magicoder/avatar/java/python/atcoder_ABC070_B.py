<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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

@@ Response
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

This Python code does the same thing as the Java code. It reads four integers from the standard input, creates an array of 101 elements, and then increments the array elements at the indices corresponding to the input integers. Finally, it counts the number of elements in the array that have a value of 2 and prints the count.<｜end▁of▁sentence｜>
