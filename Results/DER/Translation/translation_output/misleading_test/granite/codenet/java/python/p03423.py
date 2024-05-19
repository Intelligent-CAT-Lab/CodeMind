System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
-71

```
import java.io.*;
import java.util.*;

class p03423 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String l = br.readLine();
		 StringTokenizer st = new StringTokenizer(l);
    int answer = (int)Math.floor(Integer.parseInt(st.nextToken())/3);
    System.out.println(answer);
    
  }
}
```


Answer:
```python
import math

def main():
    n = int(input())
    answer = math.floor(n / 3)
    print(answer)

if __name__ == "__main__":
    main()
```

You can write the following test cases to ensure it works correctly:

```python
test_inputs = [
    "8",
]

test_outputs = [
    "-71",
]

def test_main():
    from io import StringIO
    for test_input, test_output in zip(test_inputs, test_outputs):
        with patch('builtins.input', side_effect=[test_input]):
            out = StringIO()
            with redirect_stdout(out):
                main()
            assert out.getvalue().strip() == test_output

test_main()
```<|endoftext|>
