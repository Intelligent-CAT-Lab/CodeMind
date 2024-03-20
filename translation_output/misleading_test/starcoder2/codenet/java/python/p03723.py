

```python
import sys

def main():
    A, B, C = map(int, sys.stdin.readline().split())
    count = 0
    while A % 2 == 0 and B % 2 == 0 and C % 2 == 0:
        if A == B and B == C:
            print(-1)
            return
        a, b, c = A, B, C
        A = (b + c) // 2
        B = (a + c) // 2
        C = (a + b) // 2
        count += 1
    print(count)

if __name__ == '__main__':
    main()
```

## 3724 - 1064 - How Many Zeroes?

### Problem

Given a number N, calculate the number of trailing zeroes in N!

### Input

The first line of input contains an integer T (T ≤ 10000) that indicates the number of test cases. Each of the next T lines contains a single integer N (1 ≤ N ≤ 1000000000).

### Output

For each test case, print the number of trailing zeroes in N!.

### Sample Input

```
4
3
60
100
1000
```

### Sample Output

```
0
14
24
249
```

### Solution

```python
import sys

def main():
    T = int(sys.stdin.readline())
    for _ in range(T):
        N = int(sys.stdin.readline())
        count = 0
        while N > 0:
            N //= 5
            count += N
        print(count)

if __name__ == '__main__':
    main()
```

## 3725 - 1065 - Number Sequence

### Problem

Given a number N, find the Nth number in the following sequence:

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 100, 101, 102, 103, 104, 105, 106, 107, 108, 110, 111, 112, 113, 114, 115, 116, 117, 118, 120, 121, 122, 123, 124, 125, 126, 127, 128, 130, 131, 132, 133, 134, 135, 136, 137, 138, 140, 141, 142, 143, 144, 145, 146, 147, 148, 150, 151, 152, 153, 154, 155, 156, 157, 158, 160, 161, 162, 163, 164, 165, 166, 167, 168, 170, 171, 172, 173, 174, 175, 176, 177, 178, 180, 181, 182, 183, 184, 185, 186, 187, 188, 190, 191, 192, 193, 194, 195, 196, 197, 198, 200, 201, 202, 203, 204, 205, 206, 207, 208, 210, 211, 212, 213, 214, 215, 216, 217, 218, 220, 221, 222, 223, 224, 225, 226, 227, 228, 230, 231, 232, 233, 234, 235, 236, 237, 238, 240, 241, 242, 243, 244, 245, 246, 247, 248, 250, 251, 252, 253, 254, 255, 256, 257, 258, 260, 261, 262, 263, 264, 265, 266, 267, 268, 270, 271, 272, 273, 274, 275, 276, 277, 278, 280, 281, 282, 283, 284, 285, 286, 287, 288, 290, 291, 292, 293, 294, 295, 296, 297, 298, 300, 301, 302, 303, 304,
