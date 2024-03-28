s = input()
length = len(s)
count = 0
for i in range(length//2):
    if s[i] != s[length-1-i]:
        count += 1
print(count)