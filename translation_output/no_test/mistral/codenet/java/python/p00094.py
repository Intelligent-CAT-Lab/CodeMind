<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```
[/INST]
```python
import sys

def main():
    while True:
        try:
            num1 = float(input())
            num2 = float(input())
            print((num1*num2)/3.305785)
        except:
            break

if __name__ == '__main__':
    main()
```</s>
