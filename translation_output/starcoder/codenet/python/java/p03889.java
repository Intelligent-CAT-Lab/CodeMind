<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = list(input())
t = s[::-1]
for i in range(len(t)):
  if t[i] == "p":
    t[i] = "q"
  elif t[i] == "q":
    t[i] = "p"
  if t[i] == "b":
    t[i] = "d"
  elif t[i] == "d":
    t[i] = "b" 
if s == t:
  ans = "Yes"
else:
  ans = "No"
print(ans)
    
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = "";
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='p'){
                t+='q';
            }
            else if(s.charAt(i)=='q'){
                t+='p';
            }
            else if(s.charAt(i)=='b'){
                t+='d';
            }
            else if(s.charAt(i)=='d'){
                t+='b';
            }
        }
        if(s.equals(t)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
