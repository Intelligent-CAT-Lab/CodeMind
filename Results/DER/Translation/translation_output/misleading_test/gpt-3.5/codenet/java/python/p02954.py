```python
def main():
    S = input()
    N = len(S)
    ans = [0] * N
    curIndex = 0
    while curIndex < N:
        numLeft = 0
        numRight = 0
        while S[curIndex] == 'R':
            numRight += 1
            curIndex += 1
            if curIndex == N:
                break
        R = curIndex - 1
        while S[curIndex] == 'L':
            numLeft += 1
            curIndex += 1
            if curIndex == N:
                break
        left = numLeft
        right = numRight
        if (left + right) % 2 == 0:
            sum_nums = left + right
            left = sum_nums // 2
            right = sum_nums // 2
        else:
            sum_nums = left + right
            if right % 2 == 1:
                right = sum_nums // 2
                left = sum_nums - right
            else:
                left = sum_nums // 2
                right = sum_nums - left
        ans[R] = left
        ans[R + 1] = right
        if curIndex == N - 1:
            break
    for num in ans:
        print(num, end=' ')

if __name__ == "__main__":
    main()
```
Test input:
RRLRL

Expected output:
0 1 2 1 1 -19
```
