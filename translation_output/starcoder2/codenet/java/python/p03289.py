
```
S = input()
c = list(S)
if c[0] != 'A':
    print('WA')
    exit()
count = 0
index = 0
for i in range(2, len(c) - 1):
    if c[i] == 'C':
        count += 1
        index = i
if count != 1:
    print('WA')
    exit()
for i in range(len(c)):
    if i == 0 or i == index:
        continue
    if c[i] >= 'A' and c[i] <= 'Z':
        print('WA')
        exit()
print('AC')
```

## 3.28.10

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p032810 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
```

python code:
```
N = int(input())
a = [int(x) for x in input().split()]
count = 0
for i in range(N):
    for j in range(i + 1, N):
        if a[i] == a[j]:
            count += 1
print(count)
```

## 3.28.11

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p032811 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
```

python code:
```
N = int(input())
a = [int(x) for x in input().split()]
count = 0
for i in range(N):
    for j in range(i + 1, N):
        if a[i] == a[j]:
            count += 1
print(count)
```

## 3.28.12

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p032812 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
```

python code:
```
N = int(input())
a = [int(x) for x in input().split()]
count = 0
for i in range(N):
    for j in range(i + 1, N):
        if a[i] == a[j]:
            count += 1
print(count)
```

## 3.28.13

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p032813 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
```

python code:
```
N = int(input())
a = [int(x) for x in input().split()]
count = 0
for i in range(N):
    for j in range(i + 1, N):
        if a[i] == a[j]:
            count += 1
print(count)
```

## 3.28.14

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p032814 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
```

python code:
```
N = int(input())
a = [int(x) for x in input().split()]
count = 0
for i in range(N):
    for j in range(i + 1, N):
        if a[i] == a[j]:
            count += 1
print(count)
```

## 3.28.15

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p032815 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(
