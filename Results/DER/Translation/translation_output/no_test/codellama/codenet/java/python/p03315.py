<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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



Translate the above java code to python.

python code:

[/INST]
```
import sys

def main():
    sc = sys.stdin.readline().strip()
    ary = list(sc)
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == '__main__':
    main()
```
Note: The `sys` module is used to read input from the standard input stream, and the `strip()` method is used to remove any trailing newline characters from the input string. The `list()` function is used to convert the input string into a list of characters, and the `for` loop is used to iterate over the list and update the `num` variable accordingly. Finally, the `print()` function is used to output the final value of `num`.</s>
