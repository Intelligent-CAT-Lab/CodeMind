
```

def func(n):
    list = []
    if n == 1:
        list.append("a")
    else:
        prevList = func(n - 1)
        for s in prevList:
            max = 'a'
            for i in range(len(s)):
                if max < s[i]:
                    max = s[i]
            for c in range(ord('a'), ord(max) + 2):
                newString = s + chr(c)
                list.append(newString)
    return list

n = int(input())
list = func(n)
for s in list:
    print(s)

```

## 02745

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p02745 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = Integer.parseInt(scan.next());
        scan.close();

        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                sum += c - '0';
            } else {
                sum += c - 'A' + 10;
            }
            sum *= n;
        }
        sum /= n;
        System.out.println(sum);
    }
}

```

python code:
```

s = input()
n = int(input())
sum = 0
for i in range(len(s)):
    c = s[i]
    if c >= '0' and c <= '9':
        sum += ord(c) - ord('0')
    else:
        sum += ord(c) - ord('A') + 10
    sum *= n
sum /= n
print(sum)

```

## 02746

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p02746 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                c = (char) (c - 'a' + 'A');
            } else if (c >= 'A' && c <= 'Z') {
                c = (char) (c - 'A' + 'a');
            }
            System.out.print(c);
        }
    }
}

```

python code:
```

s = input()
for i in range(len(s)):
    c = s[i]
    if c >= 'a' and c <= 'z':
        c = chr(ord(c) - ord('a') + ord('A'))
    elif c >= 'A' and c <= 'Z':
        c = chr(ord(c) - ord('A') + ord('a'))
    print(c, end='')

```

## 02747

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p02747 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

python code:
```

s = input()
count = 0
for i in range(len(s)):
    c = s[i]
    if c >= '0' and c <= '9':
        count += 1
print(count)

```

## 02748

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p02748 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

python code:
```

s = input()
count = 0
for i in range(len(s)):
    c = s[i]
    if c >= 'a' and c <= 'z':
        count += 1
print(count)

```

## 02749

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p02749 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

python code:
```

s = input()
count = 0
for i in range(len(s)):
    c = s[i]
    if c >= 'A' and c <= 'Z':
        count += 1
print(count)

```

## 02750

Translate the following java code to python and enclose your solution inside ```python```:
```


import java.util.Scanner;

public class p02750 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        scan.close();

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}

```

python code:
```

s = input()
count = 0
for i in range(len(s)):
    c = s[i]
    if c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u':
        count += 1
print(count)

```

## 02
