class main:
    import sys
    
    def main():
        str = sys.stdin.readline().strip()
        dir = 0
        stack = [0]
        result = 0
        for i in str:
            if i == 'R':
                dir += 1
            else:
                dir += 3
            dir %= 4
            if dir == 0 and len(stack) == 0:
                stack = [0]
            elif len(stack)!= 0:
                if i == 'L':
                    stack.pop()
                    if len(stack) == 0:
                        stack = []
                else:
                    stack.append(0)
                    if len(stack) == 5:
                        result += 1
                        stack = [0]
        print(result)
    
    if __name__ == '__main__':
        main()