import re

s = input()
s = re.sub("eraser|-", "", s)
s = re.sub("erase|-", "", s)
s = re.sub("dreamer|-", "", s)
s = re.sub("dream|-", "", s)

if len(s) == 0:
    print("YES")
else:
    print("NO")