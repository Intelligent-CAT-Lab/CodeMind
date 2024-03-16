<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S = input()
if len(S) < 5:
  print('NO')
  exit()
else:
  i = 0
  while True:
    if (i+5 == len(S) and S[i:i+5]=='dream') or (i+5 == len(S) and S[i:i+5]=='erase') or (i+6 == len(S) and S[i:i+6]=='eraser') or (i+7 == len(S) and S[i:i+7]=='dreamer'):
      print('YES')
      exit()
    elif S[i:i+5]=='dream' and i+8 <= len(S):
      if S[i+5:i+8]=='erd' or S[i+5:i+8]=='ere': i+=7
      elif S[i+5:i+8]=='era' or S[i+5:i+6]=='d': i+=5
      else:
        print('NO')
        exit()
    elif S[i:i+5]=='erase'  and i+7 <= len(S):
      if S[i+5:i+6]=='e' or S[i+5:i+6]=='d': i+=5
      elif S[i+5:i+6]=='r': i+=6
      else:
        print('NO')
        exit()
    else:
        print('NO')
        exit()
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.length()<5) {
            System.out.println("NO");
            return;
        }
        int i=0;
        while(true) {
            if(i+5==s.length() && s.substring(i,i+5).equals("dream")) {
                System.out.println("YES");
                return;
            }
            else if(i+5==s.length() && s.substring(i,i+5).equals("erase")) {
                System.out.println("YES");
                return;
            }
            else if(i+6==s.length() && s.substring(i,i+6).equals("eraser")) {
                System.out.println("YES");
                return;
            }
            else if(i+7==s.length() && s.substring(i,i+7).equals("dreamer")) {
                System.out.println("YES");
                return;
            }
            else if(s.substring(i,i+5).equals("dream") && i+8<=s.length()) {
                if(s.substring(i+5,i+8).equals("erd") || s.substring(i+5,i+8).equals("ere")) {
                    i+=7;
                }
                else if(s.substring(i+5,i+8).equals("era") || s.substring(i+5,i+6).equals("d")) {
                    i+=5;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else if(s.substring(i,i+5).equals("erase") && i+7<=s.length()) {
                if(s.substring(i+5,i+6).equals("e") || s.substring(i+5,i+6).equals("d")) {
                    i+=5;
                }
                else if(s.substring(i+5,i+6).equals("r")) {
                    i+=6;
                }
                else {
                    System.out.println("NO");
                    return;
                }
            }
            else {
                System.out.println("NO");
                return;
            }
        }
    }
}
```
<|endoftext|>
