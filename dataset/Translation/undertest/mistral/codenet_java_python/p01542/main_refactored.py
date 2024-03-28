class main:
    import sys
    
    def calc(s):
        stack = []
        for c in s:
            if c == '(':
                stack.append(c)
            elif c == ')':
                if not stack or stack.pop() != '(':
                    return -1
            elif c in '0123456789':
                stack.append(c)
            elif c in '+-*/':
                b = stack.pop()
                a = stack.pop()
                if c == '+':
                    stack.append(a + b)
                elif c == '-':
                    stack.append(a - b)
                elif c == '*':
                    stack.append(a * b)
                elif c == '/':
                    stack.append(a / b)
        return stack[0] if stack else -1
    
    def dfs(s, i):
        if i == len(s):
            return max(calc(s), 0)
        if s[i] == '.':
            return max(dfs(s, i + 1) for c in ['0', '1', '+', '-', '*', '(', ')'])
        else:
            return max(dfs(s, i + 1), dfs(s, i + 1))
    
    def solve(s):
        s += '$'
        cs = list(s)
        max = -1
        dfs(cs, 0)
        return max
    
    if __name__ == '__main__':
        s = input()
        print(solve(s))