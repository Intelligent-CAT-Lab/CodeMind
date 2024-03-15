
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        int flag = 0;
        String[] answer = new String[moji.length()];

        for (int i = 0; i < moji.length(); i++) {
            if (flag == 1) {
                flag = 0;
                continue;
            }
            if (moji.charAt(i) == '2') {
                answer[i] = "k";
            } else if (moji.charAt(i) == '3') {
                answer[i] = "s";
            } else if (moji.charAt(i) == '4') {
                answer[i] = "t";
            } else if (moji.charAt(i) == '5') {
                answer[i] = "n";
            } else if (moji.charAt(i) == '6') {
                answer[i] = "h";
            } else if (moji.charAt(i) == '7') {
                answer[i] = "m";
            } else if (moji.charAt(i) == '8') {
                answer[i] = "y";
            } else if (moji.charAt(i) == '9') {
                answer[i] = "r";
            } else if (moji.charAt(i) == '0') {
                i++;
                flag = 1;
                if (moji.charAt(i) == 'T') {
                    answer[i] = "wa";
                } else if (moji.charAt(i) == 'D') {
                    answer[i] = "wo";
                } else if (moji.charAt(i) == 'U') {
                    answer[i] = "nn";
                }
            } else if (moji.charAt(i) == 'T') {
                answer[i] = "a";
            } else if (moji.charAt(i) == 'L') {
                answer[i] = "i";
            } else if (moji.charAt(i) == 'U') {
                answer[i] = "u";
            } else if (moji.charAt(i) == 'R') {
                answer[i] = "e";
            } else if (moji.charAt(i) == 'D') {
                answer[i] = "o";
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
        System.out.println();
    }
}
```

## 10. 1000000007

### 問題文

1000000007で割ったあまりを求めよ。

### 制約

- 1 <= N <= 1000000000

### 入力

```
N
```

### 出力

```
1000000007で割ったあまり
```

### 入力例1

```
1
```

### 出力例1

```
1
```

### 入力例2

```
1000000000
```

### 出力例2

```
1
```

### 入力例3

```
1000000007
```

### 出力例3

```
0
```

### 入力例4

```
1000000008
```

### 出力例4

```
1
```

### 入力例5

```
1000000009
```

### 出力例5

```
1
```

### 入力例6

```
1000000010
```

### 出力例6

```
1
```

### 入力例7

```
1000000011
```

### 出力例7

```
2
```

### 入力例8

```
1000000012
```

### 出力例8

```
3
```

### 入力例9

```
1000000013
```

### 出力例9

```
4
```

### 入力例10

```
1000000014
```

### 出力例10

```
5
```

### 入力例11

```
1000000015
```

### 出力例11

```
6
```

### 入力例12

```
1000000016
```

### 出力例12

```
7
```

### 入力例13

```
1000000017
```

### 出力例13

```
8
```

### 入力例14

```
1000000018
```

### 出力例14

```
9
```

### 入力例15

```
1000000019
```

### 出力例15

```
10
```

### 入力例16

```
1000000020
```

### 出力例16

```
11
```

### 入力例17

```
1000000021
```

### 出力例17

```
12
```

### 入力例18

```
1000000022
```

### 出力例18

```
13
```

### 入力例19

```
1000000023
```

### 出力例19

```
14
```

### 入力例20

```
1000000024
```

### 出力例20

```
15
```

### 入力例21

```
1000000025
```

### 出力例21

```
16
```

### 入力例22

```
1000000026
```

### 出力例22

```
17
```

### 入力例23

```
1000000027
```

### 出力例23

```
18
```

### 入力例24

```
1000000028
```

### 出力例24

```
19
```

### 入力例25

```
1000000029
```

### 出力例25

```
20
```

###
