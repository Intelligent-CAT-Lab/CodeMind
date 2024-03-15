
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(f(s));
    }

    public static String f(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                return "Bad";
            }
        }
        return "Good";
    }
}
```

## 2.
Write a function that takes a list of strings and returns a single string that is each of the strings had are placed in alphabetical order and separated by a space.

```python
def f(l):
    return ' '.join(sorted(l))
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("a", "b", "c");
        System.out.println(f(l));
    }

    public static String f(List<String> l) {
        l.sort(String::compareTo);
        return String.join(" ", l);
    }
}
```

## 3.
Write a function that takes a list of integers and returns the count of positive numbers in the list.

```python
def f(l):
    return len([x for x in l if x > 0])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int count = 0;
        for (int i : l) {
            if (i > 0) {
                count++;
            }
        }
        return count;
    }
}
```

## 4.
Write a function that takes a list of strings and returns a single string that is each of the strings had are placed in the reverse order and separated by a space.

```python
def f(l):
    return ' '.join(l[::-1])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("a", "b", "c");
        System.out.println(f(l));
    }

    public static String f(List<String> l) {
        StringBuilder sb = new StringBuilder();
        for (int i = l.size() - 1; i >= 0; i--) {
            sb.append(l.get(i)).append(" ");
        }
        return sb.toString();
    }
}
```

## 5.
Write a function that takes a list of integers and returns the sum of the squares of the numbers in the list.

```python
def f(l):
    return sum([x**2 for x in l])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i * i;
        }
        return sum;
    }
}
```

## 6.
Write a function that takes a list of integers and returns the sum of the squares of the numbers in the list.

```python
def f(l):
    return sum([x**2 for x in l])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i * i;
        }
        return sum;
    }
}
```

## 7.
Write a function that takes a list of integers and returns the sum of the squares of the numbers in the list.

```python
def f(l):
    return sum([x**2 for x in l])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i * i;
        }
        return sum;
    }
}
```

## 8.
Write a function that takes a list of integers and returns the sum of the squares of the numbers in the list.

```python
def f(l):
    return sum([x**2 for x in l])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i * i;
        }
        return sum;
    }
}
```

## 9.
Write a function that takes a list of integers and returns the sum of the squares of the numbers in the list.

```python
def f(l):
    return sum([x**2 for x in l])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i * i;
        }
        return sum;
    }
}
```

## 10.
Write a function that takes a list of integers and returns the sum of the squares of the numbers in the list.

```python
def f(l):
    return sum([x**2 for x in l])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i * i;
        }
        return sum;
    }
}
```


## 10.
Write a function that takes a list of integers and returns the sum of the squares of the numbers in the list.

```python
def f(l):
    return sum([x**2 for x in l])
```

java code:
```java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(f(l));
    }

    public static int f(List<Integer> l) {
        int sum = 0;
        for (int i : l) {
            sum += i
