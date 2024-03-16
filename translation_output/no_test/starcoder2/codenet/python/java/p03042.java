
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = Integer.parseInt(n.substring(0, 2));
        int b = Integer.parseInt(n.substring(2, 4));
        if (b == 0 || b > 12) {
            if (1 <= a && a <= 12) {
                System.out.println("MMYY");
            } else {
                System.out.println("NA");
            }
        } else if (1 <= a && a <= 12) {
            System.out.println("AMBIGUOUS");
        } else {
            System.out.println("YYMM");
        }
    }
}
```

## 10019

### Problem

Write a program that reads a number and prints the number of 1 bits in the binary representation of the number.

### Input

The input is a sequence of lines. Each line contains a positive integer.

### Output

For each line of input, print the number of 1 bits in the binary representation of the number.

### Sample Input

```
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
```

### Sample Output

```
1
1
2
1
2
2
3
1
2
2
3
2
3
3
4
1
2
2
3
2
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    count++;
                }
                n /= 2;
            }
            System.out.println(count);
        }
    }
}
```

## 10020

### Problem

Write a program that reads a sequence of lines. Each line contains a positive integer. For each line, print the number of 1 bits in the binary representation of the number.

### Input

The input is a sequence of lines. Each line contains a positive integer.

### Output

For each line of input, print the number of 1 bits in the binary representation of the number.

### Sample Input

```
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
```

### Sample Output

```
1
1
2
1
2
2
3
1
2
2
3
2
3
3
4
1
2
2
3
2
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    count++;
                }
                n /= 2;
            }
            System.out.println(count);
        }
    }
}
```

## 10021

### Problem

Write a program that reads a sequence of lines. Each line contains a positive integer. For each line, print the number of 1 bits in the binary representation of the number.

### Input

The input is a sequence of lines. Each line contains a positive integer.

### Output

For each line of input, print the number of 1 bits in the binary representation of the number.

### Sample Input

```
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
```

### Sample Output

```
1
1
2
1
2
2
3
1
2
2
3
2
3
3
4
1
2
2
3
2
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    count++;
                }
                n /= 2;
            }
            System.out.println(count);
        }
    }
}
```

## 10022

### Problem

Write a program that reads a sequence of lines. Each line contains a positive integer. For each line, print the number of 1 bits in the binary representation of the number.

### Input

The input is a sequence of lines. Each line contains a positive integer.

### Output

For each line of input, print the number of 1 bits in the binary representation of the number.

### Sample Input

```
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
```

### Sample Output

```
1
1
2
1
2
2
3
1
2
2
3
2
3
3
4
1
2
2
3
2
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    count++;
                }
                n /= 2;
            }
            System.out.println(count);
        }
    }
}
```

## 10023

### Problem

Write a program that reads a sequence of lines. Each line contains a positive integer. For each line, print the number of 1 bits in the binary representation of the number.

### Input

The input is a sequence of lines. Each line contains a positive integer.

### Output

For each line of input, print the number of 1 bits in the binary representation of the number.

### Sample Input

```
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
```

### Sample Output

```
1
1
2
1
2
2
3
1
2
2
3
2
3
3
4
1
2
2
3
2
```

### Solution

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int count = 0;
            while (n > 0) {
                if (n % 2 == 1) {
                    count++;
                }
                n /= 2;
            }
            System.out.println(count);
        }
    }
}
```

## 10024

### Problem

Write a program that reads a sequence of lines. Each line contains a positive integer. For each line, print the number of 1 bits in the binary representation of the number.

### Input

The input is a sequence of lines. Each line contains a positive integer.

### Output

For each line of input, print the number of 1 bits in the binary representation of the number.

###
