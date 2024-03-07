<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}

Translate the above java code to python.

python code:

[/INST]
```
import sys

while True:
    try:
        line = sys.stdin.readline()
        if not line:
            break
        values = line.split()
        area = float(values[0]) * float(values[1])
        print(area / 3.305785)
    except ValueError:
        break
```
This code uses the `sys` module to read input from stdin, and the `readline()` method to read a line at a time. The `split()` method is used to split the line into a list of strings, and the `float()` function is used to convert the strings to floating-point numbers. The area is calculated by multiplying the two numbers and dividing by 3.305785. Finally, the result is printed to stdout using the `print()` function.

Note that this code assumes that the input is in the format of two numbers separated by a space, and that the input is terminated by a blank line. If the input format is different, the code will need to be modified accordingly.</s>
