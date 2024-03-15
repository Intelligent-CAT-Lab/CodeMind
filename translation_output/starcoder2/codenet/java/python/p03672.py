
```
s = input()

s1 = ""
s2 = ""

answer = ""

for i in range(len(s),1,-2):
    S = s[0:i]
    s1 = S[0:len(S)//2]
    s2 = S[len(S)//2:len(S)]
    if s1 == s2 and len(S) != len(s):
        answer = S
        break

print(len(answer))
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03673 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int[] arr2 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr2[i] = scan.nextInt();
        }
        
        int[] arr3 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr3[i] = arr[i] + arr2[i];
        }
        
        for(int i = 0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        
    }

}

```

python code:
```
n = int(input())

arr = []
for i in range(n):
    arr.append(int(input()))

arr2 = []
for i in range(n):
    arr2.append(int(input()))

arr3 = []
for i in range(n):
    arr3.append(arr[i] + arr2[i])

for i in range(n):
    print(arr3[i], end=" ")
```

## 5.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03674 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int[] arr2 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr2[i] = scan.nextInt();
        }
        
        int[] arr3 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr3[i] = arr[i] * arr2[i];
        }
        
        for(int i = 0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        
    }

}

```

python code:
```
n = int(input())

arr = []
for i in range(n):
    arr.append(int(input()))

arr2 = []
for i in range(n):
    arr2.append(int(input()))

arr3 = []
for i in range(n):
    arr3.append(arr[i] * arr2[i])

for i in range(n):
    print(arr3[i], end=" ")
```

## 6.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03675 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int[] arr2 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr2[i] = scan.nextInt();
        }
        
        int[] arr3 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr3[i] = arr[i] - arr2[i];
        }
        
        for(int i = 0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        
    }

}

```

python code:
```
n = int(input())

arr = []
for i in range(n):
    arr.append(int(input()))

arr2 = []
for i in range(n):
    arr2.append(int(input()))

arr3 = []
for i in range(n):
    arr3.append(arr[i] - arr2[i])

for i in range(n):
    print(arr3[i], end=" ")
```

## 7.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03676 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int[] arr2 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr2[i] = scan.nextInt();
        }
        
        int[] arr3 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr3[i] = arr[i] / arr2[i];
        }
        
        for(int i = 0;i<n;i++){
            System.out.print(arr3[i]+" ");
        }
        
    }

}

```

python code:
```
n = int(input())

arr = []
for i in range(n):
    arr.append(int(input()))

arr2 = []
for i in range(n):
    arr2.append(int(input()))

arr3 = []
for i in range(n):
    arr3.append(arr[i] / arr2[i])

for i in range(n):
    print(arr3[i], end=" ")
```

## 8.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03677 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        int[] arr = new int[n];
        
        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        
        int[] arr2 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr2[i] = scan.nextInt();
        }
        
        int[] arr3 = new int[n];
        
        for(int i = 0;i<n;i++){
            arr3[i] = arr[i] % arr2[i];
        }
        
        for(int i = 0;i<n;i++){
            System.out.print(arr3[i]+" ");
        
