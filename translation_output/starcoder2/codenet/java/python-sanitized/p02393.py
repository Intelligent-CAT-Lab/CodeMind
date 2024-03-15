import sys

strNum = sys.stdin.readline()
strNumList = strNum.split(" ")

strNumList.sort()

print(strNumList[0] + " " + strNumList[1] + " " + strNumList[2])