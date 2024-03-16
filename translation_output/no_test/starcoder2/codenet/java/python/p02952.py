
```
a=int(input())
c=0
for i in range(1,a+1):
    if len(str(i))%2 != 0:
        c+=1
print(c)
```

## 2953

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02953
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,d=0;
        for(int i=1;i<=5;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            c=a+b;
            if(c>d)
            {
                d=c;
            }
        }
        System.out.println(d);
    }
}
```

python code:
```
d=0
for i in range(5):
    a,b=map(int,input().split())
    c=a+b
    if c>d:
        d=c
print(d)
```

## 2954

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02954
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
            {
                i+=2;
            }
            System.out.print(a.charAt(i));
        }
    }
}
```

python code:
```
a=input()
for i in range(len(a)):
    if a[i] in 'aeiou':
        i+=2
    print(a[i],end='')
```

## 2960

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02960
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,d=0;
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=2;i<=a;i++)
        {
            if(a%i==0)
            {
                c++;
                if(c==b)
                {
                    d=i;
                    break;
                }
            }
        }
        System.out.println(d);
    }
}
```

python code:
```
a,b=map(int,input().split())
c=0
for i in range(2,a+1):
    if a%i==0:
        c+=1
        if c==b:
            d=i
            break
print(d)
```

## 2965

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02965
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=Math.max(Math.abs(a-b),Math.abs(b-c));
        d=Math.max(d,Math.abs(c-a));
        d=d-1;
        System.out.println(d);
    }
}
```

python code:
```
a,b,c=map(int,input().split())
d=max(abs(a-b),abs(b-c),abs(c-a))
d=d-1
print(d)
```

## 2966

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02966
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b=0,c=0,d=0,e=0;
        String s=sc.nextLine();
        a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            if(s.charAt(i)=='A')
            {
                if(i%3==0)
                {
                    b++;
                }
            }
            if(s.charAt(i)=='B')
            {
                if(i%3==1)
                {
                    b++;
                }
            }
            if(s.charAt(i)=='C')
            {
                if(i%3==2)
                {
                    b++;
                }
            }
            if(s.charAt(i)=='B')
            {
                if(i%4==0)
                {
                    c++;
                }
            }
            if(s.charAt(i)=='A')
            {
                if(i%4==1)
                {
                    c++;
                }
            }
            if(s.charAt(i)=='C')
            {
                if(i%4==2)
                {
                    c++;
                }
            }
            if(s.charAt(i)=='C')
            {
                if(i%6==0)
                {
                    d++;
                }
            }
            if(s.charAt(i)=='A')
            {
                if(i%6==1)
                {
                    d++;
                }
            }
            if(s.charAt(i)=='B')
            {
                if(i%6==2)
                {
                    d++;
                }
            }
            if(s.charAt(i)=='A')
            {
                if(i%6==3)
                {
                    d++;
                }
            }
            if(s.charAt(i)=='B')
            {
                if(i%6==4)
                {
                    d++;
                }
            }
            if(s.charAt(i)=='C')
            {
                if(i%6==5)
                {
                    d++;
                }
            }
            if(s.charAt(i)=='B')
            {
                if(i%8==0)
                {
                    e++;
                }
            }
            if(s.charAt(i)=='C')
            {
                if(i%8==1)
                {
                    e++;
                }
            }
            if(s.charAt(i)=='A')
            {
                if(i%8==2)
                {
                    e++;
                }
            }
            if(s.charAt(i)=='B')
            {
                if(i%8==3)
                {
                    e++;
                }
            }
            if(s.charAt(i)=='A')
            {
                if(i%8==4)
                {
                    e++;
                }
            }
            if(s.charAt(i)=='C')
            {
                if(i%8==5)
                {
                    e++;
                }
            }
            if(s.charAt(i)=='C')
            {
                if(i%8==6)
                {
                    e++;
                }
            }
            if(s.charAt(i)=='A')
            {
                if(i%8==7)
                {
                    e++;
                }
