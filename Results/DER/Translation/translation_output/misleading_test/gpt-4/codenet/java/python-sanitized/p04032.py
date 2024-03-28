while True:
    try:
        line = input()

        resultNum1 = -1
        resultNum2 = -1

        for i in range(len(line)):

            if i + 1 < len(line) and line[i] == line[i + 1]:
                resultNum1 = i + 1
                resultNum2 = i + 2
                break

            if i + 2 < len(line) and line[i] == line[i + 2]:
                resultNum1 = i + 1
                resultNum2 = i + 3
                break
            
        print(resultNum1, resultNum2)

    except EOFError:
        break