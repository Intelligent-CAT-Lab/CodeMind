
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
    int[] B = new int[N];
    for(int i=0;i<N;++i){
      B[i] = scan.nextInt();
    }
    int[] C = new int[N];
    for(int i=0;i<N;++i){
      C[i] = scan.nextInt();
    }
    int[] D = new int[N];
    for(int i=0;i<N;++i){
      D[i] = scan.nextInt();
    }
    int[] E = new int[N];
    for(int i=0;i<N;++i){
      E[i] = scan.nextInt();
    }
    int[] F = new int[N];
    for(int i=0;i<N;++i){
      F[i] = scan.nextInt();
    }
    int[] G = new int[N];
    for(int i=0;i<N;++i){
      G[i] = scan.nextInt();
    }
    int[] H = new int[N];
    for(int i=0;i<N;++i){
      H[i] = scan.nextInt();
    }
    int[] I = new int[N];
    for(int i=0;i<N;++i){
      I[i] = scan.nextInt();
    }
    int[] J = new int[N];
    for(int i=0;i<N;++i){
      J[i] = scan.nextInt();
    }
    for(int i=0;i<N;++i){
      System.out.print(A[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(B[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(C[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(D[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(E[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(F[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(G[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(H[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(I[i] + " ");
    }
    System.out.println();
    for(int i=0;i<N;++i){
      System.out.print(J[i] + " ");
    }
    System.out.println();
  }
}
      
```

python code:
```python
N = int(input())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
C = list(map(int,input().split()))
D = list(map(int,input().split()))
E = list(map(int,input().split()))
F = list(map(int,input().split()))
G = list(map(int,input().split()))
H = list(map(int,input().split()))
I = list(map(int,input().split()))
J = list(map(int,input().split()))
for i in range(N):
    print(A[i],end=' ')
print()
for i in range(N):
    print(B[i],end=' ')
print()
for i in range(N):
    print(C[i],end=' ')
print()
for i in range(N):
    print(D[i],end=' ')
print()
for i in range(N):
    print(E[i],end=' ')
print()
for i in range(N):
    print(F[i],end=' ')
print()
for i in range(N):
    print(G[i],end=' ')
print()
for i in range(N):
    print(H[i],end=' ')
print()
for i in range(N):
    print(I[i],end=' ')
print()
for i in range(N):
    print(J[i],end=' ')
print()
```

## p03484

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 3 4 5 6 7 8 9 10

Expected output:
1 2 3 4 5 6 7 8 9 10

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
    int[] B = new int[N];
    for(int i=0;i<N;++i){
      B[i] = scan.nextInt();
    }
    int[] C = new int[N];
    for(int i=0;i<N;++i){
      C[i] = scan.nextInt();
    }
    int[] D = new int[N];
    for(int i=0;i<N;++i){
      D[i] = scan.nextInt();
    }
    int[] E = new int[N];
    for(int i=0;i<N;++i){
      E[i] = scan.nextInt();
    }
    int[] F = new int[N];
    for(int i=0;i<N;++i){
      F[
