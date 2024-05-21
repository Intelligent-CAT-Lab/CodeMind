import re

line = input().replace("egg", "e").replace("chicken", "c")
line = re.sub(r"ee", "e e", line)
line = re.sub(r"cc", "c c", line)
strs = line.split()
max_len = max(len(s) for s in strs)
max_count = max(strs.count(s) for s in strs if len(s) == max_len)
ans = "egg" if max_count > len(strs) // 2 else "chicken"
print(ans)