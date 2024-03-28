
```
c=input()
print('x' if c[0]=='x' and c[-1]=='x' else 'o')
```

## p01522
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01522
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int max=a[0];
        for(int i=1;i<n;i++)
            if(a[i]>max)
                max=a[i];
        System.out.println(max);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(max(a))
```

## p01523
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01523
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int min=a[0];
        for(int i=1;i<n;i++)
            if(a[i]<min)
                min=a[i];
        System.out.println(min);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(min(a))
```

## p01524
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01524
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        System.out.println(sum);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(sum(a))
```

## p01525
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01525
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            if(a[i]%2==0)
                sum+=a[i];
        System.out.println(sum);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(sum(filter(lambda x:x%2==0,a)))
```

## p01526
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01526
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            if(a[i]%2==1)
                sum+=a[i];
        System.out.println(sum);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(sum(filter(lambda x:x%2==1,a)))
```

## p01527
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01527
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            if(a[i]%2==0)
                sum+=a[i];
            else
                sum-=a[i];
        System.out.println(sum);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(sum(map(lambda x:x if x%2==0 else -x,a)))
```

## p01528
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01528
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            if(a[i]%2==1)
                sum+=a[i];
            else
                sum-=a[i];
        System.out.println(sum);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(sum(map(lambda x:-x if x%2==0 else x,a)))
```

## p01529
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01529
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
            if(a[i]%2==0)
                sum+=a[i];
            else
                sum-=a[i];
        System.out.println(sum);
    }
}
```

python code:
```
n=int(input())
a=list(map(int,input().split()))
print(sum(map(lambda x:x if x%2==0 else -x,a)))
```

## p01530
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p01530
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a
