import sys

def push(stack, num):
    stack.append(num)

def pop(stack):
    if len(stack) == 0:
        return None
    else:
        return stack.pop()

def main():
    stack = []
    result = 0
    for i in range(len(sys.argv)):
        command = sys.argv[i]
        if command == 'R':
            result += 1
        elif command == 'L':
            result += 1
        else:
            result += 1
            push(stack, 0)
            for j in range(len(stack)):
                if stack[j] == 0:
                    stack.pop()
                    if len(stack) == 0:
                        stack = []
                        break
    print(result)

if __name__ == '__main__':
    main()