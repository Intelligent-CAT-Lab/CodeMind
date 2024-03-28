

```python
import queue

def addChar(s,location,c):
    return s[:location]+c+s[location:]

N = int(input())
count = 0
ch = ['3','5','7']
queue = queue.Queue()
queue.put('357')
queue.put('375')
queue.put('537')
queue.put('573')
queue.put('735')
queue.put('753')

if N<1000:
    while queue.empty() == False:
        s = queue.get()
        if int(s)<=N:
            count += 1
    print(count)
    exit()

while queue.empty() == False:
    s = queue.get()
    if int(s)<=N:
        count += 1
        for i in range(len(s)+1):
            for j in range(len(ch)):
                temp = addChar(s,i,ch[j])
                queue.put(temp)

print(count)
```


```

python code:

```python
N = int(input())

for i in range(N):
    s = input()
    if s.find('1') == -1:
        print(s)
    else:
        print(s.replace('1','2'))
```
/p03201.md
# p03201

## 题目

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
123
12345
123456789

Expected output:
23
2345
23456789


```
import java.util.Scanner;

public class p03201 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            String s = sc.next();
            if (s.indexOf('1')==-1) {
                System.out.println(s);
            } else {
                System.out.println(s.replace('1', '2'));
            }
        }
    }
}/p03202.md
# p03202

## 题目

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
123
12345
123456789

Expected output:
123
12345
123456789


```
import java.util.Scanner;

public class p03202 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            String s = sc.next();
            if (s.indexOf('1')==-1) {
                System.out.println(s);
            } else {
                System.out.println(s.replace('1', '2'));
            }
        }
    }
}

```

python code:

```python
N = int(input())

for i in range(N):
    s = input()
    if s.find('1') == -1:
        print(s)
    else:
        print(s.replace('1','2'))
```
/p03203.md
# p03203

## 题目

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
123
12345
123456789

Expected output:
123
12345
123456789


```
import java.util.Scanner;

public class p03203 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            String s = sc.next();
            if (s.indexOf('1')==-1) {
                System.out.println(s);
            } else {
                System.out.println(s.replace('1', '2'));
            }
        }
    }
}

```

python code:

```python
N = int(input())

for i in range(N):
    s = input()
    if s.find('1') == -1:
        print(s)
    else:
        print(s.replace('1','2'))
```


```

python code:

```python
N = int(input())

for i in range(N):
    s = input()
    if s.find('1') == -1:
        print(s)
    else:
        print(s.replace('1','2'))
```
/p03204.md
# p03204

## 题目

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
123
12345
123456789

Expected output:
123
12345
123456789


```
import java.util.Scanner;

public class p03204 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=0;i<N;i++) {
            String s = sc.next();
            if (s.indexOf('1')==-1) {
                System.out.println(s);
            } else {
                System.out.println(s.replace('1', '2'));
            }
        }
    }

