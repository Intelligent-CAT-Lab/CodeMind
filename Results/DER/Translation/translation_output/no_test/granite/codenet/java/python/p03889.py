System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03889 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'b') {
				arr[i] = 'd';
			} else if (arr[i] == 'd') {
				arr[i] = 'b';
			} else if (arr[i] == 'p') {
				arr[i] = 'q';
			} else if (arr[i] == 'q') {
				arr[i] = 'p';
			}
		}
		StringBuilder sb = new StringBuilder(new String(arr));
		sb.reverse();
		if (s.equals(sb.toString())) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

```


Answer:
```python
import sys

def main():
    s = sys.stdin.readline().strip()
    arr = list(s)
    for i in range(len(arr)):
        if arr[i] == 'b':
            arr[i] = 'd'
        elif arr[i] == 'd':
            arr[i] = 'b'
        elif arr[i] == 'p':
            arr[i] = 'q'
        elif arr[i] == 'q':
            arr[i] = 'p'
    sb = ''.join(arr)
    if s == sb[::-1]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```<|endoftext|>
