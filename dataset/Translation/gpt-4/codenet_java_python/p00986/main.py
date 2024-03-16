class OldState:
    def __init__(self, depth, ans):
        self.depth = depth
        self.ans = ans

def main():
    s = input()
    n = len(s)

    elements = [0]
    elements_before = []

    def valid_undo():
        elements.append(elements.pop() - 1)
        elements.append(elements_before.pop())

    def invalid_undo():
        elements.pop()
        elements.append(elements_before.pop())

    def open():
        elements.pop()

    undo = []
    old_states = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-':
            old_states.append(OldState(depth, ans))
        if s[i] == '(':
            depth += 1
            elements.append(0)
            undo.append(open)
        elif s[i] == ')':
            depth -= 1
            elements_before.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(invalid_undo)
            else:
                elements.append(elements.pop() + 1)
                undo.append(valid_undo)

            delta = elements[-1]
            ans += delta
        else:
            state = old_states.pop()
            ans = state.ans
            depth = state.depth
            undo.pop()()

        print(ans)

if __name__ == "__main__":
    main()