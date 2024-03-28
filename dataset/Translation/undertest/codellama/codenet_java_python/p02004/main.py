import sys

def main():
    # Read the input string
    str = sys.stdin.readline().strip()

    # Initialize the direction and stack
    dir = 0
    stack = [0]

    # Iterate through the input string
    for command in str:
        # Update the direction based on the command
        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        # If the direction is 0 and the stack is empty, create a new stack
        if dir == 0 and not stack:
            stack = [0]

        # If the stack is not empty, perform the appropriate action based on the command
        if stack:
            if command == 'L':
                stack.pop()
                if not stack:
                    stack = [0]
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack.clear()
                    stack.append(0)

    # Print the result
    print(result)

if __name__ == '__main__':
    main()