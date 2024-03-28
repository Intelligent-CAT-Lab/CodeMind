import sys
from collections import deque

def main():
    s = sys.stdin.readline().strip()
    n = len(s)

    elements = deque([0])
    elements_before = deque()

    undo = deque()
    old_states = deque()

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-':
            old_states.append((depth, ans))

        if s[i] == '(':
            depth += 1
            elements.pop()
            undo.append(OPEN)
        elif s[i] == ')':
            depth -= 1
            elements_before.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(INVALID_UNDO)
            else:
                elements.append(elements.pop() + 1)
                undo.append(VALID_UNDO)

            delta = elements.peek()
            ans += delta
        else:
            state = old_states.pop()
            ans = state[1]
            depth = state[0]
            undo.pop().run()

        print(ans)

if __name__ == '__main__':
    main()