<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
uncopyrightable

Expected output:
yes

```
s=input()
count=0
for member in s:
    count=0
    for member2 in s:
        if member2==member:
            count+=1
    if count>=2:
        print("no")
        break
if count==1:
    print("yes")

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            count=0;
            for(int j=0;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            if(count>=2){
                System.out.println("no");
                break;
            }
        }
        if(count==1){
            System.out.println("yes");
        }
    }
}
```
'''
<|endoftext|>
