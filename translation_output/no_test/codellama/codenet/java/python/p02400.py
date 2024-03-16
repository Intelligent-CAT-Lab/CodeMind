<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
```
import math

r = float(input())
pi = math.pi
x = r**2 * pi
y = 2 * r * pi
print(f"{x:.6f} {y:.6f}")
```
Note: The `input()` function is used to read a line of text from the user, and the `float()` function is used to convert the input to a floating-point number. The `math.pi` constant is used to represent the value of pi. The `**` operator is used to raise `r` to the power of 2, and the `*` operator is used to multiply `r` by `pi`. The `f"{x:.6f} {y:.6f}"` string is used to format the output with 6 decimal places.</s>
