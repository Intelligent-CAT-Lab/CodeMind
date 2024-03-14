<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class p03795{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(isr);

		int n;
		n = Integer.parseInt(reader.readLine());

		System.out.println((n * 800) - ((n / 15) * 200));

		reader.close();
	}
}
```

python code:<fim_suffix><fim_middle>
```python
import sys

n = int(sys.stdin.readline())

print((n * 800) - ((n / 15) * 200))
```
"""
<|endoftext|>
