<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03323 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a <= 8 && b <= 8) {
			System.out.println("Yay!");
		} else {
			System.out.println(":(");
		}
	}
}

```
[/INST]
```python
import java.util

def main():
    sc = java.util.Scanner(System.in)
    a = sc.nextInt()
    b = sc.nextInt()
    if a <= 8 and b <= 8:
        print("Yay!")
    else:
        print(":(")

if __name__ == "__main__":
    main()
```</s>
