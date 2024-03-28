import sys

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

    def open_bracket():
        elements.pop()

    undo = []
    old_states = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-':
            old_states.append((depth, ans))
        if s[i] == '(':
            depth += 1
            elements.append(0)
            undo.append(open_bracket)
        elif s[i] == ')':
            depth -= 1
            elements_before.append(elements.pop())
            if depth < 0:
                depth = 0
                elements.append(0)
                undo.append(invalid_undo)
            else:
                elements.append(elements[-1] + 1)
                undo.append(valid_undo)

            delta = elements[-1]
            ans += delta
        else:
            state = old_states.pop()
            ans = state[1]
            depth = state[0]
            undo.pop()()
        print(ans)

if __name__ == "__main__":
    main()



- '(': Increase the depth and push 0 onto the elements stack.
- ')': Decrease the depth, push the result onto the elements stack, and push the corresponding undo operation.
- '-': Undo the last operation.