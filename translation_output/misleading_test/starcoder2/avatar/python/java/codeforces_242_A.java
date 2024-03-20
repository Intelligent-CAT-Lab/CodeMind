

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c++;
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(c);
    }
}
```


```

java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a; i <= n; i++) {
            for (int j = b; j <= m; j++) {
                if (i > j) {
                    c++;
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(c);
    }
}
```
/README.md
# Python-to-Java

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 5 3 2

Expected output:
6
4 2
4 3
5 2
5 3
5 4

```
x , y , a , b = [ int ( i ) for i in input ( ) . split ( ) ]
c = [ [ i , j ] for i in range ( a , x + 1 ) for j in range ( b , y + 1 ) if i > j ]
print ( len ( c ) ) ; [ print ( * i ) for i in c ]

