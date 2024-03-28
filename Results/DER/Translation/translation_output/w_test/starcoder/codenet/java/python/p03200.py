<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
BBW

Expected output:
2


```
import java.util.Scanner;

public class p03200 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long count =0;
		String s = sc.next();

		int i=0;
		int black=0;
		for (;i<s.length();i++) {
			if (s.charAt(i)=='W') {
				count +=black;
			} else {
				black++;
			}
		}
		System.out.println(count);
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    s = sys.stdin.readline().strip()
    count = 0
    black = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1
    print(count)

if __name__ == '__main__':
    main()
```
<|endoftext|>
