import sys

def main():
    str = sys.stdin.readline().strip()
    dir = 0
    stack = [0]
    result = 0

    for command in str:
        if command == 'R':
            dir = (dir + 1) % 4
        else:
            dir = (dir + 3) % 4

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
                    stack = [0]

    print(result)

if __name__ == "__main__":
    main()