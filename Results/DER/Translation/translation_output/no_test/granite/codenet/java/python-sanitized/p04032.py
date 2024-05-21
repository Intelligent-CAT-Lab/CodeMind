import sys

for line in sys.stdin:
    strArray = list(line.strip())
    resultNum1 = -1
    resultNum2 = -1

    for i in range(len(strArray) - 1):
        if strArray[i] == strArray[i + 1]:
            resultNum1 = i + 1
            resultNum2 = i + 2
            break

        if i + 2 < len(strArray) and strArray[i] == strArray[i + 2]:
            resultNum1 = i + 1
            resultNum2 = i + 3
            break

    print(resultNum1, resultNum2)