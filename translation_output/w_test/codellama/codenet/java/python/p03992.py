<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    input_string = sys.stdin.readline().strip()
    output_string = ""
    for i, char in enumerate(input_string):
        if i == 4:
            output_string += " " + char
        else:
            output_string += char
    print(output_string)

if __name__ == "__main__":
    main()
```
This code reads a string from standard input, and then iterates over each character in the string. If the character is the 5th character (index 4), it adds a space before the character and appends it to the output string. Otherwise, it appends the character to the output string without any modification. Finally, it prints the output string to standard output.

Note that this code assumes that the input string is at least 5 characters long. If the input string is shorter than 5 characters, the code will not work correctly.</s>
