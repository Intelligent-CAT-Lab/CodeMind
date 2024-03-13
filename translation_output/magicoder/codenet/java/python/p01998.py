<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p01998 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean[] arr = new boolean[n + 3];
		arr[0] = true;
		arr[1] = true;
		int count = 0;
		for (int i = 2; i < arr.length; i++) {
		    if (!arr[i]) {
		        for (int j = 2; j * i < arr.length; j++) {
		            arr[i * j]  = true;
		        }
		        if (!arr[i] && !arr[i - 2]) {
		            count++;
		        }
		    }
		}
		System.out.println(count * 2);
	}
}


```

@@ Response
```python
import sys

def main():
    n = int(sys.stdin.readline())
    arr = [False] * (n + 3)
    arr[0] = True
    arr[1] = True
    count = 0
    for i in range(2, len(arr)):
        if not arr[i]:
            for j in range(2, (len(arr) - 1) // i + 1):
                arr[i * j] = True
            if not arr[i] and not arr[i - 2]:
                count += 1
    print(count * 2)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, creates a boolean array of size `n + 3`, initializes the first two elements as `True`, and then iterates over the array. If an element is `False`, it marks all multiples of that number as `True`. If an element is `False` and its two preceding elements are also `False`, it increments the count. Finally, it prints the count multiplied by 2.<｜end▁of▁sentence｜>
