class main:
    from collections import deque
    
    def p02263():
        stack = deque()
        line = input()
        for s in line.split():
            if s == "+":
                stack.append(stack.popleft() + stack.popleft())
            elif s == "-":
                first = stack.popleft()
                second = stack.popleft()
                stack.append(second - first)
            elif s == "*":
                stack.append(stack.popleft() * stack.popleft())
            else:
                stack.append(int(s))
        return stack.popleft()
    
    if __name__ == "__main__":
        p02263()