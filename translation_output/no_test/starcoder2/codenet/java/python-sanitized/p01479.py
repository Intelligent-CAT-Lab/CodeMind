import re

line = input().replace("egg", "e").replace("chicken", "c")
line = re.sub(r"ee", "e e", line)
line = re.sub(r"cc", "c c", line)
strs = line.split(" ")
max = 0
ans = ""
for i in range(len(strs)):
    if max < len(strs[i]):
        max = len(strs[i])
        ans = "egg" if strs[i][max - 1] == 'e' else "chicken"
print(ans)