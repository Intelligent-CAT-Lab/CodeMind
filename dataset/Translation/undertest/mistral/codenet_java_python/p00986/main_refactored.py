class main:
    import sys
    
    def run(s):
        n = len(s)
        elements = [0]
        elementsBefore = []
    
        def valid_undo():
            elements.append(elements.pop() - 1)
            elements.append(elementsBefore.pop())
    
        def invalid_undo():
            elements.pop()
            elements.append(elementsBefore.pop())
    
        def open():
            elements.pop()
    
        undo = []
        old_states = []
    
        depth = 0
        ans = 0
    
        for i in range(n):
            if s[i] != '-':
                old_states.append(depth, ans)
            if s[i] == '(':
                depth += 1
                elements.append(0)
                undo.append(open)
            elif s[i] == ')':
                depth -= 1
                elementsBefore.append(elements.pop())
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
                old_state = old_states.pop()
                ans = old_state[1]
                depth = old_state[0]
                undo[-1]()
    
        for _ in range(n):
            print(ans)
            if len(undo) > 0:
                undo[-1]()
            else:
                break
    
    if __name__ == '__main__':
        s = sys.stdin.readline().strip()
        run(s)