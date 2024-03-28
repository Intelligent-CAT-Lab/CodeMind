import sys

n = int(input())

for i in range(n):
    line = input().split()
    resultNum1 = -1
    resultNum2 = -1

    for j in range(len(line)):
        if j + 1 < len(line) - 1 and line[j] == line[j + 1]:
            resultNum1 = j + 1
            resultNum2 = j + 2
            break

        if j + 2 < len(line) - 1 and line[j] == line[j + 2]:
            resultNum1 = j + 1
            resultNum2 = j + 3
            break

    print(resultNum1, resultNum2)