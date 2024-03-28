
```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = 0;
        if (length % arr[0] == 0) {
            System.out.println(length / arr[0]);
            return;
        }
        if (arr[0] == arr[1]) {
            for (int i = 0; i < length / arr[2] + 1; i++) {
                int check = length - i * arr[2];
                if (check >= 0 && check % arr[0] == 0) {
                    ans = Math.max(ans, check / arr[0] + i);
                }
            }
        } else {
            for (int i = 0; i < length / arr[2] + 1; i++) {
                for (int j = 0; j < length / arr[1] + 1; j++) {
                    int check = length - i * arr[2] - j * arr[1];
                    if (check >= 0 && check % arr[0] == 0) {
                        ans = Math.max(ans, check / arr[0] + i + j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}
```

## 2.

### 2.1

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + 1
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + 1;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.2

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.3

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.4

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.5

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.6

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.7

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.8

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.9

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.10

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

### 2.11

```
def f ( x ) :
    if ( x == 0 ) :
        return 0
    return f ( x - 1 ) + x
print ( f ( 5 ) )
```

```
public static int f(int x) {
    if (x == 0) {
        return 0;
    }
    return f(x - 1) + x;
}

public static void main(String[] args) {
    System.out.println(f(5));
}
```

###
