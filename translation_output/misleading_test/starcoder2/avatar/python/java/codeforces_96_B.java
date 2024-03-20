

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Long> l = new ArrayList<Long>();
        long limit = 10000000000L;
        gen(0, 0, 0, l);
        Collections.sort(l);
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 0;
        for (long val : l) {
            if (val >= n) {
                ans = val;
                break;
            }
        }
        System.out.println(ans);
    }

    public static void gen(long number, int four, int seven, ArrayList<Long> l) {
        if (number > limit) {
            return;
        }
        if (number > 0 && four == seven) {
            l.add(number);
        }
        gen(number * 10 + 4, four + 1, seven, l);
        gen(number * 10 + 7, four, seven + 1, l);
    }
}
```

## 2.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 3.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 4.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 5.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 6.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 7.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 8.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 9.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 10.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 11.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 12.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}
```

## 13.

Write a program to find the sum of all the numbers in a given file.

```
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        int sum = 0;
        while (sc.hasNextInt()) {
            sum += sc.
