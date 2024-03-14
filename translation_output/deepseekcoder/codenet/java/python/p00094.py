<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```

### Response:
```python
import sys

def main():
    for line in sys.stdin:
        feet, inches = map(float, line.split())
        print((feet * 12 + inches) * 25.4 / 3.305785)

if __name__ == "__main__":
    main()
```
This Python code reads from standard input, splits each line into feet and inches, converts them to inches, multiplies by 25.4 to convert to millimeters, and then divides by 3.305785 to convert to grams. The result is printed to standard output.
<|EOT|>
