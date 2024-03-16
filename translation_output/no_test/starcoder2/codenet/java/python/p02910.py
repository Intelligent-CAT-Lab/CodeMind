
```python
N = input()

for i in range(len(N)):
    if i % 2 == 0:
        if N[i] == 'L':
            print('No')
            break
    else:
        if N[i] == 'R':
            print('No')
            break
    if i == len(N) - 1:
        print('Yes')
```

## 2911

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02911 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[K];
        for (int i = 0; i < K; i++) {
            arr3[i] = sc.nextInt();
        }

        int[] arr4 = new int[N + M + K];
        for (int i = 0; i < N; i++) {
            arr4[i] = arr[i];
        }
        for (int i = 0; i < M; i++) {
            arr4[i + N] = arr2[i];
        }
        for (int i = 0; i < K; i++) {
            arr4[i + N + M] = arr3[i];
        }

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length - 1; j++) {
                if (arr4[j] > arr4[j + 1]) {
                    int temp = arr4[j];
                    arr4[j] = arr4[j + 1];
                    arr4[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
    }

}
```

python code:
```python
N = int(input())
M = int(input())
K = int(input())

arr = list(map(int, input().split()))
arr2 = list(map(int, input().split()))
arr3 = list(map(int, input().split()))

arr4 = arr + arr2 + arr3

for i in range(len(arr4)):
    for j in range(len(arr4) - 1):
        if arr4[j] > arr4[j + 1]:
            temp = arr4[j]
            arr4[j] = arr4[j + 1]
            arr4[j + 1] = temp

for i in range(len(arr4)):
    print(arr4[i], end=' ')
```
/2021-03-08.md
# 2021-03-08

## 2912

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02912 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[N + M];
        for (int i = 0; i < N; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < M; i++) {
            arr3[i + N] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length - 1; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

}
```

python code:
```python
N = int(input())
M = int(input())

arr = list(map(int, input().split()))
arr2 = list(map(int, input().split()))

arr3 = arr + arr2

for i in range(len(arr3)):
    for j in range(len(arr3) - 1):
        if arr3[j] > arr3[j + 1]:
            temp = arr3[j]
            arr3[j] = arr3[j + 1]
            arr3[j + 1] = temp

for i in range(len(arr3)):
    print(arr3[i], end=' ')
```

## 2913

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] arr2 = new int[M];
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[N + M];
        for (int i = 0; i < N; i++) {
            arr3[i] = arr[i];
        }
        for (int i = 0; i < M; i++) {
            arr3[i + N] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3.length - 1; j++) {
                if (arr3[j] < arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }

}
```

python code:
```python
N = int(input())
M = int(input())

arr = list(map(int,
