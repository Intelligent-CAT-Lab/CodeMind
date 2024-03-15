
```
n = int(input())
num = 7
res = 1

while num < n:
    num = num * 10 + 7
    res += 1

while True:
    if num % n == 0:
        break
    num %= n
    res += 1
    if num in set:
        res = -1
        break
    num = num * 10 + 7

print(res)
```

## 2. 1000000007

### 2.1. Description

Given a positive integer $N$, find the remainder when $1000000007$ is divided by $N$.

### 2.2. Input

The input is given in the following format.

```
N
```

### 2.3. Constraints

* $1 \leq N \leq 10^{18}$

### 2.4. Output

Print the remainder when $1000000007$ is divided by $N$.

### 2.5. Sample Input 1

```
1000000007
```

### 2.6. Sample Output 1

```
0
```

### 2.7. Sample Input 2

```
1000000008
```

### 2.8. Sample Output 2

```
1
```

### 2.9. Sample Input 3

```
1000000009
```

### 2.10. Sample Output 3

```
2
```

### 2.11. Sample Input 4

```
1000000010
```

### 2.12. Sample Output 4

```
3
```

### 2.13. Sample Input 5

```
1000000011
```

### 2.14. Sample Output 5

```
4
```

### 2.15. Sample Input 6

```
1000000012
```

### 2.16. Sample Output 6

```
5
```

### 2.17. Sample Input 7

```
1000000013
```

### 2.18. Sample Output 7

```
6
```

### 2.19. Sample Input 8

```
1000000014
```

### 2.20. Sample Output 8

```
7
```

### 2.21. Sample Input 9

```
1000000015
```

### 2.22. Sample Output 9

```
8
```

### 2.23. Sample Input 10

```
1000000016
```

### 2.24. Sample Output 10

```
9
```

### 2.25. Sample Input 11

```
1000000017
```

### 2.26. Sample Output 11

```
10
```

### 2.27. Sample Input 12

```
1000000018
```

### 2.28. Sample Output 12

```
11
```

### 2.29. Sample Input 13

```
1000000019
```

### 2.30. Sample Output 13

```
12
```

### 2.31. Sample Input 14

```
1000000020
```

### 2.32. Sample Output 14

```
13
```

### 2.33. Sample Input 15

```
1000000021
```

### 2.34. Sample Output 15

```
14
```

### 2.35. Sample Input 16

```
1000000022
```

### 2.36. Sample Output 16

```
15
```

### 2.37. Sample Input 17

```
1000000023
```

### 2.38. Sample Output 17

```
16
```

### 2.39. Sample Input 18

```
1000000024
```

### 2.40. Sample Output 18

```
17
```

### 2.41. Sample Input 19

```
1000000025
```

### 2.42. Sample Output 19

```
18
```

### 2.43. Sample Input 20

```
1000000026
```

### 2.44. Sample Output 20

```
19
```

### 2.45. Sample Input 21

```
1000000027
```

### 2.46. Sample Output 21

```
20
```

### 2.47. Sample Input 22

```
1000000028
```

### 2.48. Sample Output 22

```
21
```

### 2.49. Sample Input 23

```
1000000029
```

### 2.50. Sample Output 23

```
22
```

### 2.51. Sample Input 24

```
1000000030
```

### 2.52. Sample Output 24

```
23
```

### 2.53. Sample Input 25

```
1000000031
```

### 2.54. Sample Output 25

```
24
```

### 2.55. Sample Input 26

```
1000000032
```

### 2.56. Sample Output 26

```
25
```

### 2.57. Sample Input 27

```
1000000033
```

### 2.58. Sample Output 27

```
26
```

### 2.59. Sample Input 28

```
1000000034
```

### 2.60. Sample Output 28

```
27
```

### 2.61. Sample Input 29

```
1000000035
```

### 2.62. Sample Output 29

```
28
```

### 2.63. Sample Input 30

```
1000000036
```

### 2.64. Sample Output 30

```
29
```

### 2.65. Sample Input 31

```
1000000037
```

### 2.66. Sample Output 31

```
30
```

### 2.67. Sample Input 32

```
1000
