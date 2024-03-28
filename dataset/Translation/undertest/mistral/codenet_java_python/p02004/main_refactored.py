class main:
    import sys
    
    def push(stack, dir):
        stack.append(dir)
    
    def pop(stack):
        return stack.pop()
    
    def check(stack):
        if len(stack) == 0:
            return False
        else:
            return stack[-1]
    
    def solution(input):
        stack = []
        result = 0
        for i in range(len(input)):
            command = input[i]
            if command == 'R':
                push(stack, 0)
            elif command == 'L':
                result += 1
                push(stack, check(stack))
            else:
                push(stack, 3)
                result += 1
        return result
    
    input = sys.stdin.readline().strip()
    print(solution(input))