s = input()
str = []
counter = 0
for i in range(len(s)):
    str.append(s[i])
for i in range(len(str)-1):
    if str[i] != str[i+1]:
        counter += 1
print(counter)