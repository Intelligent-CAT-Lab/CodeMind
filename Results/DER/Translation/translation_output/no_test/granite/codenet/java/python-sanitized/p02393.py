import sys

strNum = sys.stdin.readline()
strNumList = strNum.split(" ")

strNumList.sort()

intNumSmall = int(strNumList[0])
intNumMiddle = int(strNumList[1])
intNumlarge = int(strNumList[2])

print(intNumSmall, intNumMiddle, intNumlarge)