<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    sc = sys.stdin
    count = 0
    s = sc.readline()

    i = 0
    black = 0
    for i in range(len(s)):
        if s[i] == 'W':
            count += black
        else:
            black += 1

    print(count)

if __name__ == "__main__":
    main()
```</s>
