<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')


```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String moto=sc.next();
        String s=moto;
        String gene="ABC";
        boolean f=true;
        List<String> log=new ArrayList<String>();
        while(s.length()>3&&f){
            f=false;
            if(s.substring(0,3).equals("ABC")){
                s=s.replace("ABC","A");
                log.add("A");
                f=true;
            }
            else if(s.substring(s.length()-3).equals("ABC")){
                s=s.replace("ABC","C");
                log.add("C");
                f=true;
            }
            else if(s.contains("ABC")){
                s=s.replace("ABC","B");
                log.add("B");
                f=true;
            }
        }
        if(!s.equals(gene)){
            System.out.println("No");
            return;
        }
        int l=log.size();
        for(int i=0;i<l;i++){
            s=s.replace(log.get(l-1-i),"ABC");
        }
        if(s.equals(moto)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
```
<|endoftext|>
