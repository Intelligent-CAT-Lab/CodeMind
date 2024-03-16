import sys

scList = []

scList.append(input())

numlist = scList[0].split(" ")
Sheep = int(numlist[0])
Wolve = int(numlist[1])

if Wolve >= Sheep:
    print("unsafe")
else:
    print("safe")