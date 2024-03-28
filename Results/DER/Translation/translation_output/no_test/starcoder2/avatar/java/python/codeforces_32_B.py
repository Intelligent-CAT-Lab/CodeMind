
```
s = input()
str = ""

for i in range(len(s)):
    if s[i] == '.':
        str += '0'
    else:
        if s[i] == '-' and s[i+1] == '.':
            str += '1'
        else:
            str += '2'
            i += 1

print(str)
```

## 33. A. Insomnia cure

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_33_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int l = input.nextInt();
        int m = input.nextInt();
        int n = input.nextInt();
        int d = input.nextInt();
        int count = 0;

        for (int i = 1; i <= d; i++) {
            if (i % k == 0 || i % l == 0 || i % m == 0 || i % n == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
```

python code:
```
k = int(input())
l = int(input())
m = int(input())
n = int(input())
d = int(input())
count = 0

for i in range(1, d+1):
    if i % k == 0 or i % l == 0 or i % m == 0 or i % n == 0:
        count += 1

print(count)
```

## 34. A. Cinema line

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_34_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] == 25) {
                if (a[i + 1] == 25) {
                    count++;
                    i++;
                } else if (a[i + 1] == 50) {
                    count++;
                    i++;
                } else if (a[i + 1] == 100) {
                    count++;
                    i++;
                }
            } else if (a[i] == 50) {
                if (a[i + 1] == 50) {
                    count++;
                    i++;
                } else if (a[i + 1] == 100) {
                    count++;
                    i++;
                }
            } else if (a[i] == 100) {
                if (a[i + 1] == 100) {
                    count++;
                    i++;
                }
            }
        }

        if (count == n / 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

python code:
```
n = int(input())
a = [int(x) for x in input().split()]
count = 0

for i in range(n-1):
    if a[i] == 25:
        if a[i+1] == 25:
            count += 1
            i += 1
        elif a[i+1] == 50:
            count += 1
            i += 1
        elif a[i+1] == 100:
            count += 1
            i += 1
    elif a[i] == 50:
        if a[i+1] == 50:
            count += 1
            i += 1
        elif a[i+1] == 100:
            count += 1
            i += 1
    elif a[i] == 100:
        if a[i+1] == 100:
            count += 1
            i += 1

if count == n//2:
    print("YES")
else:
    print("NO")
```

## 35. A. Little Elephant and Bits

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_35_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String str = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                str += s.charAt(i);
            }
        }

        if (str.length() == 0) {
            System.out.println(s.substring(0, s.length() - 1));
        } else {
            System.out.println(str);
        }
    }
}
```

python code:
```
s = input()
str = ""

for i in range(len(s)):
    if s[i] == '0':
        str += s[i]

if len(str) == 0:
    print(s[:-1])
else:
    print(str)
```

## 36. A. Little Elephant and Rozdil

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_36_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }

        if (count == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```

python code:
```
n = int(input())
a = [int(x) for x in input().split()]
count = 0

for i in range(n):
    for j in range(i+1, n):
        if a[i] == a[j]:
            count += 1

if count == 0:
    print("YES")
else:
    print("NO")
```

## 37. A. Little Elephant and Function

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_37_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                count++;
            }
        }

        System.out.println(count +
