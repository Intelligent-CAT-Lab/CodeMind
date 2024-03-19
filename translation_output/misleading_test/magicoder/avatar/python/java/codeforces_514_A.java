<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
Here is the Java version of the given Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine();
        StringBuilder st = new StringBuilder();

        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st.append('9');
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                char c = ip.charAt(i);
                if (c > '4') {
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

This Java code does the same thing as the Python code. It reads a string from the user, checks if the string is not of length 1, and then checks if the first character is '9'. If it is, it appends '9' to the string builder and removes the first character from the string. Then it iterates over the remaining characters in the string, checks if they are greater than '4', and if they are, it calculates the difference between '9' and the character and appends the result to the string builder. If the character is not greater than '4', it appends the character to the string builder. Finally, it prints the integer value of the string builder.<｜end▁of▁sentence｜>
