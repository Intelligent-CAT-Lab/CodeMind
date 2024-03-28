

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = 50;
        int[][] A = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = (j == i + 1) ? 1 : 0;
            }
        }
        A[N - 1][0] = 1;
        int[][][] B = new int[N][N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                B[i][j][j] = 1;
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        B[i][j][k] += B[i - 1][j][l] * A[l][k];
                    }
                }
            }
        }
        int[][][] C = new int[N][N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                C[i][j][j] = 1;
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    for (int l = 0; l < N; l++) {
                        C[i][j][k] += C[i - 1][j][l] * B[i][l][k];
                    }
                }
            }
        }
        int[] X = new int[N];
        for (int i = 0; i < N; i++) {
            X[i] = N - i - 1;
        }
        if (K == 0) {
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
            System.out.println();
        } else {
            int r = (K - 1) % N;
            int q = (K - 1) / N;
            int[] b = new int[N];
            b[0] = N;
            for (int i = 0; i < N; i++) {
                X[i] = 0;
                for (int j = 0; j < N; j++) {
                    X[i] += X[j] * B[r + 1][i][j];
                }
            }
            for (int i = 0; i < N; i++) {
                X[i] += b[0] * (q * C[N - 1][0][i] + C[r][0][i]);
            }
            for (int i = 0; i < N; i++) {
                System.out.print(X[i] + " ");
            }
            System.out.println();
        }
    }
}
```

## 2.

Write a function that takes a list of numbers and returns a list of numbers that are prime.

```python
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, n):
        if n % i == 0:
            return False
    return True

def prime_list(l):
    return [x for x in l if is_prime(x)]
```

## 3.

Write a function that takes a list of numbers and returns a list of numbers that are perfect squares.

```python
def is_square(n):
    return n == int(n ** 0.5) ** 2

def square_list(l):
    return [x for x in l if is_square(x)]
```

## 4.

Write a function that takes a list of numbers and returns a list of numbers that are perfect cubes.

```python
def is_cube(n):
    return n == int(n ** (1 / 3)) ** 3

def cube_list(l):
    return [x for x in l if is_cube(x)]
```

## 5.

Write a function that takes a list of numbers and returns a list of numbers that are perfect powers.

```python
def is_power(n):
    for i in range(2, n):
        if n == int(n ** (1 / i)) ** i:
            return True
    return False

def power_list(l):
    return [x for x in l if is_power(x)]
```

## 6.

Write a function that takes a list of numbers and returns a list of numbers that are perfect powers of 2.

```python
def is_power_of_2(n):
    return n == 2 ** int(math.log(n, 2))

def power_of_2_list(l):
    return [x for x in l if is_power_of_2(x)]
```

## 7.

Write a function that takes a list of numbers and returns a list of numbers that are perfect powers of 3.

```python
def is_power_of_3(n):
    return n == 3 ** int(math.log(n, 3))

def power_of_3_list(l):
    return [x for x in l if is_power_of_3(x)]
```

## 8.

Write a function that takes a list of numbers and returns a list of numbers that are perfect powers of 4.

```python
def is_power_of_4(n):
    return n == 4 ** int(math.log(n, 4))

def power_of_4_list(l):
    return [x for x in l if is_power_of_4(x)]
```

## 9.

Write a function that takes a list of numbers and returns a list of numbers that are perfect powers of 5.

```python
def is_power_of_5(n):
    return n == 5 ** int(math.log(n, 5))

def power_of
