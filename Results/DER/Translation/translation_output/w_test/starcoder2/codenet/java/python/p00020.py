

```python
s = input()
t = ""
for i in range(len(s)):
    c = s[i]
    if c >= 'a' and c <= 'z':
        c = chr(ord(c) - 32)
    t += c
print(t)
```
/p00001.md
# Problem 1

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567890

Expected output:
0987654321


```
import java.io.*;

public class p00001 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        while((s=bf.readLine())!=null){
            t="";for(int i=s.length()-1;i>=0;i--)t+=s.charAt(i);
            System.out.println(t);
        }
    }
}
```

python code:

```python
s = input()
t = ""
for i in range(len(s) - 1, -1, -1):
    t += s[i]
print(t)
```


```python
s = input()
t = ""
for i in range(len(s)):
    c = s[i]
    if c >= 'A' and c <= 'Z':
        c = chr(ord(c) + 32)
    t += c
print(t)
```
/p00021.md
# Problem 21

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
THIS IS A PEN.

Expected output:
this is a pen.


```
import java.io.*;

public class p00021 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        char c;
        while((s=bf.readLine())!=null){
            t="";for(int i=0,j=s.length();i<j;i++){c=s.charAt(i);t+=(char)((c>=65&&c<=91)?(c+32):(c));}
            System.out.println(t);
        }
    }
}
```

python code:/p00002.md
# Problem 2

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567890

Expected output:
0123456789


```
import java.io.*;

public class p00002 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        while((s=bf.readLine())!=null){
            t="";for(int i=0,j=s.length();i<j;i++)t+=s.charAt(i);
            System.out.println(t);
        }
    }
}
```

python code:

```python
s = input()
t = ""
for i in range(len(s)):
    t += s[i]
print(t)
```

# Problem 3

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567890

Expected output:
02468


```
import java.io.*;

public class p00003 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        while((s=bf.readLine())!=null){
            t="";for(int i=0,j=s.length();i<j;i+=2)t+=s.charAt(i);
            System.out.println(t);
        }
    }
}
```

python code:

```python
s = input()
t = ""
for i in range(0, len(s), 2):
    t += s[i]
print(t)
```

# Problem 4

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567890

Expected output:
13579


```
import java.io.*;

public class p00004 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        while((s=bf.readLine())!=null){
            t="";for(int i=1,j=s.length();i<j;i+=2)t+=s.charAt(i);
            System.out.println(t);
        }
    }
}
```

python code:

```python
s = input()
t = ""
for i in range(1, len(s), 2):
    t += s[i]
print(t)
```

# Problem 5

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567890

Expected output:
01234567890123456789


```
import java.io.*;

public class p00005 {
    public static void main(String[] args) throws Exception{
        BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
        String s,t;
        while((s=bf.readLine())!=null){
            t="";for(int i=0,j=s.length();i<j;i++)t+=s.charAt(i)+""+s.charAt(i);
            System.out.println(t);
        }
    }
}
```

python code:

```python
s = input()
t = ""
for i in range(len(s)):
    t += s[i] + s[i]
print(t)
```

# Problem 6

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1234567890

Expected output:
01234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456
