class main:
    class p02004:
        def main(self, input_str):
            dir = 0
            stack = [0]
            result = 0
    
            for command in input_str:
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
                            stack = [0]
    
            return result
    
    # Test Input
    input_str = "RRRRLLLLRRRR"
    solution = p02004()
    output = solution.main(input_str)
    print(output)  # Output: 2