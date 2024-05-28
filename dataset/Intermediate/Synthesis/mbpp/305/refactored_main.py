words = ["Python PHP", "Java JavaScript", "c c++"]
for w in words:
    m = re.match("(P\w+)\W(P\w+)", w)
    if m:
        print(m.groups())