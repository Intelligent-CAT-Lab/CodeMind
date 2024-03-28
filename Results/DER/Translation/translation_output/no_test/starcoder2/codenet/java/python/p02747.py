
```
S = input()
ans = "Yes"

if len(S) % 2 == 1:
    ans = "No"
else:
    for i in range(0, len(S), 2):
        if S[i:i+2] != "hi":
            ans = "No"

print(ans)
```


```

python code:
```
N = int(input())

if N % 2 == 0:
    print(N)
else:
    print(N * 2)
```
/p02747.md
# p02747

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02747 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N % 2 == 0){
            System.out.println(N);
        } else {
            System.out.println(N * 2);
        }

    }

}/p02748.md
# p02748

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02748 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ans = 0;  ans = 1;
        } else {
            for(int i=2;i<=N;i++){
                ans = ans + i;
            }
        }

        System.out.println(ans);

    }

}








```

python code:
```
N = int(input())

ans = 0

if N == 1:
    ans = 1
else:
    for i in range(2, N+1):
        ans += i

print(ans)
```


        if(N == 1){
          /p02749.md
# p02749

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02749 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int ans = 0;

        for(int i=1;i<=N;i++){
            if(i % 3 == 0 || i % 5 == 0){
                ans += i;
            }
        }

        System.out.println(ans);

    }

}








```

python code:
```
N = int(input())

ans = 0

for i in range(1, N+1):
    if i % 3 == 0 or i % 5 == 0:
        ans += i

print(ans)
```
/p02750.md
# p02750

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02750 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for(int i=0;i<N;i++){
            System.out.println(A[i]);
        }

    }

}








```

python code:
```
N = int(input())

A = []

for i in range(N):
    A.append(int(input()))

A.sort()

for i in range(N):
    print(A[i])
```
/p02751.md
# p02751

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02751 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] A = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }

        Arrays.sort(A);

        for(int i=N-1;i>=0;i--){
            System.out.println(A[i]);
        }

    }

}








```

python code:
```
N = int(input())

A = []

for i in range(N):
    A.append(int(input()))

A.sort()

for i in range(N-1, -1, -1):
    print(A[i])
```

# p02752

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02752 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextnt(input())
B = int(input())
C = int(input())

if A > B:
    A, B = B, A
if B > C:
    B, C = C, B
if A > B:
    A, B = B, A

print(A, B, C)
```
Int();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A > B){
            int tmp = A;
            A = B;
            B = tmp;
        }

        if(B > C){
            int tmp = B;
            B = C;
            C = tmp;
        }

        if(A > B){
            int tmp = A;
            A = B;
            B = tmp;
        }

        System.out.println(A + " " + B + " " + C);

    }

}








```

python code:
```
A = int(input())
B = int(input())
C = int(input())

if A > B:
    A, B = B, A
if B > C:
    B, C = C, B
if A > B:
    A, B = B, A

print(A, B, C)
```

# p02753

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02753 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if(N % 4 == 0 && N % 100 != 0 || N % 400 == 0){
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }

}








```

python code:
```
N = int(input())

if N % 4 == 0 and N % 100 != 0 or N % 400 == 0:
    print("1")
else:
    print("0")
```

# p02754

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02754 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        if(S.equals("A")){
            System.out.println(4.0);
        } else if(S.equals("B")){
            System.out.println(3.0);
        } else if(S.equals("C")){
            System.out.println(2.0);
        } else if(S.equals("D")){
            System.out.println(1.0);
        } else
