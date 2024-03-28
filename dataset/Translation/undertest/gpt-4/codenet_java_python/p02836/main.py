s = input()
length = len(s)

count = 0
for i in range(length // 2):
    a = s[i]
    b = s[length - 1 - i]
    if a != b:
        count += 1

# Uncomment to print the pairs that were compared
#         print(str(a) + str(b))

print(count)