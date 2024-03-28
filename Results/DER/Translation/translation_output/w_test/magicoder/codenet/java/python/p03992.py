<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    X = sys.stdin.readline().strip()
    sb = []
    for i in range(len(X)):
        if i == 4:
            sb.append(" ")
        sb.append(X[i])
    print(''.join(sb))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, and then iterates over the characters in the string. If the index is 4, it appends a space and the character to the string builder. Otherwise, it just appends the character. Finally, it prints the string builder as a string.<｜end▁of▁sentence｜>
