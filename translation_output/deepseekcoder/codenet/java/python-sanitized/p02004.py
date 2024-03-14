import sys

def main():
    # Read the input string
    str = sys.stdin.readline().strip()

    # Initialize direction and result
    dir = 0
    result = 0

    # Initialize the stack
    stack = [0]

    for command in str:
        # Update the direction
        if command == 'R':
            dir = (dir + 1) % 4
        else:
            dir = (dir + 3) % 4

        # Update the stack
        if dir == 0:
            if not stack:
                stack = [0]
        else:
            if command == 'L':
                if stack:
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