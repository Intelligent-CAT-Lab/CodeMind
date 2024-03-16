import sys

scList = []

for line in sys.stdin:
    scList.append(line.strip())

numlist = scList[0].split(" ")
Sheep = int(numlist[0])
Wolve = int(numlist[1])

if Wolve >= Sheep:
    print("unsafe")
else:
    print("safe")