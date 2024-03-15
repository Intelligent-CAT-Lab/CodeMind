<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03315 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] ary = sc.next().toCharArray();
		int num=0;
		for (char c : ary) {
			if(c == '+') num++;
			else num--;
		}
		System.out.println(num);
	}
}


```
[/INST]
```python
import sys

def main():
    ary = input().tochararray()
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == "__main__":
    main()
```</s>
