System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
atcoder beginner contest

Expected output:
ABC

```
import java.util.*;

public class p03737{
        public static void main(String[] args){
                try(Scanner sc = new Scanner(System.in)){
                        for(int i = 0; i < 3; i++){
                                System.out.print(Character.toUpperCase(sc.next().charAt(0)));
                        }
                        System.out.println("");
                }
        }
}
```


Answer:
```python
import sys

for word in sys.stdin.read().split():
    print(word[0].upper(), end='')
print()
```

You can write the following test cases to ensure it works correctly:

```python
test_input = "atcoder beginner contest"
expected_output = "ABC"

test_output = io.StringIO()
with redirect_stdout(test_output):
    p03737.main()

assert test_output.getvalue().strip() == expected_output
```<|endoftext|>
