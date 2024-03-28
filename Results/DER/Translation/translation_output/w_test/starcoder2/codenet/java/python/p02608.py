

```python
import math

n = int(input())

eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            result = i * i + j * j + k * k + i * j + j * k + k * i
            if result >= 100000:
                continue
            eratosu[result] += 1

for i in range(1, n + 1):
    print(eratosu[i])
```

## 02609

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1
1
1
1
1
1
1
1
1
1


```
import java.util.Scanner;

public class p02609 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] eratosu = new int[100000];
        for(int i = 1 ; i <= 100 ; i++) {
            for(int j = 1 ; j <= 100 ; j++) {
                for(int k = 1 ; k <= 100 ; k++) {
                  if(i * i + j * j + k * k >= 100000)
                    continue;
                    int result = i * i + j * j + k * k + i * j + j * k + k * i;
                    eratosu[result]++;
                }
            }

        }
        String s = eratosu[1] + "";
        StringBuilder sb = new StringBuilder(s);

        for(int i = 2 ; i <= n ; i++) {
            sb.append("\n" + eratosu[i]);
        }

        sc.close();
        System.out.println(sb.toString());

    }
}


```

python code:

```python
import math

n = int(input())

eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            result = i * i + j * j + k * k + i * j + j * k + k * i
            if result >= 100000:
                continue
            eratosu[result] += 1

for i in range(1, n + 1):
    print(eratosu[i])
```
/02600/02600.md
# 02600

## 02600

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1
1
1
1
1
1
1
1
1
1


```
import java.util.Scanner;

public class p02600 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] eratosu = new int[100000];
        for(int i = 1 ; i <= 100 ; i++) {
            for(int j = 1 ; j <= 100 ; j++) {
                for(int k = 1 ; k <= 100 ; k++) {
                  if(i * i + j * j + k * k >= 100000)
                    continue;
                    int result = i * i + j * j + k * k + i * j + j * k + k * i;
                    eratosu[result]++;
                }
            }

        }
        String s = eratosu[1] + "";
        StringBuilder sb = new StringBuilder(s);

        for(int i = 2 ; i <= n ; i++) {
            sb.append("\n" + eratosu[i]);
        }

        sc.close();
        System.out.println(sb.toString());

    }
}


```

python code:

```python
import math

n = int(input())

eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            result = i * i + j * j + k * k + i * j + j * k + k * i
            if result >= 100000:
                continue
            eratosu[result] += 1

for i in range(1, n + 1):
    print(eratosu[i])
```

## 02601

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10

Expected output:
1
1
1
1
1
1
1
1
1
1


```
import java.util.Scanner;

public class p02601 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] eratosu = new int[100000];
        for(int i = 1 ; i <= 100 ; i++) {
            for(int j = 1 ; j <= 100 ; j++) {
                for(int k = 1 ; k <= 100 ; k++) {
                  if(i * i + j * j + k * k >= 100000)
                    continue;
                    int result = i * i + j * j + k * k + i * j + j * k + k * i;
                    eratosu[result]++;
                }
            }

        }
        String s = eratosu[1] + "";
        StringBuilder sb = new StringBuilder(s);

        for(int i = 2 ; i <= n ; i++) {
            sb.append("\n" + eratosu[i]);
        }

        sc.close();
        System.out.println(sb.toString());

    }
}


```

python code:

```python
import math

n = int(input())

eratosu = [0] * 100000

for i in range(1, 101):
    for j in range(1, 101):
        for k in range(1, 101):
            result = i * i + j * j + k * k + i * j + j * k + k * i
            if result >= 100000:
                continue
            er
