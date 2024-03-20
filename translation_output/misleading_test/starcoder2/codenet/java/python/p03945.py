
```python
s = input()
counter = 0
for i in range(len(s)-1):
    if s[i] != s[i+1]:
        counter += 1
print(counter)
```

## 3.946

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.util.*;
public class p03946{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length;i++){
      for(int j=i+1;j<str.length;j++){
        if(Integer.parseInt(str[i])>Integer.parseInt(str[j])){
          String temp=str[i];
          str[i]=str[j];
          str[j]=temp;
        }
      }
    }
    for(int i=0;i<str.length;i++){
      System.out.print(str[i]);
    }
  }
}
```

python code:
```python
s = input()
str = []
for i in range(len(s)):
    str.append(s[i])
for i in range(len(str)):
    for j in range(i+1, len(str)):
        if int(str[i]) > int(str[j]):
            temp = str[i]
            str[i] = str[j]
            str[j] = temp
for i in range(len(str)):
    print(str[i], end='')
```

## 3.947

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321

```
import java.util.*;
public class p03947{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length;i++){
      for(int j=i+1;j<str.length;j++){
        if(Integer.parseInt(str[i])<Integer.parseInt(str[j])){
          String temp=str[i];
          str[i]=str[j];
          str[j]=temp;
        }
      }
    }
    for(int i=0;i<str.length;i++){
      System.out.print(str[i]);
    }
  }
}
```

python code:
```python
s = input()
str = []
for i in range(len(s)):
    str.append(s[i])
for i in range(len(str)):
    for j in range(i+1, len(str)):
        if int(str[i]) < int(str[j]):
            temp = str[i]
            str[i] = str[j]
            str[j] = temp
for i in range(len(str)):
    print(str[i], end='')
```

## 3.948

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.util.*;
public class p03948{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length;i++){
      for(int j=i+1;j<str.length;j++){
        if(Integer.parseInt(str[i])>Integer.parseInt(str[j])){
          String temp=str[i];
          str[i]=str[j];
          str[j]=temp;
        }
      }
    }
    for(int i=str.length-1;i>=0;i--){
      System.out.print(str[i]);
    }
  }
}
```

python code:
```python
s = input()
str = []
for i in range(len(s)):
    str.append(s[i])
for i in range(len(str)):
    for j in range(i+1, len(str)):
        if int(str[i]) > int(str[j]):
            temp = str[i]
            str[i] = str[j]
            str[j] = temp
for i in range(len(str)-1, -1, -1):
    print(str[i], end='')
```

## 3.949

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321

```
import java.util.*;
public class p03949{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    for(int i=0;i<str.length;i++){
      str[i]=s.substring(i, i+1);
    }
    for(int i=0;i<str.length;i++){
      for(int j=i+1;j<str.length;j++){
        if(Integer.parseInt(str[i])<Integer.parseInt(str[j])){
          String temp=str[i];
          str[i]=str[j];
          str[j]=temp;
        }
      }
    }
    for(int i=str.length-1;i>=0;i--){
      System.out.print(str[i]);
    }
  }
}
```

python code:
```python
s = input()
str = []
for i in range(len(s)):
    str.append(s[i])
for i in range(len(str)):
    for j in range(i+1, len(str)):
        if int(str[i]) < int(str[j]):
            temp = str[i]
            str[i] = str[j]
            str[j] = temp
for i in range(len(str)-1, -1, -1):
    print(str[i], end='')
```

## 3.950

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789

```
import java.util.*;
public class p03950{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    sc.close();
    String[] str=new String[s.length()];
    for(int i=0;i<str.length;
