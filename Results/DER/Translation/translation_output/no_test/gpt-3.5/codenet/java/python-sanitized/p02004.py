class p02004:

    def main(self):
        stack = [0]
        result = 0
        dir = 0

        str_input = input()

        for command in str_input:
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
                    if len(stack) == 0:
                        stack = None
                else:
                    stack.append(0)
                    if len(stack) == 5:
                        result += 1
                        stack = [0]

        print(result)

# Initialization
obj = p02004()
obj.main()