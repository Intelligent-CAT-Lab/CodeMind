

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

## 3.5.4. 1001

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1001

Expected output:
1000

```
import java.util.Scanner;

public class p03544 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = n % 10;
        int n10 = (n - n1) % 100/10;
        int n100 = (n - n1 - n10 * 10) % 1000/100;
        int n1000 = n / 1000;

        int n10000 = n / 10000;

        if (n10000 == 0) {
            if (n1000 == 0) {
                if (n100 == 0) {
                    System.out.println(n1 - 1);
                } else {
                    System.out.println(n100 - 1);
                }
            } else {
                System.out.println(n1000 - 1);
            }
        } else {
            System.out.println(n10000 - 1);
        }

    }

}

```

python code:

```python
n = int(input())

n1 = n % 10
n10 = (n - n1) % 100/10
n100 = (n - n1 - n10 * 10) % 1000/100
n1000 = n / 1000

n10000 = n / 10000

if n10000 == 0:
    if n1000 == 0:
        if n100 == 0:
            print(n1 - 1)
        else:
            print(n100 - 1)
    else:
        print(n1000 - 1)
else:
    print(n10000 - 1)
```

## 3.5.5. 1002

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1002

Expected output:
1001

```
import java.util.Scanner;

public class p03545 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = n % 10;
        int n10 = (n - n1) % 100/10;
        int n100 = (n - n1 - n10 * 10) % 1000/100;
        int n1000 = n / 1000;

        int n10000 = n / 10000;

        if (n10000 == 0) {
            if (n1000 == 0) {
                if (n100 == 0) {
                    System.out.println(n1 + 1);
                } else {
                    System.out.println(n100 + 1);
                }
            } else {
                System.out.println(n1000 + 1);
            }
        } else {
            System.out.println(n10000 + 1);
        }

    }

}

```

python code:

```python
n = int(input())

n1 = n % 10
n10 = (n - n1) % 100/10
n100 = (n - n1 - n10 * 10) % 1000/100
n1000 = n / 1000

n10000 = n / 10000

if n10000 == 0:
    if n1000 == 0:
        if n100 == 0:
            print(n1 + 1)
        else:
            print(n100 + 1)
    else:
        print(n1000 + 1)
else:
    print(n10000 + 1)
```

## 3.5.6. 1003

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1003

Expected output:
1002

```
import java.util.Scanner;

public class p03546 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int n1 = n % 10;
        int n10 = (n - n1) % 100/10;
        int n100 = (n - n1 - n10 * 10) % 1000/100;
        int n1000 = n / 1000;

        int n10000 = n / 10000;

        if (n10000 == 0) {
            if (n1000 == 0) {
                if (n100 == 0) {
                    System.out.println(n1 + 2);
                } else {
                    System.out.println(n100 + 2);
                }
            } else {
                System.out.println(n1000 + 2);
            }
        } else {
            System.out.println(n10000 + 2);
        }

    }

}

```

python code:

```python
n = int(input())

n1 = n % 10
n10 = (n - n1) % 100/10
n100 = (n - n1 - n10 * 10) % 1000/100
n1000 = n / 1000

n10000 = n / 10000

if n10000 == 0:
    if n1000 == 0:
        if n100 == 0:
            print(n1 + 2)
        else:
            print(n100 + 2
