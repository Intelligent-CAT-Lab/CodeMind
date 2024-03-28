

```python
X = int(input())
prime = X
mid = prime // 2
flag = False

while True:
    for i in range(2, mid + 1):
        if prime % i == 0:
            flag = True
            break
    if not flag:
        break
    else:
        flag = False
    prime += 1

print(prime)
```

## 2.

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000000000000000000

Expected output:
1000000000000000000


```
import java.util.Scanner;

public class atcoder_ABC149_D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] R = new int[N];
        int[] S = new int[N];
        int[] P = new int[N];
        int[] T = new int[N];
        int[] score = new int[N];
        int[] max = new int[N];
        int[] max_index = new int[N];
        int[] max_score = new int[N];
        int[] max_score_index = new int[N];
        int[] max_score_index_2 = new int[N];
        int[] max_score_index_3 = new int[N];
        int[] max_score_index_4 = new int[N];
        int[] max_score_index_5 = new int[N];
        int[] max_score_index_6 = new int[N];
        int[] max_score_index_7 = new int[N];
        int[] max_score_index_8 = new int[N];
        int[] max_score_index_9 = new int[N];
        int[] max_score_index_10 = new int[N];
        int[] max_score_index_11 = new int[N];
        int[] max_score_index_12 = new int[N];
        int[] max_score_index_13 = new int[N];
        int[] max_score_index_14 = new int[N];
        int[] max_score_index_15 = new int[N];
        int[] max_score_index_16 = new int[N];
        int[] max_score_index_17 = new int[N];
        int[] max_score_index_18 = new int[N];
        int[] max_score_index_19 = new int[N];
        int[] max_score_index_20 = new int[N];
        int[] max_score_index_21 = new int[N];
        int[] max_score_index_22 = new int[N];
        int[] max_score_index_23 = new int[N];
        int[] max_score_index_24 = new int[N];
        int[] max_score_index_25 = new int[N];
        int[] max_score_index_26 = new int[N];
        int[] max_score_index_27 = new int[N];
        int[] max_score_index_28 = new int[N];
        int[] max_score_index_29 = new int[N];
        int[] max_score_index_30 = new int[N];
        int[] max_score_index_31 = new int[N];
        int[] max_score_index_32 = new int[N];
        int[] max_score_index_33 = new int[N];
        int[] max_score_index_34 = new int[N];
        int[] max_score_index_35 = new int[N];
        int[] max_score_index_36 = new int[N];
        int[] max_score_index_37 = new int[N];
        int[] max_score_index_38 = new int[N];
        int[] max_score_index_39 = new int[N];
        int[] max_score_index_40 = new int[N];
        int[] max_score_index_41 = new int[N];
        int[] max_score_index_42 = new int[N];
        int[] max_score_index_43 = new int[N];
        int[] max_score_index_44 = new int[N];
        int[] max_score_index_45 = new int[N];
        int[] max_score_index_46 = new int[N];
        int[] max_score_index_47 = new int[N];
        int[] max_score_index_48 = new int[N];
        int[] max_score_index_49 = new int[N];
        int[] max_score_index_50 = new int[N];
        int[] max_score_index_51 = new int[N];
        int[] max_score_index_52 = new int[N];
        int[] max_score_index_53 = new int[N];
        int[] max_score_index_54 = new int[N];
        int[] max_score_index_55 = new int[N];
        int[] max_score_index_56 = new int[N];
        int[] max_score_index_57 = new int[N];
        int[] max_score_index_58 = new int[N];
        int[] max_score_index_59 = new int[N];
        int[] max_score_index_60 = new int[N];
        int[] max_score_index_61 = new int[N];
        int[] max_score_index_62 = new int[N];
        int[] max_score_index_63 = new int[N];
        int[] max_score_index_64 = new int[N];
        int[] max_score_index_65 = new int[N];
        int[] max_score_index_66 = new int[N];
        int[] max_score_index_67 = new int[N];
        int[] max_score_index_68 = new int[N];
        int[] max_score_index_69 = new int[N];
        int[] max_score_index_70 = new int[N];
        int[] max_score_index_71 = new int[N];
        int[] max_score_index_72 = new int[N];
        int[] max_score_index_73 = new int[N];
        int[] max_score_index_74 = new int[N];
        int[] max_score_index_75 = new int[N];
        int[] max_score_index_76 = new int[N];
        int[] max_score_index_77 = new int[N];
        int[] max_score_index_78 = new int[N];
        int[] max_score_index_79 = new int[N];
        int[] max_score_index_80 = new int[N];
        int[] max_score_index_81 = new int[N];
        int[] max_score_index_82 = new int[N];
        int[] max_score_index_83 = new int[N];
        int[] max_score_index_84 = new int[N];
        int[] max_score_index_85 = new int[N];
        int[] max_score_index_86 = new int[N];
        int[] max_score_index_87 = new int[N];
        int[] max_score_index_88 = new int[N];
        int[] max_score_index_89 = new int[N];
        int[] max_score_index_90 = new
