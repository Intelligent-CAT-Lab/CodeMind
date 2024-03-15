<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```
[/INST]
```python
import sys

def main():
    print("ABC" if int(input()) < 1200 else "ARC")

if __name__ == "__main__":
    main()
```</s>
