<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
12.566371 12.566371


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
```
import math

def main():
    r = float(input())
    pi = math.pi
    x = r * r * pi
    y = 2 * r * pi
    print(f"{x:.6f} {y:.6f}")

if __name__ == "__main__":
    main()
```
This code uses the `math` module to calculate the value of pi, and then uses the `input()` function to read the value of `r` from the user. It then calculates the values of `x` and `y` using the formulae provided in the problem statement, and prints them out to the console with six decimal places of precision.</s>
