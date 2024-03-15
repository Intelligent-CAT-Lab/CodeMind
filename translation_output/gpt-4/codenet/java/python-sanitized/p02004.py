from collections import deque

def main():
    str_input = input()

    # 0 is considered North
    dir = 0
    # Use a deque to determine if a full rotation has been made
    # Push with 'R', pop with 'L'
    # If size is 5, then a full rotation is completed, if 0 then the rotation failed
    stack = deque([0])
    result = 0

    for command in str_input:

        # Calculate direction based on the command
        if command == 'R':
            dir += 1
        else:
            dir += 3
        dir %= 4

        # When facing North
        # This is the starting point for the rotation so create a stack
        if dir == 0 and not stack:
            stack = deque([0])
        elif stack:
            # Left rotation
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = deque()
            # Right rotation
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack.clear()
                    stack.append(0)

    print(result)

if __name__ == "__main__":
    main()