import sys

class p00986:
    def main(self):
        s = input().strip()
        n = len(s)

        elements = []
        elements.append(0)
        elements_before = []

        def VALID_UNDO():
            elements.pop()
            elements.append(elements_before.pop())

        def INVALID_UNDO():
            elements.pop()
            elements.append(elements_before.pop())

        def OPEN():
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

                delta = elements[-1]
                ans += delta
            else:
                state = old_states.pop()
                ans = state.ans
                depth = state.depth
                undo.pop()()
            print(ans)

    class OldState:
        def __init__(self, depth, ans):
            self.depth = depth
            self.ans = ans

if __name__ == "__main__":
    p00986().main()