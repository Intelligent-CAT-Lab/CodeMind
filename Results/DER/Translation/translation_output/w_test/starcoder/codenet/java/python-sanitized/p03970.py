import sys

S = sys.stdin.readline().strip()
correct = "CODEFESTIVAL2016"
num = 0
for i in range(16):
	if S[i]!= correct[i]:
		num += 1
print(num)