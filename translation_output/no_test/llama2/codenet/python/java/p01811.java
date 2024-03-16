<s> Translate the following python code to java and enclose your solution inside ```java```:
```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')


```

### 解答

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moto = sc.nextLine();
        String gene = "ABC";
        boolean f = true;
        String log[] = new String[0];
        while (moto.length() > 3 && f) {
            f = false;
            if (moto.substring(0, 3).equals("ABC")) {
                moto = moto.replace("ABC", "A");
                log = new String[0];
                log[0] = "A";
                f = true;
            } else if (moto.substring(moto.length() - 3).equals("ABC")) {
                moto = moto.replace("ABC", "C");
                log = new String[0];
                log[0] = "C";
                f = true;
            } else if (gene.contains(moto)) {
                moto = moto.replace("ABC", "B");
                log = new String[0];
                log[0] = "B";
                f = true;
            }
        }
        if (!moto.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }
        int l = log.length;
        for (int i = 0; i < l; i++) {
            moto = moto.replace(log[l - 1 - i], "ABC");
        }
        if (moto.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### 解析

```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')

```

### 解析

```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')

```

### 解析

```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')

```

### 解析

```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')

```

### 解析

```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif 'ABC' in s:
        s=s.replace('ABC','B')
        log.append('B')
        f=True
if s!=gene:
    print('No')
    exit()
l=len(log)
for i in range(l):
    s=s.replace(log[l-1-i],'ABC')
if s==moto:
    print('Yes')
else:
    print('No')

```

### 解析

```
# coding: utf-8
moto=input()
s=moto
gene='ABC'
f=True
log=[]
while len(s)>3 and f:
    f=False
    if s[:3]=='ABC':
        s=s.replace('ABC','A')
        log.append('A')
        f=True
    elif s[len(s)-3:]=='ABC':
        s=s.replace('ABC','C')
        log.append('C')
        f=True
    elif '
