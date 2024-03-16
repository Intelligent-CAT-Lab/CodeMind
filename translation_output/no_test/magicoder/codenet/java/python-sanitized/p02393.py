import sys

def main():
    strNum = sys.stdin.readline().strip()
    strNumList = strNum.split(" ")
    
    strNumList.sort()
    
    intNumSmall = int(strNumList[0])
    intNumMiddle = int(strNumList[1])
    intNumLarge = int(strNumList[2])
    
    print(intNumSmall, intNumMiddle, intNumLarge)

if __name__ == "__main__":
    main()