<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2015 3 13 2015 3 13

Expected output:
-11

```
import datetime
y1,m1,d1,y2,m2,d2=map(int,input().split())
qq,y1=divmod(y1,400)
y1+=400
qq-=1
q=(y2-y1)//400
y2-=400*q
a=688*(q-qq)
d=datetime.date(y1,m1,d1)
while d<=datetime.date(y2,m2,d2):
    if d.day==13 and d.weekday()==4:a+=1
    d+=datetime.timedelta(days=1)
print(a)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int y1=sc.nextInt();
        int m1=sc.nextInt();
        int d1=sc.nextInt();
        int y2=sc.nextInt();
        int m2=sc.nextInt();
        int d2=sc.nextInt();
        int a=0;
        for(int i=y1;i<=y2;i++){
            if(i%400==0)a+=1;
            else if(i%100==0)a-=1;
            else if(i%4==0)a+=1;
        }
        a*=688;
        Calendar c=Calendar.getInstance();
        c.set(y1,m1,d1);
        while(c.before(y2,m2,d2)){
            if(c.get(Calendar.DAY_OF_MONTH)==13&&c.get(Calendar.DAY_OF_WEEK)==Calendar.FRIDAY)a++;
            c.add(Calendar.DAY_OF_MONTH,1);
        }
        System.out.println(a);
    }
}
```
<|endoftext|>
