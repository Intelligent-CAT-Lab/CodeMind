import sys

def main():
    str = sys.stdin.readline()
    dir = 0
    stack = []
    stack.append(0)
    result = 0

    for i in range(len(str)):
        command = str[i]

        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        if dir == 0 and len(stack) == 0:
            stack = []
            stack.append(0)
        elif len(stack) != 0:
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = None
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = []
                    stack.append(0)

    print(result)

if __name__ == '__main__':
    main()