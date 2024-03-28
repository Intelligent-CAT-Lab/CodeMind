<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.Scanner;

public class p02054 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int odd = 0;
		for (int i = 0; i < 3; i++) {
			odd += sc.nextInt() % 2;
		}
		System.out.println(odd >= 2 ? "Hom" : "Tem");
	}
}



Translate the above java code to python.

python code:

[/INST]
```
import sys

def main():
    odd = 0
    for i in range(3):
        odd += int(sys.stdin.readline()) % 2
    print("Hom" if odd >= 2 else "Tem")

if __name__ == "__main__":
    main()
```
Note: The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `int()` function is used to convert the input to an integer. The `range(3)` function is used to iterate over the numbers 0, 1, and 2.</s>
