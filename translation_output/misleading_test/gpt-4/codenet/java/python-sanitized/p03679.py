# Input reading section
line = input()

# Data conversion 
tmpArray = line.split(" ")

overLimit = int(tmpArray[0])
prevDay = int(tmpArray[1])
overDay = int(tmpArray[2])

# Condition check
if prevDay >= overDay:
    print("delicious")
elif prevDay + overLimit < overDay:
    print("dangerous")
else:
    print("safe")