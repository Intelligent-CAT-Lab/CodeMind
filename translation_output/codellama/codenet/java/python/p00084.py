<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import re

def main():
    with open("input.txt") as f:
        for line in f:
            line = line.strip()
            tokens = re.split(r"\s+", line)
            for token in tokens:
                if len(token) >= 3 and len(token) <= 6:
                    print(token, end=" ")
            print()

if __name__ == "__main__":
    main()
```
This code reads the input from a file named "input.txt" and processes each line separately. It uses the `re` module to split the line into tokens using the regular expression `\s+`, which matches one or more whitespace characters. It then iterates over the tokens and prints each one that has a length between 3 and 6 characters, separated by a space. Finally, it prints a newline character to move to the next line.

Note that this code assumes that the input file contains only one line of text per line, and that each line contains only one sentence. If your input file contains multiple sentences per line, or if you want to process multiple lines at once, you will need to modify the code accordingly.</s>
