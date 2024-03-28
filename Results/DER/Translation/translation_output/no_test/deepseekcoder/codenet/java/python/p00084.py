<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00084 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				String str = sc.nextLine();
				str = str.replace('.', ',');
				str = str.replace(',', ' ');
				String[] tokens = str.split(" ");
				int count = 0;
				
				for(int i=0; i<tokens.length; i++) {
					int n = tokens[i].length();
					
					if(n>=3 && n<=6) {
						if(count > 0) System.out.print(" ");
						System.out.print(tokens[i].substring(0,n));
						count++;
					}
				}
				if(count > 0) System.out.println();
			}
		}
	}
}

```

### Response:
```python
while True:
    try:
        str = input()
        str = str.replace('.', ',')
        str = str.replace(',', ' ')
        tokens = str.split(" ")
        count = 0

        for i in range(len(tokens)):
            n = len(tokens[i])

            if 3 <= n <= 6:
                if count > 0: print(" ", end="")
                print(tokens[i][:n], end="")
                count += 1
        if count > 0: print()
    except EOFError:
        break
```

This Python code does the same thing as the Java code. It reads lines from the standard input, replaces all periods with commas and spaces with commas, splits the line into words, and then prints out words that have a length between 3 and 6. If no such words are found, it prints a newline. The loop continues until it encounters an end-of-file (EOF) error, at which point it breaks out of the loop.
<|EOT|>
