while True:
    try:
        line = input()

        # Python has no character type, so there's no need to split into an array of length 1
        # Instead, we use line directly to access characters
        result_num1 = -1
        result_num2 = -1

        for i in range(len(line)):
            if i + 1 <= len(line) - 1 and line[i] == line[i + 1]:
                result_num1 = i + 1
                result_num2 = i + 2
                break

            if i + 2 <= len(line) - 1 and line[i] == line[i + 2]:
                result_num1 = i + 1
                result_num2 = i + 3
                break

        print(result_num1, result_num2)
    except EOFError:
        break