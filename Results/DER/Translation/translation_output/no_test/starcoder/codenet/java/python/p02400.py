<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class p02400{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double r = Double.parseDouble(br.readLine());
		double pi = Math.PI;
		double x = r*r*pi;
		double y = 2*r*pi;
		System.out.printf("%.6f %.6f",x,y);
	}
}
```

python code:<fim_suffix><fim_middle>
```python
import math

r = float(input())
pi = math.pi
x = r*r*pi
y = 2*r*pi
print(f"{x:.6f} {y:.6f}")
```
"""
<|endoftext|>
