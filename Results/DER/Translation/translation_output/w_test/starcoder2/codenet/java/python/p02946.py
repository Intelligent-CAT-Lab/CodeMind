

```python
K, X = map(int, input().split())
for i in range(X-K+1, X+K):
    print(i, end=' ')
```

## p02947

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5
2 1 3 4 5
2 3 1 4 5
2 3 1 4 5
2 3 4 1 5
2 3 4 5 1


```
import java.util.Scanner;

public class p02947 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    for (int k = 0; k < 5; k++) {
                        System.out.print(arr[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}

```

python code:

```python
arr = list(map(int, input().split()))
for i in range(5):
    for j in range(4):
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]
            print(*arr)
```

## p02948

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5

Expected output:
1 2 3 4 5
1 2 3 5 4
1 2 4 3 5
1 2 4 5 3
1 2 5 4 3
1 3 2 4 5
1 3 2 5 4
1 3 4 2 5
1 3 4 5 2
1 3 5 4 2
1 4 3 2 5
1 4 3 5 2
1 4 2 3 5
1 4 2 5 3
1 4 5 2 3
1 5 4 2 3
1 5 4 3 2
1 5 2 4 3
1 5 2 3 4
1 5 3 2 4
2 1 3 4 5
2 1 3 5 4
2 1 4 3 5
2 1 4 5 3
2 1 5 4 3
2 3 1 4 5
2 3 1 5 4
2 3 4 1 5
2 3 4 5 1
2 3 5 4 1
2 4 3 1 5
2 4 3 5 1
2 4 1 3 5
2 4 1 5 3
2 4 5 1 3
2 5 4 1 3
2 5 4 3 1
2 5 1 4 3
2 5 1 3 4
2 5 3 1 4
3 2 1 4 5
3 2 1 5 4
3 2 4 1 5
3 2 4 5 1
3 2 5 4 1
3 1 2 4 5
3 1 2 5 4
3 1 4 2 5
3 1 4 5 2
3 1 5 4 2
3 4 1 2 5
3 4 1 5 2
3 4 2 1 5
3 4 2 5 1
3 4 5 2 1
3 5 4 2 1
3 5 4 1 2
3 5 2 4 1
3 5 2 1 4
3 5 1 2 4
4 3 2 1 5
4 3 2 5 1
4 3 1 2 5
4 3 1 5 2
4 3 5 1 2
4 2 3 1 5
4 2 3 5 1
4 2 1 3 5
4 2 1 5 3
4 2 5 1 3
4 1 2 3 5
4 1 2 5 3
4 1 3 2 5
4 1 3 5 2
4 1 5 3 2
4 5 1 3 2
4 5 1 2 3
4 5 3 1 2
4 5 3 2 1
4 5 2 3 1
5 4 3 2 1
5 4 3 1 2
5 4 2 3 1
5 4 2 1 3
5 4 1 2 3
5 3 4 2 1
5 3 4 1 2
5 3 2 4 1
5 3 2 1 4
5 3 1 2 4
5 2 3 4 1
5 2 3 1 4
5 2 4 3 1
5 2 4 1 3
5 2 1 4 3
5 1 2 4 3
5 1 2 3 4
5 1 3 2 4


```
import java.util.Scanner;

public class p02948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                for (int k = 0; k < 5; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}

```

python code:

```python
arr = list(map(int, input().split()))
for i in range(5):
    for j in range(i+1, 5):
        arr[i], arr[j] = arr[j], arr[i]
        print(*arr)
```

## p02949

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3
