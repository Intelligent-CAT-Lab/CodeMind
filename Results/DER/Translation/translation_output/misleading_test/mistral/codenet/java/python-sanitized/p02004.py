import sys

def push(stack, dir):
    stack.append(dir)

def pop(stack):
    return stack.pop()

def main():
    stack = []
    result = 0
    for i in range(len(sys.argv)):
        command = sys.argv[i]
        if command == 'R':
            dir = 1
        else:
            dir = 4
        dir = (dir + 3) % 4
        if dir == 0 and stack == []:
            stack = [0]
        elif stack != []:
            if command == 'L':
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