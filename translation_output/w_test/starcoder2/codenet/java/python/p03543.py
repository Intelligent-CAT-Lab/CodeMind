

```python
n = int(input())

n1 = n % 10
n10 = (n - n1) % 100/10
n100 = (n - n1 - n10 * 10) % 1000/100
n1000 = n / 1000

if ((n1 == n10 and n1 == n100) or (n10 == n100 and n10 == n1000)):
    print("Yes")
else:
    print("No")
```

## 3.5.4. p03544

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
123456789


```
import java.util.Scanner;

public class p03544 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = n % 10;
        int n10 = (n - n1) % 100/10;
        int n100 = (n - n1 - n10 * 10) % 1000/100;
        int n1000 = (n - n1 - n10 * 10 - n100 * 100) % 10000/1000;
        int n10000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000) % 100000/10000;
        int n100000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000 - n10000 * 10000) % 1000000/100000;
        int n1000000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000 - n10000 * 10000 - n100000 * 100000) % 10000000/1000000;
        int n10000000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000 - n10000 * 10000 - n100000 * 100000 - n1000000 * 1000000) % 100000000/10000000;
        int n100000000 = n / 100000000;

        System.out.println(n100000000 + n10000000 + n1000000 + n100000 + n10000 + n1000 + n100 + n10 + n1);

    }

}

```

python code:

```python
n = int(input())

n1 = n % 10
n10 = (n - n1) % 100/10
n100 = (n - n1 - n10 * 10) % 1000/100
n1000 = (n - n1 - n10 * 10 - n100 * 100) % 10000/1000
n10000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000) % 100000/10000
n100000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000 - n10000 * 10000) % 1000000/100000
n1000000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000 - n10000 * 10000 - n100000 * 100000) % 10000000/1000000
n10000000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000 - n10000 * 10000 - n100000 * 100000 - n1000000 * 1000000) % 100000000/10000000
n100000000 = n / 100000000

print(n100000000 + n10000000 + n1000000 + n100000 + n10000 + n1000 + n100 + n10 + n1)
```

## 3.5.5. p03545

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
123456789

Expected output:
987654321


```
import java.util.Scanner;

public class p03545 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = n % 10;
        int n10 = (n - n1) % 100/10;
        int n100 = (n - n1 - n10 * 10) % 1000/100;
        int n1000 = (n - n1 - n10 * 10 - n100 * 100) % 10000/1000;
        int n10000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000) % 100000/10000;
        int n100000 = (n - n1 - n10 * 10 - n100 * 100 - n1000 * 1000 - n10000 * 10000) % 1000000/100000;
        
