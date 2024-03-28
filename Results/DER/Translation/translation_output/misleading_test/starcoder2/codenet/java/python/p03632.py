
```python
import sys

for line in sys.stdin:
    a, b, c, d = map(int, line.split())
    start = max(a, c)
    end = min(b, d)
    print(max(0, end - start))
```

## 3.6.3.3. 10039 - 평균 점수

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
100
90
80
70
60

Expected output:
75

```
import java.io.*;
import java.util.*;
 
public class p10039 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .mapToInt(Integer::parseInt)
                .map(score -> score < 40 ? 40 : score)
                .mapToDouble(score -> score)
                .average()
                .ifPresent(System.out::println);
        }
    }
}
```

python code:
```python
import sys

scores = [int(line) for line in sys.stdin]
scores = [score if score >= 40 else 40 for score in scores]
print(sum(scores) // len(scores))
```

## 3.6.3.4. 10818 - 최소, 최대

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5
20 10 35 30 7

Expected output:
7 35

```
import java.io.*;
import java.util.*;
 
public class p10818 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(in -> {
                    int n = in[0];
                    int[] arr = Arrays.copyOfRange(in, 1, in.length);
                    
                    int min = Arrays.stream(arr).min().getAsInt();
                    int max = Arrays.stream(arr).max().getAsInt();
                    System.out.println(min + " " + max);
                });
        }
    }
}
```

python code:
```python
import sys

n, *arr = map(int, sys.stdin.read().split())
print(min(arr), max(arr))
```

## 3.6.3.5. 2562 - 최댓값

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
29
10
30
1
20
4
5
300
6

Expected output:
300
8

```
import java.io.*;
import java.util.*;
 
public class p2562 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .mapToInt(Integer::parseInt)
                .map(i -> new int[]{i, i})
                .toArray(int[][]::new)
                .reduce((a, b) -> a[0] > b[0] ? a : b)
                .ifPresent(a -> System.out.println(a[0] + "\n" + a[1]));
        }
    }
}
```

python code:
```python
import sys

arr = [int(line) for line in sys.stdin]
max_val = max(arr)
print(max_val)
print(arr.index(max_val) + 1)
```

## 3.6.3.6. 2577 - 숫자의 개수

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
150
266
427

Expected output:
3
1
0
2
0
0
0
2
0
0

```
import java.io.*;
import java.util.*;
 
public class p2577 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .mapToInt(Integer::parseInt)
                .toArray()
                .reduce(1, (a, b) -> a * b)
                .toString()
                .chars()
                .mapToObj(i -> (char)i)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .forEach(System.out::println);
        }
    }
}
```

python code:
```python
import sys

a, b, c = map(int, sys.stdin.read().split())
result = str(a * b * c)
for i in range(10):
    print(result.count(str(i)))
```

## 3.6.3.7. 3052 - 나머지

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
39
40
41
42
43
44
45
46
47
48
49

Expected output:
10

```
import java.io.*;
import java.util.*;
 
public class p3052 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .mapToInt(Integer::parseInt)
                .map(i -> i % 42)
                .distinct()
                .count()
                .ifPresent(System.out::println);
        }
    }
}
```

python code:
```python
import sys

arr = [int(line) % 42 for line in sys.stdin]
print(len(set(arr)))
```

## 3.6.3.8. 1546 - 평균

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
40 80 60

Expected output:
75.0

```
import java.io.*;
import java.util.*;
 
public class p1546 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(in -> {
                    int n = in[0];
                    int[] arr = Arrays.copyOfRange(in, 1, in.length);
                    
                    double max = Arrays.stream(arr).max().getAsInt();
                    double sum = Arrays.stream(arr).mapToDouble(score -> score / max * 100).sum();
                    System.out.println(sum / n);
                });
        }
    }
}
```

python code:
```python
import sys

n, *arr = map(int, sys.stdin.read().split())
max_
