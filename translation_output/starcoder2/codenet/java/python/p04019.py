
```
s = input()
checkS = False
checkN = False
checkW = False
checkE = False
for i in range(len(s)):
    if s[i] == 'S':
        checkS = True
    elif s[i] == 'N':
        checkN = True
    elif s[i] == 'W':
        checkW = True
    elif s[i] == 'E':
        checkE = True
if checkS == checkN and checkW == checkE:
    print("Yes")
else:
    print("No")
```

## 4.020
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04020 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i%k == 0 || j%k == 0){
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
n, m, k = map(int, input().split())
count = 0
for i in range(1, n+1):
    for j in range(1, m+1):
        if i % k == 0 or j % k == 0:
            count += 1
print(count)
```

## 4.021
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04021 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%2 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}

```

python code:
```
n = int(input())
count = 0
for i in range(1, n+1):
    if i % 2 == 0:
        count += 1
print(count)
```

## 4.022
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04022 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%2 == 1){
                count++;
            }
        }
        System.out.println(count);
    }

}

```

python code:
```
n = int(input())
count = 0
for i in range(1, n+1):
    if i % 2 == 1:
        count += 1
print(count)
```

## 4.023
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04023 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%3 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}

```

python code:
```
n = int(input())
count = 0
for i in range(1, n+1):
    if i % 3 == 0:
        count += 1
print(count)
```

## 4.024
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04024 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}

```

python code:
```
n = int(input())
count = 0
for i in range(1, n+1):
    if i % 5 == 0:
        count += 1
print(count)
```

## 4.025
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04025 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}

```

python code:
```
n = int(input())
count = 0
for i in range(1, n+1):
    if i % 3 == 0 and i % 5 == 0:
        count += 1
print(count)
```

## 4.026
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04026 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%3 == 0 || i%5 == 0){
                count++;
            }
        }
        System.out.println(count);
    }

}

```

python code:
```
n = int(input())
count = 0
for i in range(1, n+1):
    if i % 3 == 0 or i % 5 == 0:
        count += 1
print(count)
```

## 4.027
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p04027 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(i%3 == 0 && i%5 != 0){
                count++;
            }
        }
        System.out.println(count);
    }

}

```

python code:
```
n = int(input())
count
