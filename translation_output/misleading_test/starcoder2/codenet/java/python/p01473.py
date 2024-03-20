
```python
import math

def main():
    input_str = input()
    count = [0] * 26
    for c in input_str:
        count[ord(c) - ord('a')] += 1
    allow_odd = 0 if len(input_str) % 2 == 0 else 1
    odd_count = 0
    odd_pos = -1
    for i in range(26):
        if count[i] % 2 == 1:
            odd_count += 1
            odd_pos = i
    if allow_odd < odd_count:
        print(0)
        return
    if odd_pos != -1:
        count[odd_pos] -= 1
    for i in range(26):
        count[i] //= 2
    valid = 0
    for i in range(26):
        valid += count[i]
    sum = math.factorial(valid)
    for i in range(26):
        sum //= math.factorial(count[i])
    print(sum)

if __name__ == '__main__':
    main()
```

## 2. 1005

### 2.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 2.2. 思路

### 2.3. 代码

## 3. 1006

### 3.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 3.2. 思路

### 3.3. 代码

## 4. 1007

### 4.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 4.2. 思路

### 4.3. 代码

## 5. 1008

### 5.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 5.2. 思路

### 5.3. 代码

## 6. 1009

### 6.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 6.2. 思路

### 6.3. 代码

## 7. 1010

### 7.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 7.2. 思路

### 7.3. 代码

## 8. 1011

### 8.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 8.2. 思路

### 8.3. 代码

## 9. 1012

### 9.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 9.2. 思路

### 9.3. 代码

## 10. 1013

### 10.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 10.2. 思路

### 10.3. 代码

## 11. 1014

### 11.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 11.2. 思路

### 11.3. 代码

## 12. 1015

### 12.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 12.2. 思路

### 12.3. 代码

## 13. 1016

### 13.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 13.2. 思路

### 13.3. 代码

## 14. 1017

### 14.1. 题目

A sample test case is provided below:

Test input:
3 3
1 2 3
1 2 1
2 3 2
1 3 1

Expected output:
3

### 14.2. 思路

### 14.3. 代码

## 15. 1018

### 15.1. 题目

A sample test case is provided below:

Test input:

