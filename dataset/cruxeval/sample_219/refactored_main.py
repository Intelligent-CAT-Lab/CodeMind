s1 = "Hello"
s2 = ")"
for k in range(0, len(s2)+len(s1)):
    s1 += s1[0]
    if s1.find(s2) >= 0:
        print(True)
        break
else:
    print(False)