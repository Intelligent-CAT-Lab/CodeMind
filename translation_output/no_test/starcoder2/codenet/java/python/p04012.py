
```
w = input()
c = list(w)
a = ord('a')
z = ord('z')
count = 0
for i in range(a, z + 1):
    for x in c:
        if x == chr(i):
            count += 1
    if count % 2 == 1:
        print("No")
        break
    count = 0
else:
    print("Yes")
```

## 4.013
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p04013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
```

python code:
```
n = int(input())
a = [int(x) for x in input().split()]
count = 0
for i in range(n):
    for j in range(i + 1, n):
        if a[i] == a[j]:
            count += 1
print(count)
```

## 4.014
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p04014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
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
    for j in range(i + 1, n):
        if a[i] == a[j]:
            count += 1
if count == 0:
    print("No")
else:
    print("Yes")
```

## 4.015
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p04015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
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
    for j in range(i + 1, n):
        if a[i] == a[j]:
            count += 1
if count == 0:
    print("No")
else:
    print("Yes")
```

## 4.016
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p04016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
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
    for j in range(i + 1, n):
        if a[i] == a[j]:
            count += 1
if count == 0:
    print("No")
else:
    print("Yes")
```

## 4.017
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p04017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
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
    for j in range(i + 1, n):
        if a[i] == a[j]:
            count += 1
if count == 0:
    print("No")
else:
    print("Yes")
```

## 4.018
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p04018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i <
