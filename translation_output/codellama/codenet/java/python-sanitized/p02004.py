import sys

def main():
    sc = sys.stdin.readline().strip()
    dir = 0
    stack = [0]
    result = 0

    for command in sc:
        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        if dir == 0 and not stack:
            stack = [0]
        elif stack:
            if command == 'L':
                stack.pop()
                if not stack:
                    stack = None
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack.clear()
                    stack.append(0)

    print(result)

if __name__ == '__main__':
    main()