System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 25

Expected output:
66.94277711156654

```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```


Answer:
```python
import sys

for line in sys.stdin:
    a, b = map(float, line.split())
    print((a * b) / 3.305785)
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "15 25\n"
expected_output = "66.94277711156654\n"

output = io.StringIO()
with redirect_stdout(output):
    p00094.main()

assert output.getvalue() == expected_output
```<|endoftext|>
