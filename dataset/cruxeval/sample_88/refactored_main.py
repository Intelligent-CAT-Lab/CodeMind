s1 = "he"
s2 = "hello"
if s2.endswith(s1):
    s2 = s2[:len(s1) * -1]
print(s2)