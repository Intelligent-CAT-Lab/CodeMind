Here is the Python version of the Java code:

```python
def main():
    S = input()
    N = len(S)
    ans = [0]*N
    cur_index = 0
    while cur_index < N:
        num_left = 0
        num_right = 0
        while cur_index < N and S[cur_index] == 'R':
            num_right += 1
            cur_index += 1
        R = cur_index - 1
        while cur_index < N and S[cur_index] == 'L':
            num_left += 1
            cur_index += 1
        left = num_left
        right = num_right
        if (left + right) % 2 == 0:
            sum = left + right
            left = sum // 2
            right = sum // 2
        else:
            sum = left + right
            if right % 2 == 1:
                right = sum // 2
                left = sum - right
            else:
                left = sum // 2
                right = sum - left
        ans[R] = left
        ans[R + 1] = right
        if cur_index == N - 1:
            break
    print(' '.join(map(str, ans)))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, calculates the number of 'R's and 'L's in the string, and then calculates the number of children that will move to each square. The results are stored in a list, and then printed out.
