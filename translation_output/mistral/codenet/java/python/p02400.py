<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
[/INST]
```python
import sys

def main():
    br = sys.stdin
    r = float(br.readline())
    pi = 3.14159265358979323846
    x = r**2 * pi
    y = 2 * r * pi
    print("{:.6f} {:.6f}".format(x, y))

if __name__ == "__main__":
    main()
```</s>
