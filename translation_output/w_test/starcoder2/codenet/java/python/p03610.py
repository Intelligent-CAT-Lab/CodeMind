

```python
s = input()
for i in range(0, len(s), 2):
    print(s[i], end="")
```

## 03611

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5 1 2 3 4 5 1 2 3 4 5 1 2 3 4 5


```
import java.util.*;

class p03611{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(array[j] + " ");
            }
        }
    }
}
```

python code:

```python
n = int(input())
array = list(map(int, input().split()))
for i in range(n):
    for j in range(n):
        print(array[j], end=" ")
```

## 03612

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5 5 4 3 2 1


```
import java.util.*;

class p03612{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
```

python code:

```python
n = int(input())
array = list(map(int, input().split()))
for i in range(n):
    print(array[i], end=" ")
for i in range(n - 1, -1, -1):
    print(array[i], end=" ")
```

## 03613

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5 5 4 3 2 1 1 2 3 4 5


```
import java.util.*;

class p03613{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
```

python code:

```python
n = int(input())
array = list(map(int, input().split()))
for i in range(n):
    print(array[i], end=" ")
for i in range(n - 1, -1, -1):
    print(array[i], end=" ")
for i in range(n):
    print(array[i], end=" ")
```

## 03614

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5 5 4 3 2 1 1 2 3 4 5 5 4 3 2 1


```
import java.util.*;

class p03614{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
    }
}
```

python code:

```python
n = int(input())
array = list(map(int, input().split()))
for i in range(n):
    print(array[i], end=" ")
for i in range(n - 1, -1, -1):
    print(array[i], end=" ")
for i in range(n):
    print(array[i], end=" ")
for i in range(n - 1, -1, -1):
    print(array[i], end=" ")
```

## 03615

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5 5 4 3 2 1 1 2 3 4 5 5 4 3 2 1 1 2 3 4 5


```
import java.util.*;

class p03615{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        for(int i = n - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
    }
}
```

python code:

```python
n = int(input())
array = list(map(int, input().split()))
for i in range(n):
    print(array[i], end=" ")
for i in range(n - 1, -1, -1):
    print(array[i], end=" ")
for i in range(n):
    print(array[
