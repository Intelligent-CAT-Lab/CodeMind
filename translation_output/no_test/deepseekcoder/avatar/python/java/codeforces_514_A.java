<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
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
Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.next();
        StringBuilder st = new StringBuilder();

        if(ip.length() != 1) {
            if(ip.charAt(0) == '9') {
                st.append('9');
                ip = ip.substring(1);
            }
            for(int i = 0; i < ip.length(); i++) {
                char c = ip.charAt(i);
                if(c - '0' > 4) {
                    int n = 9 - (c - '0');
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

This Java code does the same thing as your Python code. It reads a string from the user, checks if the string has more than one character, and if the first character is '9', it removes it and appends the rest of the string to `st`. Then it iterates over the remaining characters in the string. If the character is greater than '4', it calculates the difference between 9 and the character's numeric value and appends this to `st`. If the character is not greater than '4', it appends the character to `st` as is. Finally, it prints the integer value of `st`.
<|EOT|>
