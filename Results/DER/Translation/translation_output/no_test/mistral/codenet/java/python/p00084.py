<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    while True:
        input_str = input()
        input_str = input_str.replace('.', ',')
        input_str = input_str.replace(',', ' ')
        tokens = input_str.split()
        count = 0
        for token in tokens:
            n = len(token)
            if n >= 3 and n <= 6:
                if count > 0:
                    print(' ', end='')
                print(token[:n])
                count += 1
        if count > 0:
            print()

if __name__ == '__main__':
    main()
```</s>
