
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            L.add(0);
        }
        for (int i = 0; i < b; i++) {
            L.add(1);
        }
        for (int i = 0; i < c; i++) {
            L.add(2);
        }
        while (L.size() > 1) {
            L.set(0, L.get(0) + L.get(L.size() - 1));
            L.remove(L.size() - 1);
            Collections.sort(L);
        }
        for (int i = 0; i < L.size(); i++) {
            System.out.print(L.get(i));
        }
    }
}
```

## 2.

Write a function that takes a string and returns a new string with all the consecutive duplicate characters collapsed into a single one.

Test input:

```
aaabbbccc
```

Expected output:

```
abc
```

```java
public static String removeDuplicate(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
        if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
            result += s.charAt(i);
        }
    }
    return result;
}
```


```

Expected output:

```
1
```

```java
public static int count(int[] a, int x) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
            count++;
        }
    }
    return count;
}
```

## 2.

Write a function that takes a string and returns a new string with all the consecutive duplicate characters collapsed into a single one.

Test input:

```
aaabbbccc
```

Expected output:

```
abc
```

```java
public static String removeDuplicate(String s) {
    String result = "";
    for (int i = 0; i < s.length(); i++) {
        if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
            result += s.charAt(i);
        }
    }
    return result;
}
```
/README.md
# Java

## 1.

Write a function that takes an array of integers and an integer and returns the number of occurrences of the integer in the array.

Test input:

```
[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
1
```

Expected output:

```
1
```

```java
public static int count(int[] a, int x) {
    int count = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] == x) {
            count++;
        }
    }
    return count;
}
```

Test input:

```
[1, 1, 1, 1, 1, 1, 1, 1, 1, 1]
1
