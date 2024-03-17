

```python
s = input()
counter = 0
for i in range(len(s)-1):
    if s[i] != s[i+1]:
        counter += 1
print(counter)
```

## 3.946

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10


```
import java.util.*;
public class p03946{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int counter=0;
    for(int i=0;i<arr.length;i++){
      if(arr[i]%2==0){
        counter++;
      }
    }
    System.out.println(counter);
  }
}
```

python code:

```python
arr = list(map(int, input().split()))
counter = 0
for i in range(len(arr)):
    if arr[i] % 2 == 0:
        counter += 1
print(counter)
```

## 3.947

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.*;
public class p03947{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum);
  }
}
```

python code:

```python
arr = list(map(int, input().split()))
sum = 0
for i in range(len(arr)):
    sum += arr[i]
print(sum)
```

## 3.948

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
5


```
import java.util.*;
public class p03948{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum/arr.length);
  }
}
```

python code:

```python
arr = list(map(int, input().split()))
sum = 0
for i in range(len(arr)):
    sum += arr[i]
print(sum//len(arr))
```

## 3.949

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.*;
public class p03949{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum);
  }
}
```

python code:

```python
arr = list(map(int, input().split()))
sum = 0
for i in range(len(arr)):
    sum += arr[i]
print(sum)
```

## 3.950

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
5


```
import java.util.*;
public class p03950{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum/arr.length);
  }
}
```

python code:

```python
arr = list(map(int, input().split()))
sum = 0
for i in range(len(arr)):
    sum += arr[i]
print(sum//len(arr))
```

## 3.951

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
55


```
import java.util.*;
public class p03951{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum);
  }
}
```

python code:

```python
arr = list(map(int, input().split()))
sum = 0
for i in range(len(arr)):
    sum += arr[i]
print(sum)
```

## 3.952

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
5


```
import java.util.*;
public class p03952{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[] arr=new int[10];
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sc.close();
    int sum=0;
    for(int i=0;i<arr.length;i++){
      sum+=arr[i];
    }
    System.out.println(sum/arr.length);
  }
}
```

python code:

```python
arr = list(map(int, input().split()))
sum = 0
for i in range(len(arr)):
    sum += arr[i]
