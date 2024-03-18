def calculate_full_turns(commands: str) -> int:
    dir = 0
    stack = [0]
    result = 0

    for command in commands:
        dir = (dir + (1 if command == 'R' else 3)) % 4
        if dir == 0 and stack is None:
            stack = [0]
        elif stack is not None:
            if command == 'L':
                stack.pop()
                if not stack:
                    stack = None
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = [0]
    return result

# Sample test case
test_input = "RRRRLLLLRRRR"
expected_output = 85
output = calculate_full_turns(test_input)
print(output)  # This should print 85