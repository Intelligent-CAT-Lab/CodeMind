<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

for line in sys.stdin:
    line = line.replace('.', ',')
    line = line.replace(',', '')
    tokens = line.split(' ')
    count = 0
    for token in tokens:
        if len(token) >= 3 and len(token) <= 6:
            if count > 0:
                print(' ', end='')
            print(token, end='')
            count += 1
    if count > 0:
        print()
```
<|endoftext|>
