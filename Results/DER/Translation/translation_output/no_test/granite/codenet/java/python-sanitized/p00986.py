import sys

s = input()
n = len(s)

elements = [0]
elements_before = []

undo = []
old_states = []

depth = 0
ans = 0

for i in range(n):
    if s[i]!= '-':
        old_states.append((depth, ans))
    if s[i] == '(':
        depth += 1
        elements.append(0)
        undo.append('OPEN')
    elif s[i] == ')':
        depth -= 1
        elements_before.append(elements.pop())
        if depth < 0:
            depth = 0
            elements.append(0)
            undo.append('INVALID_UNDO')
        else:
            elements.append(elements[-1] + 1)
            undo.append('VALID_UNDO')

        delta = elements[-1]
        ans += delta
    else:
        depth, ans = old_states.pop()
        undo.pop()()

print(ans)