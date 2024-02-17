import math

n = input()
rent = 100000

for i in range(0, n):
  rent = math.ceil(rent*1.05/1000)*1000

print "%d"%rent