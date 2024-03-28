

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int MOD = 1000000007;
        System.out.println(Math.pow(k, n) % MOD);
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times each character appears in the string.

```
Sample Input:

hello

Sample Output:

h: 1
e: 1
l: 2
o: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] count = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println((char)i + ": " + count[i]);
            }
        }
    }
}
```

## 3. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}
```

## 4. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}
```

## 5. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}
```

## 6. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}
```

## 7. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}
```

## 8. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}
```

## 9. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(words[i] + ": " + count[i]);
            }
        }
    }
}
```

## 10. 
Write a program that reads a string and prints the number of times each word appears in the string.

```
Sample Input:

hello world

Sample Output:

hello: 1
world: 1
```

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split(" ");
        int[] count = new int[words.
