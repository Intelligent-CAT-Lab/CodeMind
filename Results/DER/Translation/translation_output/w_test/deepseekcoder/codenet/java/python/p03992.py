<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE FESTIVAL


```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class p03992 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        String X = br.readLine();
        for(int i=0;i<X.length();i++){
            if(i==4){
                sb.append(" ").append(X.charAt(i));
            }
            else{
                sb.append(X.charAt(i));
            }
        }
        
        pr.println(sb.toString());
        pr.close();
        
    }
    
}

```

### Response:
```python
import sys

def insert_space(X):
    return X[:4] + " " + X[4:]

X = sys.stdin.readline().strip()
print(insert_space(X))
```

In this Python code, we define a function `insert_space` that takes a string `X` as input and returns a new string where a space is inserted at the 4th index of `X`. We then read a line from the standard input, strip any trailing newline characters, and print the result of calling `insert_space` on this string.
<|EOT|>
