<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
def decode(s):
    result=""
    for c in s:
        if not (c==" " or c=="."):
            result+=chr(ord(c)+1)
        else:
            result+=c
    return result.replace(chr(ord("z")+1),"a")
for line in sys.stdin.readlines():
    s=line.strip()
    for i in range(ord("z")-ord("a")+1):
        if "the" in s or "that" in s or "this" in s:
            print(s)
            break
        s=decode(s)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()) {
            String s=sc.nextLine();
            for(int i=0;i<26;i++) {
                if(s.contains("the") || s.contains("that") || s.contains("this")) {
                    System.out.println(s);
                    break;
                }
                s=decode(s);
            }
        }
    }
    public static String decode(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c!='.' && c!=' ') {
                sb.append((char)(c-1));
            } else {
                sb.append(c);
            }
        }
        return sb.toString().replace("z","a");
    }
}
```
<|endoftext|>
