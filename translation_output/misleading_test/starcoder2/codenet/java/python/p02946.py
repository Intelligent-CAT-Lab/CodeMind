

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
                }
            }
            for (int j = 0; j < 5; j++) {
                if (j != 4) {
                    System.out.print(arr[j] + " ");
                } else {
                    System.out.println(arr[j]);
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
            for (int j = 0; j < 5; j++) {
                if (i != j) {
                    for (int k = 0; k < 5; k++) {
                        if (k != i && k != j) {
                            for (int l = 0; l < 5; l++) {
                                if (l != i && l != j && l != k) {
                                    for (int m = 0; m < 5; m++) {
                                        if (m != i && m != j && m != k && m != l) {
                                            System.out.println(arr[i] + " " + arr[j] + " " + arr[k] + " " + arr[l] + " "
                                                    + arr[m]);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
    
