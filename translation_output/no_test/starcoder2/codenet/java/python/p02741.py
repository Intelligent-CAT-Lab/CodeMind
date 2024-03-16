
```
a = [1, 1, 1, 2, 1, 2, 1, 5, 2, 2, 1, 5, 1, 2, 1, 14, 1, 5, 1, 5, 2, 2, 1, 15, 2, 2, 5, 4, 1, 4, 1, 51]
k = int(input())
print(a[k-1])
```
/p02742.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02742 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     int k=input.nextInt();
     for(int i=k;i>0;i--)
     {
         System.out.println(i);
     }
 }
}

```

python code:
```
k = int(input())
for i in range(k, 0, -1):
    print(i)
```
/p02743.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02743 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     String s=input.nextLine();
     System.out.println(s.length());
 }
}

```

python code:
```
s = input()
print(len(s))
```
/p02744.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02744 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     String s=input.nextLine();
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)>=65&&s.charAt(i)<=90)
         {
             System.out.print((char)(s.charAt(i)+32));
         }
         else if(s.charAt(i)>=97&&s.charAt(i)<=122)
         {
             System.out.print((char)(s.charAt(i)-32));
         }
         else
         {
             System.out.print(s.charAt(i));
         }
     }
 }
}

```

python code:
```
s = input()
for i in range(len(s)):
    if s[i].isupper():
        print(s[i].lower(), end='')
    elif s[i].islower():
        print(s[i].upper(), end='')
    else:
        print(s[i], end='')
```


python code:
```
a = int(input())
b = int(input())
print(a+b)
```
/p02739.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02739 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     int a=input.nextInt();
     int b=input.nextInt();
     System.out.println(a+b);
 }
}

```/p02745.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02745 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     String s=input.nextLine();
     int a=input.nextInt();
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)>=65&&s.charAt(i)<=90)
         {
             System.out.print((char)(s.charAt(i)+a));
         }
         else if(s.charAt(i)>=97&&s.charAt(i)<=122)
         {
             System.out.print((char)(s.charAt(i)+a));
         }
         else
         {
             System.out.print(s.charAt(i));
         }
     }
 }
}

```

python code:
```
s = input()
a = int(input())
for i in range(len(s)):
    if s[i].isupper():
        print(chr(ord(s[i])+a), end='')
    elif s[i].islower():
        print(chr(ord(s[i])+a), end='')
    else:
        print(s[i], end='')
```
/p02746.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02746 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     String s=input.nextLine();
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)>=65&&s.charAt(i)<=90)
         {
             System.out.print((char)(s.charAt(i)+13));
         }
         else if(s.charAt(i)>=97&&s.charAt(i)<=122)
         {
             System.out.print((char)(s.charAt(i)+13));
         }
         else
         {
             System.out.print(s.charAt(i));
         }
     }
 }
}

```

python code:
```
s = input()
for i in range(len(s)):
    if s[i].isupper():
        print(chr(ord(s[i])+13), end='')
    elif s[i].islower():
        print(chr(ord(s[i])+13), end='')
    else:
        print(s[i], end='')
```
/p02747.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02747 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     String s=input.nextLine();
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)>=65&&s.charAt(i)<=90)
         {
             System.out.print((char)(s.charAt(i)+13));
         }
         else if(s.charAt(i)>=97&&s.charAt(i)<=122)
         {
             System.out.print((char)(s.charAt(i)+13));
         }
         else
         {
             System.out.print(s.charAt(i));
         }
     }
 }
}

```

python code:
```
s = input()
for i in range(len(s)):
    if s[i].isupper():
        print(chr(ord(s[i])+13), end='')
    elif s[i].islower():
        print(chr(ord(s[i])+13), end='')
    else:
        print(s[i], end='')
```
/p02748.md
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02748 {
 public static void main(String args[])
 {
     Scanner input=new Scanner(System.in);
     String s=input.nextLine();
     for(int i=0;i<s.length();i++)
     {
         if(s.charAt(i)>=65&&s.charAt(i)<=90)
         {
             System.
