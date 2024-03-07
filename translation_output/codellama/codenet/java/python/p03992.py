<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

X = sys.stdin.readline().strip()

for i, c in enumerate(X):
    if i == 4:
        print(c, end=" ")
    else:
        print(c, end="")
```
This code reads a line of input from the user and then iterates over each character in the line. If the character is at position 4 (i.e. the 5th character), it prints a space followed by the character. Otherwise, it prints the character without a space. The `end=""` parameter in the `print()` function is used to specify that the output should be printed on the same line as the previous output.</s>
