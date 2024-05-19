System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String moto = scanner.nextLine();
        String s = moto;
        String gene = "ABC";
        boolean f = true;
        String[] log = new String[moto.length()];
        int logIndex = 0;

        while (s.length() > 3 && f) {
            f = false;
            if (s.startsWith("ABC")) {
                s = s.replace("ABC", "A");
                log[logIndex] = "A";
                f = true;
            } else if (s.endsWith("ABC")) {
                s = s.replace("ABC", "C");
                log[logIndex] = "C";
                f = true;
            } else if (s.contains("ABC")) {
                s = s.replace("ABC", "B");
                log[logIndex] = "B";
                f = true;
            }
        }

        if (!s.equals(gene)) {
            System.out.println("No");
            System.exit(0);
        }

        int l = log.length;
        for (int i = 0; i < l; i++) {
            s = s.replace(log[l - 1 - i], "ABC");
        }

        if (s.equals(moto)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```<|endoftext|>
