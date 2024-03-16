import sys

result = 0

for line in sys.stdin:
    numDog = line.split()
    for num in numDog:
        result += int(num)

print(result)