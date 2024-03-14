<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    ary = sys.stdin.readline().strip()
    num=0
    for c in ary:
        if c == '+': 
            num += 1
        else: 
            num -= 1
    print(num)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, then iterates over each character in the string. If the character is '+', it increments `num` by 1. If the character is anything else, it decrements `num` by 1. Finally, it prints the value of `num`.
<|EOT|>
