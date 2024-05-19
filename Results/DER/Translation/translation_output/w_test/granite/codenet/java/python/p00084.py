System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
Rain, rain, go to Spain.

Expected output:
Rain rain Spain


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
import re

def main():
    while True:
        try:
            line = input()
        except:
            break
        line = line.replace('.', ',')
        line = line.replace(',','')
        words = re.findall(r'\w+', line)
        count = 0
        for word in words:
            if 3 <= len(word) <= 6:
                if count > 0:
                    print(' ', end='')
                print(word[:len(word)], end='')
                count += 1
        if count > 0:
            print()

if __name__ == '__main__':
    main()
```


Test input:
Rain, rain, go to Spain.

Expected output:
Rain rain Spain
<|endoftext|>
