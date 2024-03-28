
```
str = input()
ret = ""
for i in range(len(str)):
    ch = str[len(str) - i - 1]
    ret += ch
print(ret)
```

## 00007
Translate the following java code to python and enclose your solution inside ```python```:
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
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 'a' + 'A');
            }
            ret += ch;
        }
        System.out.println(ret);
    }
}
```

python code:
```
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if ch >= 'a' and ch <= 'z':
        ch = chr(ord(ch) - ord('a') + ord('A'))
    ret += ch
print(ret)
```

## 00008
Translate the following java code to python and enclose your solution inside ```python```:
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
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch - 'A' + 'a');
            }
            ret += ch;
        }
        System.out.println(ret);
    }
}
```

python code:
```
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if ch >= 'A' and ch <= 'Z':
        ch = chr(ord(ch) - ord('A') + ord('a'))
    ret += ch
print(ret)
```

## 00009
Translate the following java code to python and enclose your solution inside ```python```:
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
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if ch >= '0' and ch <= '9':
        ret += ch
print(ret)
```

## 00010
Translate the following java code to python and enclose your solution inside ```python```:
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
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if (ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z'):
        ret += ch
print(ret)
```

## 00011
Translate the following java code to python and enclose your solution inside ```python```:
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
            if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if (ch >= '0' and ch <= '9') or (ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z'):
        ret += ch
print(ret)
```

## 00012
Translate the following java code to python and enclose your solution inside ```python```:
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
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch == ' ') {
                ret += ch;
            }
        }
        System.out.println(ret);
    }
}
```

python code:
```
str = input()
ret = ""
for i in range(len(str)):
    ch = str[i]
    if (ch >= '0' and ch <= '9') or (ch >= 'a' and ch <= 'z') or (ch >= 'A' and ch <= 'Z') or ch == ' ':
        ret += ch
print(ret)
```

## 00013
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p00013 {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        String ret = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch
