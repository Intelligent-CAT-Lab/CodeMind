
```python
a = [int(x) for x in input().split()]
b = a[0] + a[1] * 5 + a[2] * 10 + a[3] * 50 + a[4] * 100 + a[5] * 500
if b >= 1000:
    print(1)
else:
    print(0)
```

## p00292

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

```
import java.util.Scanner;

public class p00292 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        for(int i=0;i<10;i++){
            a[i]=stdIn.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]%2==0)
                b+=a[i];
        }
        System.out.println(b);
    }
}
```

python code:
```python
a = [int(x) for x in input().split()]
b = 0
for i in range(10):
    if a[i] % 2 == 0:
        b += a[i]
print(b)
```

## p00293

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

```
import java.util.Scanner;

public class p00293 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        for(int i=0;i<10;i++){
            a[i]=stdIn.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]%2==1)
                b+=a[i];
        }
        System.out.println(b);
    }
}
```

python code:
```python
a = [int(x) for x in input().split()]
b = 0
for i in range(10):
    if a[i] % 2 == 1:
        b += a[i]
print(b)
```

## p00294

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

```
import java.util.Scanner;

public class p00294 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        for(int i=0;i<10;i++){
            a[i]=stdIn.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]%3==0)
                b+=a[i];
        }
        System.out.println(b);
    }
}
```

python code:
```python
a = [int(x) for x in input().split()]
b = 0
for i in range(10):
    if a[i] % 3 == 0:
        b += a[i]
print(b)
```

## p00295

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

```
import java.util.Scanner;

public class p00295 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        for(int i=0;i<10;i++){
            a[i]=stdIn.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]%3==1)
                b+=a[i];
        }
        System.out.println(b);
    }
}
```

python code:
```python
a = [int(x) for x in input().split()]
b = 0
for i in range(10):
    if a[i] % 3 == 1:
        b += a[i]
print(b)
```

## p00296

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

```
import java.util.Scanner;

public class p00296 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        for(int i=0;i<10;i++){
            a[i]=stdIn.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]%3==2)
                b+=a[i];
        }
        System.out.println(b);
    }
}
```

python code:
```python
a = [int(x) for x in input().split()]
b = 0
for i in range(10):
    if a[i] % 3 == 2:
        b += a[i]
print(b)
```

## p00297

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10

```
import java.util.Scanner;

public class p00297 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a[]=new int[10];
        int b=0;
        for(int i=0;i<10;i++){
            a[i]=stdIn.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]%4==0)
                b+=a[i];
        }
        System.out.println(b);
    }
}
```

python code:
```python
a = [int(x) for x in input().split()]
b = 0
for i in range(10):
    if a[i] % 4 == 0:
