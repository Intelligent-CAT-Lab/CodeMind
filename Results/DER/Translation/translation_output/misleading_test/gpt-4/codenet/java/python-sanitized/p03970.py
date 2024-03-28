# Read input from the user
S = input().strip()
correct = "CODEFESTIVAL2016"
num = 0

# Compare each character
for i in range(16):
    if S[i] != correct[i]:
        num += 1

# Output the result
print(num)