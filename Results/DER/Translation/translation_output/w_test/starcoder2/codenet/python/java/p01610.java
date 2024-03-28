

```java

```

## 2.

Write a function that takes a string as input and returns the string reversed.

Example:
Given s = "hello", return "olleh".

```java

```
/README.md
# 2018-1-OSS-L6

## 1.

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
R

Expected output:
..ry....
..ry....
ggyobbrw
ggyobbrw
..ow....
..ow....


```
def rotate(s,k):
    s_ = [[s[i][j] for j in range(8)] for i in range(6)]
    if k == "R":
        s_[0][3] = s[2][3]
        s_[1][3] = s[3][3]
        s_[2][3] = s[4][3]
        s_[3][3] = s[5][3]

        s_[4][3] = s[3][6]
        s_[5][3] = s[2][6]
        s_[3][6] = s[0][3]
        s_[2][6] = s[1][3]

        s_[2][4] = s[3][4]
        s_[3][4] = s[3][5]
        s_[3][5] = s[2][5]
        s_[2][5] = s[2][4]

    elif k == "L":
        s_[0][2] = s[3][7]
        s_[1][2] = s[2][7]
        s_[2][2] = s[0][2]
        s_[3][2] = s[1][2]

        s_[4][2] = s[2][2]
        s_[5][2] = s[3][2]
        s_[3][7] = s[4][2]
        s_[2][7] = s[5][2]

        s_[2][1] = s[2][0]
        s_[2][0] = s[3][0]
        s_[3][0] = s[3][1]
        s_[3][1] = s[2][1]

    elif k == "U":
        s_[2][0] = s[2][2]
        s_[2][1] = s[2][3]
        s_[2][2] = s[2][4]
        s_[2][3] = s[2][5]

        s_[2][4] = s[2][6]
        s_[2][5] = s[2][7]
        s_[2][6] = s[2][0]
        s_[2][7] = s[2][1]

        s_[0][2] = s[1][2]
        s_[1][2] = s[1][3]
        s_[1][3] = s[0][3]
        s_[0][3] = s[0][2]

    elif k == "D":
        s_[3][0] = s[3][6]
        s_[3][1] = s[3][7]
        s_[3][2] = s[3][0]
        s_[3][3] = s[3][1]

        s_[3][4] = s[3][2]
        s_[3][5] = s[3][3]
        s_[3][6] = s[3
