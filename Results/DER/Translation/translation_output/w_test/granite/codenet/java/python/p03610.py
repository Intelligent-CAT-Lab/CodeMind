System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder

Expected output:
acdr


```
import java.util.*;

class p03610{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] array = s.split("");

        for(int i = 0; i < s.length(); i += 2){
            System.out.print(array[i]);
        }
        
    }
}
```


Answer:
```python
s = input()
array = list(s)

for i in range(0, len(s), 2):
    print(array[i], end='')
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "atcoder"
expected_output = "acdr"
output = ""

for i in range(0, len(test_input), 2):
    output += test_input[i]

assert output == expected_output
```<|endoftext|>
