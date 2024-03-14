<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(s.length()-1)=='s'){
            System.out.println(s+"es");
        }else{
            System.out.println(s+"s");
        }
    }
}
```
<|endoftext|>
