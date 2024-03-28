
```
n = int(input())
str = ""
for i in range(1, n+1):
    str += str(i)

def permutation(q, ans):
    if len(q) <= 1:
        if len(ans) != 0:
            ans += " "
        print(ans + q)
    else:
        for i in range(len(q)):
            if len(ans) == 0:
                permutation(q[:i] + q[i+1:], ans + q[i])
            else:
                permutation(q[:i] + q[i+1:], ans + " " + q[i])

permutation(str, "")
```

## 2.4.51

### 2.4.51.1

Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p02451 { 
    static Scanner scan = new Scanner(System.in);
  
    public static void main(String[] args) { 
        
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = scan.nextInt();
        }
        
        int[] ans = new int[n];
        int[] ans2 = new int[n];
        int[] ans3 = new int[n];
        int[] ans4 = new int[n];
        int[] ans5 = new int[n];
        int[] ans6 = new int[n];
        int[] ans7 = new int[n];
        int[] ans8 = new int[n];
        int[] ans9 = new int[n];
        int[] ans10 = new int[n];
        int[] ans11 = new int[n];
        int[] ans12 = new int[n];
        int[] ans13 = new int[n];
        int[] ans14 = new int[n];
        int[] ans15 = new int[n];
        int[] ans16 = new int[n];
        int[] ans17 = new int[n];
        int[] ans18 = new int[n];
        int[] ans19 = new int[n];
        int[] ans20 = new int[n];
        int[] ans21 = new int[n];
        int[] ans22 = new int[n];
        int[] ans23 = new int[n];
        int[] ans24 = new int[n];
        int[] ans25 = new int[n];
        int[] ans26 = new int[n];
        int[] ans27 = new int[n];
        int[] ans28 = new int[n];
        int[] ans29 = new int[n];
        int[] ans30 = new int[n];
        int[] ans31 = new int[n];
        int[] ans32 = new int[n];
        int[] ans33 = new int[n];
        int[] ans34 = new int[n];
        int[] ans35 = new int[n];
        int[] ans36 = new int[n];
        int[] ans37 = new int[n];
        int[] ans38 = new int[n];
        int[] ans39 = new int[n];
        int[] ans40 = new int[n];
        int[] ans41 = new int[n];
        int[] ans42 = new int[n];
        int[] ans43 = new int[n];
        int[] ans44 = new int[n];
        int[] ans45 = new int[n];
        int[] ans46 = new int[n];
        int[] ans47 = new int[n];
        int[] ans48 = new int[n];
        int[] ans49 = new int[n];
        int[] ans50 = new int[n];
        int[] ans51 = new int[n];
        int[] ans52 = new int[n];
        int[] ans53 = new int[n];
        int[] ans54 = new int[n];
        int[] ans55 = new int[n];
        int[] ans56 = new int[n];
        int[] ans57 = new int[n];
        int[] ans58 = new int[n];
        int[] ans59 = new int[n];
        int[] ans60 = new int[n];
        int[] ans61 = new int[n];
        int[] ans62 = new int[n];
        int[] ans63 = new int[n];
        int[] ans64 = new int[n];
        int[] ans65 = new int[n];
        int[] ans66 = new int[n];
        int[] ans67 = new int[n];
        int[] ans68 = new int[n];
        int[] ans69 = new int[n];
        int[] ans70 = new int[n];
        int[] ans71 = new int[n];
        int[] ans72 = new int[n];
        int[] ans73 = new int[n];
        int[] ans74 = new int[n];
        int[] ans75 = new int[n];
        int[] ans76 = new int[n];
        int[] ans77 = new int[n];
        int[] ans78 = new int[n];
        int[] ans79 = new int[n];
        int[] ans80 = new int[n];
        int[] ans81 = new int[n];
        int[] ans82 = new int[n];
        int[] ans83 = new int[n];
        int[] ans84 = new int[n];
        int[] ans85 = new int[n];
        int[] ans86 = new int[n];
        int[] ans87 = new int[n];
        int[] ans88 = new int[n];
        int[] ans89 = new int[n];
        int[] ans90 = new int[n];
        int[] ans91 = new int[n];
        int[] ans92 = new int[n];
        int[] ans93 = new int[n];
        int[] ans94 = new int[n];
        int[] ans95 = new int[n];
        int[] ans96 = new int[n];
        int[] ans97 = new int[n];
        int[] ans98 = new int[n];
        int[] ans99 = new int[n];
        int[] ans100 = new int[n];
        int[] ans101 = new int[n];
        int[] ans102 = new int[n];
        int[] ans103 = new int[n];
        int[] ans104 = new int[n];
        int[] ans105 = new int[n];
        int[] ans106 = new int[n];
        int[] ans107 = new int[n];
        int[] ans108 = new int[n];
        int[] ans109 = new int[n];
        int[] ans110 = new int[n];
        int[] ans111 = new int[n];
