

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

Expected output:
80


```
import java.io.*;
import java.util.*;
 
public class p10039 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .mapToInt(Integer::parseInt)
                .map(score -> score < 40 ? 40 : score)
                .mapToInt(score -> score)
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

## 3.6.3.5. 10871 - X보다 작은 수

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
10 5
1 10 4 9 2 3 8 5 7 6

Expected output:
1 4 2 3 5 6 7


```
import java.io.*;
import java.util.*;
 
public class p10871 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .map(line -> Arrays.stream(line.split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray())
                .forEach(in -> {
                    int n = in[0];
                    int x = in[1];
                    int[] arr = Arrays.copyOfRange(in, 2, in.length);
                    
                    Arrays.stream(arr)
                        .filter(num -> num < x)
                        .forEach(num -> System.out.print(num + " "));
                    System.out.println();
                });
        }
    }
}
```

python code:

```python
import sys

n, x, *arr = map(int, sys.stdin.read().split())
print(*[num for num in arr if num < x])
```

## 3.6.3.6. 1546 - 평균

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3
40 80 60

Expected output:
75.0000000000


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
                    
                    int max = Arrays.stream(arr).max().getAsInt();
                    double sum = Arrays.stream(arr)
                        .mapToDouble(score -> score / (double)max * 100)
                        .sum();
                    System.out.printf("%.10f%n", sum / n);
                });
        }
    }
}
```

python code:

```python
import sys

n, *arr = map(int, sys.stdin.read().split())
max_score = max(arr)
print(sum(map(lambda score: score / max_score * 100, arr)) / n)
```

## 3.6.3.7. 2562 - 최댓값

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
3
40

Expected output:
40
8


```
import java.io.*;
import java.util.*;
 
public class p2562 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.lines()
                .mapToInt(Integer::parseInt)
                .mapToObj(num -> new int[]{num, 0})
                .reduce((a, b) -> {
                    if (a[0] > b[0]) {
                        a[1]++;
                        return a;
                    } else {
                        b[1]++;
                        return b;
                    }
                })
                .ifPresent(num -> System.out.println(num[0] + "\n" + (num[1] + 1)));
        }
    }
}
```

python code:

```python
import sys

arr = [int(line) for line in sys.stdin]
max_num = max(arr)
print(max_num)
print(arr.index(max_num) + 1)
```

## 3.6.3.8. 2577 - 숫자의 개수

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
                .map(line -> Arrays.stream(line.split
