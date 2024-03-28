

```python
S = input()
ans = 0
if len(S)%2 == 0:
    if S[len(S)//2-1] != S[len(S)//2]:
        print(len(S)//2)
        exit()
    else:
        S = S[:len(S)//2] + S[len(S)//2+1:]
        ans = 1
mid = len(S)//2
for i in range(1,len(S)-mid+1):
    if i+mid == len(S) or S[mid+i] != S[mid] or S[mid-i] != S[mid]:
        ans += mid + i
        break
print(ans)
```

## p03483

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10


```
import java.util.Scanner;
 
class p03483{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    for(int i=0;i<N;++i){
      A[i] = scan.nextInt();
    }
    for(int i=0;i<N;++i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
  }
}
      
```

python code:

```python
N = int(input())
A = list(map(int,input().split()))
for i in range(N):
    print(A[i],end=' ')
print()
```

## p03484

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
10 9 8 7 6 5 4 3 2 1


```
import java.util.Scanner;
 
class p03484{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    for(int i=0;i<N;++i){
      A[i] = scan.nextInt();
    }
    for(int i=N-1;i>=0;--i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
  }
}
      
```

python code:

```python
N = int(input())
A = list(map(int,input().split()))
for i in range(N-1,-1,-1):
    print(A[i],end=' ')
print()
```

## p03485

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1


```
import java.util.Scanner;
 
class p03485{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    for(int i=0;i<N;++i){
      A[i] = scan.nextInt();
    }
    for(int i=0;i<N;++i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
    for(int i=N-1;i>=0;--i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
  }
}
      
```

python code:

```python
N = int(input())
A = list(map(int,input().split()))
for i in range(N):
    print(A[i],end=' ')
print()
for i in range(N-1,-1,-1):
    print(A[i],end=' ')
print()
```

## p03486

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1


```
import java.util.Scanner;
 
class p03486{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int[] A = new int[N];
    for(int i=0;i<N;++i){
      A[i] = scan.nextInt();
    }
    for(int i=0;i<N;++i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
    for(int i=N-1;i>=0;--i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
    for(int i=N-1;i>=0;--i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
  }
}
      
```

python code:

```python
N = int(input())
A = list(map(int,input().split()))
for i in range(N):
    print(A[i],end=' ')
print()
for i in range(N-1,-1,-1):
    print(A[i],end=' ')
print()
for i in range(N):
    print(A[i],end=' ')
print()
for i in range(N-1,-1,-1):
    print(A[i],end=' ')
print()
```

## p03487

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 5 4 3 2 1
1 2 3 4 5 6 7 8 9 10
10 9 8 7 6 
