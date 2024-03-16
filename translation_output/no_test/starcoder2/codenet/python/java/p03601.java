
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] list = input.split(" ");
        int[] listInt = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            listInt[i] = Integer.parseInt(list[i]);
        }
        int e = listInt[4];
        int f = listInt[5];
        int a = listInt[0];
        int b = listInt[1];
        int c = listInt[2];
        int d = listInt[3];
        int[] listx = new int[100000];
        int[] listy = new int[100000];
        int lengthx = 0;
        int lengthy = 0;
        for (int i = 0; i < 100000; i++) {
            if (i * a * 100 > f) {
                break;
            }
            for (int j = 0; j < 100000; j++) {
                int x = i * a * 100 + j * b * 100;
                if (x > f) {
                    break;
                }
                if (x == 0) {
                    continue;
                }
                if (x > f) {
                    break;
                }
                if (x != 0) {
                    listx[lengthx] = x;
                    lengthx++;
                }
            }
        }
        double f2 = f * e / (100.0 + e);
        for (int i = 0; i < 100000; i++) {
            if (i * c > f2) {
                break;
            }
            for (int j = 0; j < 100000; j++) {
                int y = i * c + j * d;
                if (y > f2) {
                    break;
                }
                if (y != 0) {
                    listy[lengthy] = y;
                    lengthy++;
                }
            }
        }
        int xy_max = 0;
        int y_max = 0;
        double noudo_max = 0;
        for (int i = 0; i < lengthx; i++) {
            for (int j = 0; j < lengthy; j++) {
                int x = listx[i];
                int y = listy[j];
                if (x + y > f) {
                    continue;
                }
                if (y * 100.0 / x <= e) {
                    double noudo = y / (x + y);
                    if (noudo >= noudo_max) {
                        xy_max = x + y;
                        y_max = y;
                        noudo_max = noudo;
                    }
                }
            }
        }
        System.out.println(xy_max + " " + y_max);
    }
}
```

## 10. 1000000007

### 10.1. Problem

1000000007 以下の最大の素数を求めよ。

### 10.2. Answer

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
```

## 11. 1000000007

### 11.1. Problem

1000000007 以下の最大の素数を求めよ。

### 11.2. Answer

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
```

## 12. 1000000007

### 12.1. Problem

1000000007 以下の最大の素数を求めよ。

### 12.2. Answer

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for (int i = 
