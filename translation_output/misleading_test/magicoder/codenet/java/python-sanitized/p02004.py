def main():
    str = input()
    dir = 0
    stack = [0]
    result = 0

    for command in str:
        if command == 'R':
            dir = (dir + 1) % 4
        else:
            dir = (dir + 3) % 4

        if dir == 0 and len(stack) == 0:
            stack = [0]
        elif len(stack) != 0:
            if command == 'L':
                stack.pop()
                if len(stack) == 0:
                    stack = []
            else:
                stack.append(0)
                if len(stack) == 5:
                    result += 1
                    stack = [0]

    print(result)

if __name__ == "__main__":
    main()