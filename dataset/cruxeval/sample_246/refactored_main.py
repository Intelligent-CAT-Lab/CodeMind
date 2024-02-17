haystack = "345gerghjehg"
needle = "345"
for i in range(haystack.find(needle), -1, -1):
    if haystack[i:] == needle:
        print(i)
        break
else:
    print(-1)