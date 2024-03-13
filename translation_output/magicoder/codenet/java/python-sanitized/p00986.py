import sys

class OldState:
    def __init__(self, depth, ans):
        self.depth = depth
        self.ans = ans

def main():
    s = sys.stdin.readline().strip()
    n = len(s)

    elements = [0]
    elements_before = []

    VALID_UNDO = lambda: (elements.pop() - 1, elements_before.pop())
    INVALID_UNDO = lambda: (elements.pop(), elements_before.pop())
    OPEN = lambda: elements.pop()

    undo = []
    old_states = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-': old_states.append(OldState(depth, ans))
        if s[i] == '(':
            depth += 1
            elements.append(0)
            undo.append(OPEN)
        elif s[i] == ')':
            depth -= 1
            elements_before.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(INVALID_UNDO)
            else:
                elements.append(elements[-1] + 1)
                undo.append(VALID_UNDO)

            delta =  elements[-1]
            ans += delta
        else:
            state = old_states.pop()
            ans = state.ans
            depth = state.depth
            undo.pop()()
        print(ans)

if __name__ == "__main__":
    main()