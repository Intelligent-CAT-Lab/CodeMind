<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p03463 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		
		int k = b - a;
		if(k % 2 == 1) System.out.println("Borys");
		else System.out.println("Alice");
	}
}
```
[/INST]
```python
import sys

n = int(input())
a = int(input())
b = int(input())

k = b - a
if k % 2 == 1:
    print("Borys")
else:
    print("Alice")
```</s>
