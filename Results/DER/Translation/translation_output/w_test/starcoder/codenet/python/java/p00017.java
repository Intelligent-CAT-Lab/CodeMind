<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
xlmw mw xli tmgxyvi xlex m xsso mr xli xvmt.

Expected output:
this is the picture that i took in the trip.


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
        String s=sc.nextLine();
        while(true){
            if(s.contains("the")||s.contains("that")||s.contains("this"))
                System.out.println(s);
            else{
                String t="";
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)==' '){
                        t+=' ';
                    }
                    else{
                        t+=((char)(s.charAt(i)-1));
                    }
                }
                s=t.replace("z","a");
            }
        }
    }
}
```
'''
<|endoftext|>
