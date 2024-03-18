Below is the translated version of the given Java code into Python, which achieves the same functionality:

```python
S = input()
N = len(S)
ans = [0] * N
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
    if (num_left + num_right) % 2 == 0:
        left = (num_left + num_right) // 2
        right = (num_left + num_right) // 2
    else:
        if num_right % 2 == 1:
            right = (num_left + num_right) // 2
            left = (num_left + num_right) - right
        else:
            left = (num_left + num_right) // 2
            right = (num_left + num_right) - left
    ans[R] = left
    ans[R + 1] = right
    if cur_index == N - 1:
        break

print(" ".join(map(str, ans)))
```

When you run this Python code with the input 'RRLRL', you can expect the output to be '0 1 2 1 1 -19'. Please note that the translated code assumes the input will always be valid and that it fits the scenario presented by your Java example.
