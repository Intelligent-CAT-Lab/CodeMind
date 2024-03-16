
```
a, b, c = map(int, input().split())
if b + c < a:
    print(0)
else:
    print(b + c - a)
```

## 2952

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02952 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          int d = sc.nextInt();
          if(a + b + c + d < 10){
              System.out.println(0);
          } else {
            System.out.println(a + b + c + d);
          }
        }
    }
```

python code:
```
a, b, c, d = map(int, input().split())
if a + b + c + d < 10:
    print(0)
else:
    print(a + b + c + d)
```

## 2953

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02953 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int max = 0;
          int max_index = 0;
          for(int i = 0; i < 5; i++){
              int sum = 0;
              for(int j = 0; j < 4; j++){
                  sum += sc.nextInt();
              }
              if(sum > max){
                  max = sum;
                  max_index = i + 1;
              }
          }
          System.out.println(max_index + " " + max);
        }
    }
```

python code:
```
max_index = 0
max_score = 0
for i in range(5):
    score = sum(map(int, input().split()))
    if score > max_score:
        max_score = score
        max_index = i + 1
print(max_index, max_score)
```

## 2954

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02954 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
          for(int i = 0; i < s.length(); i++){
              if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'){
                  i += 2;
              }
              System.out.print(s.charAt(i));
          }
        }
    }
```

python code:
```
s = input()
for i in range(len(s)):
    if s[i] in 'aeiou':
        i += 2
    print(s[i], end='')
```

## 2960

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02960 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int k = sc.nextInt();
          boolean[] is_prime = new boolean[n + 1];
          Arrays.fill(is_prime, true);
          int count = 0;
          for(int i = 2; i <= n; i++){
              if(is_prime[i]){
                  for(int j = i; j <= n; j += i){
                      if(is_prime[j]){
                          count++;
                          if(count == k){
                              System.out.println(j);
                              return;
                          }
                          is_prime[j] = false;
                      }
                  }
              }
          }
        }
    }
```

python code:
```
n, k = map(int, input().split())
is_prime = [True] * (n + 1)
count = 0
for i in range(2, n + 1):
    if is_prime[i]:
        for j in range(i, n + 1, i):
            if is_prime[j]:
                count += 1
                if count == k:
                    print(j)
                    return
                is_prime[j] = False
```

## 2961

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02961 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int[] s = new int[n];
          int[] b = new int[n];
          for(int i = 0; i < n; i++){
              s[i] = sc.nextInt();
              b[i] = sc.nextInt();
          }
          int min = Integer.MAX_VALUE;
          for(int i = 1; i < (1 << n); i++){
              int s_sum = 1;
              int b_sum = 0;
              for(int j = 0; j < n; j++){
                  if((i & (1 << j)) > 0){
                      s_sum *= s[j];
                      b_sum += b[j];
                  }
              }
              min = Math.min(min, Math.abs(s_sum - b_sum));
          }
          System.out.println(min);
        }
    }
```

python code:
```
n = int(input())
s = []
b = []
for _ in range(n):
    s_i, b_i = map(int, input().split())
    s.append(s_i)
    b.append(b_i)
min_diff = float('inf')
for i in range(1, 1 << n):
    s_sum = 1
    b_sum = 0
    for j in range(n):
        if (i & (1 << j)) > 0:
            s_sum *= s[j]
            b_sum += b[j]
    min_diff = min(min_diff, abs(s_sum - b_sum))
print(min_diff)
```

## 2965

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02965 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          System.out.println(Math.max(b - a, c - b) - 1);
        }
    }
```

python code:
```
a, b, c = map(int, input().split())
print(max(b - a, c - b) - 1)
```

## 2966

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02966 {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          String s = sc.next();
          int[] a = new int[n];
          int[] b = new int[n];
          int[] c = new int[n];
          for(int i = 0; i < n; i++){
              a[i] = (i % 3) + 1;
              b[i] = (i % 4) + 1;
              c[i] = (i % 6) + 1;
          }
          int a_count = 0;
          int b_count = 0;
          int c_count = 0;
          for(int i = 0; i < n; i++){
              if(s.charAt(i) - 'A' + 1 == a[i]){
                  a_count++;
