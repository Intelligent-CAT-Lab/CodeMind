<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p03631 {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// å¥å
    	int a = sc.nextInt();

    	int a100 = a/100;
    	int a10 = a/10 - a100*10;
    	int a1 = a - a100*100 - a10*10;
    	int rev = a1*100 + a10*10 + a100;
    	String ans;

    	if (a == rev){
    		ans = "Yes";
    	} else {
    		ans = "No";
    	}

    	// åºå
    	System.out.println(ans);
    }
}
```
[/INST]
```python
import sys

def main():
    a = int(input())

    a100 = a // 100
    a10 = a // 10 - a100 * 10
    a1 = a - a100 * 100 - a10 * 10
    rev = a1 * 100 + a10 * 10 + a100
    ans = "Yes" if a == rev else "No"

    print(ans)

if __name__ == "__main__":
    main()
```</s>
