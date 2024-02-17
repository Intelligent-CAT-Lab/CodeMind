s = "abca dea ead"
count = 0
for c in s:
    if s.rindex(c) != s.index(c):
        count+=1
print(count)