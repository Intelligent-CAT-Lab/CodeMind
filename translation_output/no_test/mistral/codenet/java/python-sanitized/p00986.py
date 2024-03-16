import sys

class OldState:
    def __init__(self, depth, ans):
        self.depth = depth
        self.ans = ans

def p00986():
    s = sys.stdin.readline().strip()
    n = len(s)

    stack_elements = [0]
    stack_elements_before = []

    def valid_undo():
        stack_elements.append(stack_elements.pop() - 1)
        stack_elements.append(stack_elements_before.pop())

    def invalid_undo():
        stack_elements.pop()
        stack_elements.append(stack_elements_before.pop())

    def open():
        stack_elements.pop()

    stack_undo = []
    stack_old_states = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-':
            stack_old_states.append(OldState(depth, ans))
        if s[i] == '(':
            depth += 1
            stack_elements.append(0)
            stack_undo.append(open)
        elif s[i] == ')':
            depth -= 1
            stack_elements_before.append(stack_elements.pop())
            if depth < 0:
                depth = 0
                stack_elements.append(0)
                stack_undo.append(invalid_undo)
            else:
                stack_elements.append(stack_elements.pop() + 1)
                stack_undo.append(valid_undo)

                delta = stack_elements[-1]
                ans += delta
        else:
            old_state = stack_old_states.pop()
            ans = old_state.ans
            depth = old_state.depth
            stack_undo.pop().__call__()

    print(ans)

if __name__ == '__main__':
    p00986()