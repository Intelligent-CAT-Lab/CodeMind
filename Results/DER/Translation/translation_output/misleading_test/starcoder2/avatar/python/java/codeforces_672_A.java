

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[370];
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            int temp[] = new int[3];
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li[ind++] = i;
            }
            if (count == 2) {
                int j = 0;
                while (q != 0) {
                    temp[j++] = q % 10;
                    q /= 10;
                }
                for (int k = 0; k < j; k++) {
                    li[ind++] = temp[k];
                }
            }
            if (count == 3) {
                int j = 0;
                while (q != 0) {
                    temp[j++] = q % 10;
                    q /= 10;
                }
                for (int k = 0; k < j; k++) {
                    li[ind++] = temp[k];
                }
            }
        }
        System.out.println(li[n - 1]);
    }
}
```

## 2.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to find the sum of the digits of a number.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }
}
```
/src/main/java/com/github/hcsp/controlflow/Main.java
package com.github.hcsp.controlflow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[370];
        int ind = 0;
        for (int i = 1; i < 371; i++) {
            int temp[] = new int[3];
            int p = i, q = i;
            int count = 0;
            while (p != 0) {
                p /= 10;
                count++;
            }
            if (count == 1) {
                li[ind++] = i;
            }
            if (count == 2) {
                int j = 0;
                while (q != 0) {
                    temp[j++] = q % 10;
                    q /= 10;
                }
                for (int k = 0; k < j; k++) {
                    li[ind++] = temp[k];
                }
            }
            if (count == 3) {
                int j = 0;
                while (q != 0) {
                    temp[j++] = q % 10;
                    q /= 10;
                }
                for (int k = 0; k < j; k++) {
                    li[ind++] = temp[k];
                }
            }
        }
        System.out.println(li[n - 1]);
    }
}

