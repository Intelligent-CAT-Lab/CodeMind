class main:
    # Test input:
    # RRRRLLLLRRRR
    
    # Expected output:
    # 2
    
    def count_circles(commands):
        # Initialize direction to North
        dir = 0
    
        # Initialize stack to track rotations
        stack = [0]
        result = 0
    
        for command in commands:
            # Calculate direction based on command
            if command == 'R':
                dir += 1
            else:
                dir += 3
            dir %= 4
    
            # When facing North, create a new stack if necessary
            if dir == 0 and not stack:
                stack = [0]
            elif stack:
                if command == 'L':
                    stack.pop()
                    if len(stack) == 0:
                        stack = []
                else:
                    stack.append(0)
                    if len(stack) == 5:
                        result += 1
                        stack.clear()
                        stack.append(0)
        return result
    
    # Test the function with the provided input
    test_input = "RRRRLLLLRRRR"
    print(count_circles(test_input))