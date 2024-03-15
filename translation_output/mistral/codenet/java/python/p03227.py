<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03227 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] b = a.split("");
		
		int c=a.length();
		
		if(c==3){
			String str=b[0];
			b[0]=b[2];
			b[2]=str;
		}
		
		for(int i=0;i<c;i++){		
			System.out.print(b[i]);
		} 
	}

}

```
[/INST]
```python
import sys

def main():
    a = input()
    b = a.split()
    c = len(a)
    if c == 3:
        str = b[0]
        b[0], b[2] = b[2], b[0]
        b[2], str = str, b[2]
    for i in range(c):
        print(b[i], end='')

if __name__ == '__main__':
    main()
```</s>
