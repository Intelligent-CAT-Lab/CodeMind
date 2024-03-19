import sys

def main():
    moves = sys.stdin.readline().strip()
    dir = 0
    stack = [0]
    result = 0

    for command in moves:
        if command == 'R':
            dir = (dir + 1) % 4
        else:
            dir = (dir + 3) % 4

        if dir == 0:
            if not stack:
                stack = [0]
            elif len(stack) < 5:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = [0]

        elif stack:
            if command == 'L':
                stack.pop()
                if not stack:
                    stack = None
            elif stack and len(stack) < 5:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = [0]

    print(result)

if __name__ == "__main__":
    main()