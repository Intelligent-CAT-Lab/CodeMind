import sys

correct = "CODEFESTIVAL2016"
num = 0
for i in range(16):
    if sys.stdin.readline().strip()!= correct[i]:
        num += 1
print(num)