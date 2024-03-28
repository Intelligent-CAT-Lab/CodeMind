import sys

class OldState:
    def __init__(self, depth, ans):
        self.depth = depth
        self.ans = ans

def VALID_UNDO(elements, elementsBefore):
    elements.append(elements.pop() - 1)
    elements.append(elementsBefore.pop())

def INVALID_UNDO(elements, elementsBefore):
    elements.pop()
    elements.append(elementsBefore.pop())

def OPEN(elements):
    elements.pop()

def main():
    s = list(sys.stdin.readline().strip())
    n = len(s)

    elements = [0]
    elementsBefore = []

    undo = []
    oldStates = []

    depth = 0
    ans = 0

    for i in range(n):
        if s[i] != '-': oldStates.append(OldState(depth, ans))
        if s[i] == '(':
            depth += 1
            elements.append(0)
        elif s[i] == ')':
            depth -= 1
            elementsBefore.append(elements.pop())
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
            state = oldStates.pop()
            ans = state.ans
            depth = state.depth
            undo.pop()(elements, elementsBefore)
        print(ans)

if __name__ == "__main__":
    main()