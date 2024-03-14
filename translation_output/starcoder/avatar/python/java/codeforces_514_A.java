<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
ip = input ( )
st = " "
if len ( ip )!= 1 :
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        String st = " ";
        if (ip.length()!= 1) {
            if (ip.charAt(0) == '9') {
                st = "9";
                ip = ip.substring(1);
            }
            for (int i = 0; i < ip.length(); i++) {
                if (Integer.parseInt(ip.charAt(i)) > 4) {
                    int n = 9 - Integer.parseInt(ip.charAt(i));
                    st += String.valueOf(n);
                } else {
                    st += ip.charAt(i);
                }
            }
        } else {
            st = ip;
        }
        System.out.println(Integer.parseInt(st));
    }
}
```
<|endoftext|>
