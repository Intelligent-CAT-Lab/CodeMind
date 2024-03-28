
```python
str = input()
ret = ""
for i in range(len(str)):
    ch = str[len(str) - i - 1]
    ret += ch
print(ret)
```

## 00007

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00007 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```python
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if ch >= '0' and ch <= '9':
        ret += ch
print(ret)
```

## 00008

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00008 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(str.length() - i - 1);
            if (ch >= '0' && ch <= '9') {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```python
str = input()
ret = ""
for i in range(len(str)):
    ch = str[len(str) - i - 1]
    if ch >= '0' and ch <= '9':
        ret += ch
print(ret)
```

## 00009

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00009 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                ret += ch;
            } else {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```python
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if ch >= '0' and ch <= '9':
        ret += ch
    else:
        ret += ch
print(ret)
```

## 00010

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00010 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(str.length() - i - 1);
            if (ch >= '0' && ch <= '9') {
                ret += ch;
            } else {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```python
str = input()
ret = ""
for i in range(len(str)):
    ch = str[len(str) - i - 1]
    if ch >= '0' and ch <= '9':
        ret += ch
    else:
        ret += ch
print(ret)
```

## 00011

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00011 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                ret += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```python
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if ch >= '0' and ch <= '9':
        ret += ch
    elif ch >= 'a' and ch <= 'z':
        ret += ch
print(ret)
```

## 00012

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00012 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(str.length() - i - 1);
            if (ch >= '0' && ch <= '9') {
                ret += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```python
str = input()
ret = ""
