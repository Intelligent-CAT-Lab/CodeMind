from collections import deque

X = input()
stack = deque([X[0]])
for i in range(1, len(X)):
    if X[i] == 'S':
        stack.appendleft(X[i])

    if X[i] == 'T':
        if stack:
            check = stack.popleft()
            if check == 'T':
                stack.appendleft(check)
                stack.appendleft(X[i])
        else:
            stack.appendleft(X[i])

print(len(stack))
