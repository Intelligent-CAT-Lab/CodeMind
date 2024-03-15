import sys

result = 0

with open(sys.stdin, 'r') as reader:
    numDog = reader.readline().split()

    for i in range(len(numDog)):
        result += int(numDog[i])

print(result)