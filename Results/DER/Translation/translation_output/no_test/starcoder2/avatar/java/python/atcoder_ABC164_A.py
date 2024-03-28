
```
import sys

scList = []

scList.append(input())

numlist = scList[0].split(" ")
Sheep = int(numlist[0])
Wolve = int(numlist[1])

if Wolve >= Sheep:
    print("unsafe")
else:
    print("safe")
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_B {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int A = Integer.parseInt(numlist[0]);
        int B = Integer.parseInt(numlist[1]);
        int C = Integer.parseInt(numlist[2]);
        int D = Integer.parseInt(numlist[3]);

        while (A > 0 && C > 0) {
            C -= B;
            if (C <= 0) {
                System.out.println("Yes");
                return;
            }
            A -= D;
        }
        System.out.println("No");
    }
}
```

python code:
```
import sys

scList = []

scList.append(input())

numlist = scList[0].split(" ")
A = int(numlist[0])
B = int(numlist[1])
C = int(numlist[2])
D = int(numlist[3])

while A > 0 and C > 0:
    C -= B
    if C <= 0:
        print("Yes")
        sys.exit()
    A -= D
print("No")
```

## 3.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_C {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        int N = Integer.parseInt(scList.get(0));
        scList.add(scan.nextLine());

        String[] sList = scList.get(1).split(" ");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sList[i]);
        }
        System.out.println(set.size());
    }
}
```

python code:
```
import sys

scList = []

scList.append(input())

N = int(scList[0])
scList.append(input())

sList = scList[1].split(" ")
set = set(sList)
print(len(set))
```

## 4.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_D {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String S = scList.get(0);
        int len = S.length();
        int ans = 0;
        for (int i = 0; i < len - 3; i++) {
            for (int j = i + 4; j <= len; j++) {
                int num = Integer.parseInt(S.substring(i, j));
                if (num % 2019 == 0) {
                    ans++;
                }
            }
        }
        System.out.println(ans);
    }
}
```

python code:
```
import sys

scList = []

scList.append(input())

S = scList[0]
len = len(S)
ans = 0
for i in range(len - 3):
    for j in range(i + 4, len + 1):
        num = int(S[i:j])
        if num % 2019 == 0:
            ans += 1
print(ans)
```

## 5.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_E {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList.add(scan.nextLine());

        String[] numlist = scList.get(0).split(" ");
        int N = Integer.parseInt(numlist[0]);
        int M = Integer.parseInt(numlist[1]);
        int S = Integer.parseInt(numlist[2]);
        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int[] D = new int[N];
        for (int i = 0; i < N; i++) {
            scList.add(scan.nextLine());
            numlist = scList.get(i + 1).split(" ");
            A[i] = Integer.parseInt(numlist[0]);
            B[i] = Integer.parseInt(numlist[1]);
            C[i] = Integer.parseInt(numlist[2]);
            D[i] = Integer.parseInt(numlist[3]);
        }
        int[] dp = new int[S + 1];
        for (int i = 0; i < N; i++) {
            for (int j = S; j >= 0; j--) {
                if (j - B[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - B[i]] + A[i]);
                }
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= S; j++) {
                if (j - C[i] >= 0) {
                    dp[j] = Math.max(dp[j], dp[j - C[i]] - D[i]);
                }
            }
        }
        System.out.println(dp[S]);
    }
}
```

python code:
```
import sys

scList = []

scList.append(input())

numlist = scList[0].split(" ")
N = int(numlist[0])
M = int(numlist[1])
S = int(numlist[2])
A = []
B = []
C = []
D = []
for i in range(N):
    scList.append(input())
    numlist = scList[i + 1].split(" ")
    A.append(int(numlist[0]))
    B.append(int(numlist[1]))
    C.append(int(numlist[2]))
    D.append(int(numlist[3]))
dp = [0] * (S + 1)
for i in range(N):
    for j in range(S, -1, -1):
        if j - B[i] >= 0:
            dp[j] = max(dp[j], dp[j - B[i]] + A[i])
for i in range(N):
    for j in range(S + 1):
        if j - C[i] >= 0:
            dp[j] = max(dp[j], dp[j - C[i]] - D[i])
print(dp[S])
```

## 6.

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class atcoder_ABC164_F {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> scList = new ArrayList<>();

        scList
