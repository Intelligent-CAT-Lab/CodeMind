import sys

def main():
    for line in sys.stdin:
        strArray = line.split()
        resultNum1 = -1
        resultNum2 = -1
        for i in range(len(strArray)):
            if i + 1 < len(strArray) and strArray[i] == strArray[i + 1]:
                resultNum1 = i + 1
                resultNum2 = i + 2
                break
            elif i + 2 < len(strArray) and strArray[i] == strArray[i + 2]:
                resultNum1 = i + 1
                resultNum2 = i + 3
                break
        print(resultNum1, resultNum2)

if __name__ == "__main__":
    main()