

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while(N > 0) {
            N--;
            res += (char)('a' + N % 26);
            N /= 26;
        }
        System.out.println(new StringBuilder(res).reverse().toString());
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times each character appears in the string.

Test input:

```
hello
```

Expected output:

```
h: 1
e: 1
l: 2
o: 1
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
```


```

Expected output:

```
1
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        String[] s = br.readLine().split(" ");
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int res = 0;
        for(int i = 0; i < N; i++) {
            if(arr[i] == 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times each character appears in the string.

Test input:

```
hello
```

Expected output:

```
h: 1
e: 1
l: 2
o: 1
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
```
/README.md
# Java-Python-Translation

## 1. 
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:


```
import sys 
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N = int(readline())
res = ''
while(N):
    N -= 1
    res += chr(ord('a') + N % 26)
    N //= 26
print(res[::-1])
```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while(N > 0) {
            N--;
            res += (char)('a' + N % 26);
            N /= 26;
        }
        System.out.println(new StringBuilder(res).reverse().toString());
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times each character appears in the string.

Test input:

```
hello
```

Expected output:

```
h: 1
e: 1
l: 2
o: 1
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
```

## 1. 
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:


```
import sys 
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N = int(readline())
res = ''
while(N):
    N -= 1
    res += chr(ord('a') + N % 26)
    N //= 26
print(res[::-1])
```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
        while(N > 0) {
            N--;
            res += (char)('a' + N % 26);
            N /= 26;
        }
        System.out.println(new StringBuilder(res).reverse().toString());
    }
}
```

## 2. 
Write a program that reads a string and prints the number of times each character appears in the string.

Test input:

```
hello
```

Expected output:

```
h: 1
e: 1
l: 2
o: 1
```

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for(char c : map.keySet()) {
            System.out.println(c + ": " + map.get(c));
        }
    }
}
```

## 1. 
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:


```
import sys 
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
N = int(readline())
res = ''
while(N):
    N -= 1
    res += chr(ord('a') + N % 26)
    N //= 26
print(res[::-1])
```

java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String res = "";
