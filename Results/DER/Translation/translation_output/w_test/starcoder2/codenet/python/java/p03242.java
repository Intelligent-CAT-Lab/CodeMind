
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String moji = sc.next();
        String ans = "";
        for (int i = 0; i < moji.length(); i++) {
            if (moji.charAt(i) == '1') {
                ans += "9";
            } else {
                ans += "1";
            }
        }
        System.out.println(ans);
    }
}
```

## 10. 1000000007

Write a program that reads an integer and prints the remainder when it is divided by 1000000007.

### Input

Input is given from Standard Input in the following format:

```
n
```

### Output

Print the remainder when n is divided by 1000000007.

### Constraints

* 1 ≤ n ≤ 10^18

### Sample Input 1

```
1000000000000000000
```

### Sample Output 1

```
1
```

### Sample Input 2

```
1000000007
```

### Sample Output 2

```
0
```

### Sample Input 3

```
1000000008
```

### Sample Output 3

```
1
```

### Sample Input 4

```
1000000009
```

### Sample Output 4

```
2
```

### Sample Input 5

```
1000000010
```

### Sample Output 5

```
3
```

### Sample Input 6

```
1000000011
```

### Sample Output 6

```
4
```

### Sample Input 7

```
1000000012
```

### Sample Output 7

```
5
```

### Sample Input 8

```
1000000013
```

### Sample Output 8

```
6
```

### Sample Input 9

```
1000000014
```

### Sample Output 9

```
7
```

### Sample Input 10

```
1000000015
```

### Sample Output 10

```
8
```

### Sample Input 11

```
1000000016
```

### Sample Output 11

```
9
```

### Sample Input 12

```
1000000017
```

### Sample Output 12

```
10
```

### Sample Input 13

```
1000000018
```

### Sample Output 13

```
11
```

### Sample Input 14

```
1000000019
```

### Sample Output 14

```
12
```

### Sample Input 15

```
1000000020
```

### Sample Output 15

```
13
```

### Sample Input 16

```
1000000021
```

### Sample Output 16

```
14
```

### Sample Input 17

```
1000000022
```

### Sample Output 17

```
15
```

### Sample Input 18

```
1000000023
```

### Sample Output 18

```
16
```

### Sample Input 19

```
1000000024
```

### Sample Output 19

```
17
```

### Sample Input 20

```
1000000025
```

### Sample Output 20

```
18
```

### Sample Input 21

```
1000000026
```

### Sample Output 21

```
19
```

### Sample Input 22

```
1000000027
```

### Sample Output 22

```
20
```

### Sample Input 23

```
1000000028
```

### Sample Output 23

```
21
```

### Sample Input 24

```
1000000029
```

### Sample Output 24

```
22
```

### Sample Input 25

```
1000000030
```

### Sample Output 25

```
23
```

### Sample Input 26

```
1000000031
```

### Sample Output 26

```
24
```

### Sample Input 27

```
1000000032
```

### Sample Output 27

```
25
```

### Sample Input 28

```
1000000033
```

### Sample Output 28

```
26
```

### Sample Input 29

```
1000000034
```

### Sample Output 29

```
27
```

### Sample Input 30

```
1000000035
```

### Sample Output 30

```
28
```

### Sample Input 31

```
1000000036
```

### Sample Output 31

```
29
```

### Sample Input 32

```
1000000037
```

### Sample Output 32

```
30
```

### Sample Input 33

```
1000000038
```

### Sample Output 33

```
31
```

### Sample Input 34

```
1000000039
```

### Sample Output 34

```
32
```

### Sample Input 35

```
1000000040
```

### Sample Output 35

```
33
```

### Sample Input 36

```
1000000041
```

### Sample Output 36

```
34
```

### Sample Input 37

```
1000000042
```

### Sample Output 37

```
35
```

### Sample Input 38

```
1000000043
```

### Sample Output 38

```
36
```

### Sample Input 39

```
1000000044
```

### Sample Output 39

```
37
```

### Sample Input 40

```
1000000045
```

### Sample Output 40

```
38
```

### Sample Input 41

```
1000000046
```

### Sample Output 41

```
39
```

### Sample Input 42

```
1000000047
```

### Sample Output 42

```
40
```

### Sample Input 43

```
1000000048
```

### Sample Output 43

```
41
```

### Sample Input 44

```
