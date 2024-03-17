

```python
s = input()
c = 0
for i in range(len(s)):
    c += int(s[i])
if c % 9 == 0:
    print("Yes")
else:
    print("No")
```

## 2.5.8. p02580

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import java.util.Scanner;

public class p02580 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}

```

python code:

```python
s = input()
for i in range(len(s)-1, -1, -1):
    print(s[i], end="")
```

## 2.5.9. p02581

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
987654321


```
import java.util.Scanner;

public class p02581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
    }
}

```

python code:

```python
s = input()
print(s)
for i in range(len(s)-1, -1, -1):
    print(s[i], end="")
```

## 2.5.10. p02582

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
987654321
123456789


```
import java.util.Scanner;

public class p02582 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println(s);
    }
}

```

python code:

```python
s = input()
print(s)
for i in range(len(s)-1, -1, -1):
    print(s[i], end="")
print()
print(s)
```

## 2.5.11. p02583

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
987654321
123456789
987654321
123456789


```
import java.util.Scanner;

public class p02583 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println(s);
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.println(s);
    }
}

```

python code:

```python
s = input()
print(s)
for i in range(len(s)-1, -1, -1):
    print(s[i], end="")
print()
print(s)
for i in range(len(s)-1, -1, -1):
    print(s[i], end="")
print()
print(s)
```
/docs/02-python-basics/02-02-python-basics-2.md
# 2.2. Python Basics 2

## 2.2.1. p02201

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
123456789
123456789
123456789
123456789
123456789
123456789
123456789
123456789


```
import java.util.Scanner;

public class p02201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<9;i++){
            System.out.println(s);
        }
    }
}

```

python code:

```python
s = input()
for i in range(9):
    print(s)
```

## 2.2.2. p02202

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
123456789
123456789
123456789
123456789
123456789
123456789
123456789
123456789
123456789


```
import java.util.Scanner;

public class p02202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        for(int i=0;i<10;i++){
            System.out.println(s);
        }
    }
}

```

python code:

```python
s = input()
for i in range(10):
    print(s)
```

## 2.2.3. p02203

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789
123456789
123456789
123456789
123456789
123456789
12345678
