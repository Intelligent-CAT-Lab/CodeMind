<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
CODEFESTIVAL

Expected output:
CODE

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
[/INST]
```python
import sys

def main():
    X = sys.stdin.readline().strip()
    sb = ""
    for i in range(len(X)):
        if i == 4:
            sb += " " + X[i]
        else:
            sb += X[i]
    print(sb)

if __name__ == "__main__":
    main()
```
Note: The `sys` module is used to read input from stdin and write output to stdout. The `strip()` method is used to remove any trailing newline characters from the input string. The `range()` function is used to iterate over the characters in the input string. The `+=` operator is used to concatenate strings.</s>
