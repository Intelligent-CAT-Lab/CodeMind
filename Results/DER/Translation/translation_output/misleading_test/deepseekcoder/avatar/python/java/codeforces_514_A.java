<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5728

Expected output:
4182

```
ip = input ( )
st = " "
if len ( ip ) != 1 :
    if ip [ 0 ] == "9" :
        st = "9"
        ip = ip [ 1 : ]
    for i in ip :
        if int ( i ) > 4 :
            n = 9 - int ( i )
            st += str ( n )
        else :
            st += i
else :
    st = ip
print ( int ( st ) )


```

### Response:
Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        StringBuilder st = new StringBuilder();
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st.append('9');
                ip = ip.substring(1);
            }
            for (char c : ip.toCharArray()) {
                if (Character.getNumericValue(c) > 4) {
                    int n = 9 - Character.getNumericValue(c);
                    st.append(n);
                } else {
                    st.append(c);
                }
            }
        } else {
            st.append(ip);
        }
        System.out.println(Integer.parseInt(st.toString()));
    }
}
```

This Java code does the same thing as the Python code. It reads an input string, checks if its length is not 1, and if the first character is '9', it appends '9' to the result string and removes the first character from the input string. Then it iterates over the remaining characters of the input string. If a character is greater than '4', it calculates the difference between 9 and the numeric value of the character, appends this difference to the result string. Otherwise, it appends the character to the result string. Finally, it prints the result string as an integer.
<|EOT|>
