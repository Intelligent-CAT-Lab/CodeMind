
```
s = input()
akihabara = "AKIHABARA"
kihbr = "KIHBR"

i = 0
j = 0
k = 0
while i < len(s):
    if j+1 < len(akihabara) and akihabara[j] == 'A' and akihabara[j] != s[i]:
        j += 1
    if j >= len(akihabara) or akihabara[j] != s[i]:
        print("NO")
        break
    if s[i] != 'A':
        if s[i] == kihbr[k]:
            k += 1
        else:
            print("NO")
            break
    j += 1
    i += 1
if k == len(kihbr):
    print("YES")
else:
    print("NO")
```

## 3524

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03524 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        int i;
        for(i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        for(i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }
        int j = 0;
        int k = 0;
        int l = 0;
        while(j < n && k < m) {
            if(a[j] < b[k]) {
                System.out.print(a[j] + " ");
                j++;
            } else {
                System.out.print(b[k] + " ");
                k++;
            }
            l++;
            if(l % 10 == 0) {
                System.out.println();
            }
        }
        while(j < n) {
            System.out.print(a[j] + " ");
            j++;
            l++;
            if(l % 10 == 0) {
                System.out.println();
            }
        }
        while(k < m) {
            System.out.print(b[k] + " ");
            k++;
            l++;
            if(l % 10 == 0) {
                System.out.println();
            }
        }
    }
}
```

python code:
```
n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

j = 0
k = 0
l = 0
while j < n and k < m:
    if a[j] < b[k]:
        print(a[j], end=" ")
        j += 1
    else:
        print(b[k], end=" ")
        k += 1
    l += 1
    if l % 10 == 0:
        print()
while j < n:
    print(a[j], end=" ")
    j += 1
    l += 1
    if l % 10 == 0:
        print()
while k < m:
    print(b[k], end=" ")
    k += 1
    l += 1
    if l % 10 == 0:
        print()
```

## 3525

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03525 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int i;
        for(i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int j = 0;
        int k = 0;
        int l = 0;
        while(j < n) {
            if(a[j] % 2 == 0) {
                System.out.print(a[j] + " ");
                k++;
            } else {
                l++;
            }
            j++;
        }
        System.out.println();
        j = 0;
        while(j < n) {
            if(a[j] % 2 == 1) {
                System.out.print(a[j] + " ");
                k++;
            } else {
                l++;
            }
            j++;
        }
        System.out.println();
        System.out.println(k + " " + l);
    }
}
```

python code:
```
n = int(input())
a = list(map(int, input().split()))

j = 0
k = 0
l = 0
while j < n:
    if a[j] % 2 == 0:
        print(a[j], end=" ")
        k += 1
    else:
        l += 1
    j += 1
print()
j = 0
while j < n:
    if a[j] % 2 == 1:
        print(a[j], end=" ")
        k += 1
    else:
        l += 1
    j += 1
print()
print(k, l)
```

## 3526

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03526 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int i;
        for(i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int j = 0;
        int k = 0;
        int l = 0;
        while(j < n) {
            if(a[j] % 2 == 0) {
                System.out.print(a[j] + " ");
                k++;
            } else {
                l++;
            }
            j++;
        }
        System.out.println();
        j = 0;
        while(j < n) {
            if(a[j] % 2 == 1) {
                System.out.print(a[j] + " ");
                k++;
            } else {
                l++;
            }
            j++;
        }
        System.out.println();
        System.out.println(k + " " + l);
    }
}
```

python code:
```
n = int(input())
a = list(map(int, input
