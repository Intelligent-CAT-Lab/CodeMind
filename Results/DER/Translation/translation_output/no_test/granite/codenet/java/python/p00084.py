System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00084 {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			while(sc.hasNext()) {
				String str = sc.nextLine();
				str = str.replace('.', ',');
				str = str.replace(',','');
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


Answer:
```python
import sys

for line in sys.stdin:
    line = line.replace('.', ',')
    line = line.replace(',','')
    words = line.split(" ")
    count = 0

    for word in words:
        length = len(word)

        if length >= 3 and length <= 6:
            if count > 0:
                print(" ", end="")
            print(word[:length], end="")
            count += 1

    if count > 0:
        print()
```<|endoftext|>
