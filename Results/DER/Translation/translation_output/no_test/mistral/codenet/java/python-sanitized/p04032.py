import sys

def main():
    cin = sys.stdin
    line = input()
    for i in range(len(line)):
        if line[i] == line[i+1]:
            resultNum1 = i+1
            resultNum2 = i+2
            break
        elif line[i] == line[i+2]:
            resultNum1 = i+1
            resultNum2 = i+3
            break
    print(resultNum1, resultNum2)

if __name__ == "__main__":
    main()