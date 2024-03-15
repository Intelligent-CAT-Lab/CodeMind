<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String ip = sc.nextLine();
        String st = " ";
        if (ip.length() != 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                int num = Integer.parseInt(ip.charAt(i) + "");
                if (num > 4) {
                    int n = 9 - num;
                    st += Integer.toString(n);
                } else {
                    st += Integer.toString(num);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```</s>
